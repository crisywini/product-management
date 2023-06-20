package co.crisi.productmanagement.interactors.extract;

import co.crisi.productmanagement.boundaries.input.extract.ICommonProductExtractBoundary;
import co.crisi.productmanagement.boundaries.output.extract.ICommonProductExtractGateway;
import co.crisi.productmanagement.exceptions.ProductBusinessException;
import co.crisi.productmanagement.exceptions.ProductNotFoundException;
import co.crisi.productmanagement.model.response.CommonProductResponse;
import co.crisi.productmanagement.presenter.ICommonProductExtractPresenter;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommonProductExtractInteractor implements ICommonProductExtractBoundary {

    private final ICommonProductExtractPresenter presenter;

    private final ICommonProductExtractGateway gateway;

    @Override
    public CommonProductResponse getById(String id) throws ProductBusinessException {

        if (!gateway.existsById(id)) {
            return presenter.prepareFailView(
                    new ProductNotFoundException(String.format("The product with id: %s does not exists", id)));
        }

        var commonProduct = gateway.findById(id);

        var product = commonProduct.map(
                        cp -> new CommonProductResponse(cp.getId(), cp.getName(),
                                cp.getDescription(), cp.getPrice()))
                .orElseThrow();

        return presenter.prepareSuccessfulView(product);
    }

    @Override
    public List<CommonProductResponse> getAll() {
        return presenter.prepareSuccessfulView(gateway.getAll()
                .stream().map(cp -> new CommonProductResponse(cp.getId(), cp.getName(),
                        cp.getDescription(), cp.getPrice()))
                .toList());
    }

}
