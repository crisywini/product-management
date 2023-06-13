package co.crisi.productmanagement.interactors;

import co.crisi.productmanagement.boundaries.input.register.ICommonProductRegisterBoundary;
import co.crisi.productmanagement.boundaries.output.register.ICommonProductRegisterGateway;
import co.crisi.productmanagement.domain.IProduct;
import co.crisi.productmanagement.domain.factory.ICommonProductFactory;
import co.crisi.productmanagement.exceptions.ProductBusinessException;
import co.crisi.productmanagement.exceptions.InvalidNameException;
import co.crisi.productmanagement.exceptions.ProductAlreadySavedException;
import co.crisi.productmanagement.model.request.CommonProductRequest;
import co.crisi.productmanagement.model.response.CommonProductResponse;
import co.crisi.productmanagement.presenter.ICommonProductPresenter;

public class CommonProductInteractor implements ICommonProductRegisterBoundary {

    private ICommonProductPresenter presenter;

    private ICommonProductFactory factory;

    private ICommonProductRegisterGateway gateway;

    @Override
    public CommonProductResponse create(CommonProductRequest request) throws ProductBusinessException {
        if (gateway.existsById(request.id())) {
            return presenter.prepareFailView(new ProductAlreadySavedException(
                    String.format("Product with id %s already exists!", request.id())));
        }
        //TODO: Create the mapper
        IProduct product = factory.create(request.id(), request.name(), request.description(), request.price());
        if (!product.isNameValid()) {
            return presenter.prepareFailView(new InvalidNameException(
                    String.format("The product with name %s has an invalid name!", product.getName())));
        }

        gateway.save(product);
        //TODO: Create the mapper
        CommonProductResponse response = new CommonProductResponse(product.getId(), product.getName(),
                product.getDescription(), product.getPrice());
        return presenter.prepareSuccessfulView(response);
    }

}
