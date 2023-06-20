package co.crisi.productmanagement.interactors.register;

import co.crisi.productmanagement.boundaries.input.register.ITechnicalProductRegisterBoundary;
import co.crisi.productmanagement.boundaries.output.register.ITechnicalProductRegisterGateway;
import co.crisi.productmanagement.domain.ITechnicalProduct;
import co.crisi.productmanagement.domain.factory.ITechnicalProductFactory;
import co.crisi.productmanagement.exceptions.InvalidNameException;
import co.crisi.productmanagement.exceptions.InvalidTechnicalInformationException;
import co.crisi.productmanagement.exceptions.ProductAlreadySavedException;
import co.crisi.productmanagement.exceptions.ProductBusinessException;
import co.crisi.productmanagement.model.request.register.TechnicalProductRequest;
import co.crisi.productmanagement.model.response.TechnicalProductResponse;
import co.crisi.productmanagement.presenter.ITechnicalProductPresenter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TechnicalProductInteractor implements ITechnicalProductRegisterBoundary {

    private ITechnicalProductPresenter presenter;

    private ITechnicalProductRegisterGateway gateway;

    private ITechnicalProductFactory factory;

    @Override
    public TechnicalProductResponse create(TechnicalProductRequest request) throws ProductBusinessException {

        if (gateway.existsById(request.id())) {
            return presenter.prepareFailView(
                    new ProductAlreadySavedException(String.format("The product %s already exists!", request.id())));
        }

        ITechnicalProduct product = factory.create(request.id(), request.name(), request.description(),
                request.price(),
                request.technicalInformation(), request.instructionManual());

        if (!product.isNameValid()) {
            return presenter.prepareFailView(new InvalidNameException(
                    String.format("The name %s of the product %s is not valid!", product.getName(), product.getId())));
        }

        if (!product.isTechnicalInformationValid()) {
            return presenter.prepareFailView(new InvalidTechnicalInformationException(
                    String.format("The technical information \' %s \' of the product %s is not valid",
                            product.getTechnicalInformation(), product.getId())));
        }

        gateway.save(product);

        TechnicalProductResponse response = new TechnicalProductResponse(product.getId(), product.getName(),
                product.getDescription(), product.getPrice(), product.getTechnicalInformation(),
                product.getInstructionManual());

        return presenter.prepareSuccessfulView(response);
    }

}
