package co.crisi.productmanagement.interactors.extract;

import co.crisi.productmanagement.boundaries.input.extract.ITechnicalProductExtractBoundary;
import co.crisi.productmanagement.boundaries.output.extract.ITechnicalProductExtractGateway;
import co.crisi.productmanagement.exceptions.ProductBusinessException;
import co.crisi.productmanagement.exceptions.ProductNotFoundException;
import co.crisi.productmanagement.model.response.TechnicalProductResponse;
import co.crisi.productmanagement.presenter.ITechnicalProductExtractPresenter;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
public class TechnicalProductExtractInteractor implements ITechnicalProductExtractBoundary {

    private final ITechnicalProductExtractGateway gateway;

    private final ITechnicalProductExtractPresenter presenter;

    @Override
    public TechnicalProductResponse getById(String id) throws ProductBusinessException {
        if (!gateway.existsById(id)) {
            return presenter.prepareFailVieW(
                    new ProductNotFoundException(String.format("Technical product with %s does not exists!", id)));
        }
        var technicalProduct = gateway.getById(id)
                .map(tp -> new TechnicalProductResponse(tp.id(), tp.name(), tp.description(), tp.price(),
                        tp.technicalInformation(), tp.instructionManual())).orElseThrow();

        return presenter.prepareSuccessfulView(technicalProduct);
    }

    @Override
    public List<TechnicalProductResponse> getAll() {
        return presenter.prepareSuccessfulView(gateway.getAll().stream()
                .map(tp -> new TechnicalProductResponse(tp.id(), tp.name(), tp.description(), tp.price(),
                        tp.technicalInformation(), tp.instructionManual()))
                .toList());
    }

}
