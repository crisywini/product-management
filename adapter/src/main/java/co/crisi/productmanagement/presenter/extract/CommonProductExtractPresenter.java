package co.crisi.productmanagement.presenter.extract;

import co.crisi.productmanagement.exceptions.ProductBusinessException;
import co.crisi.productmanagement.model.response.CommonProductResponse;
import co.crisi.productmanagement.presenter.ICommonProductExtractPresenter;
import java.util.List;

public class CommonProductExtractPresenter implements ICommonProductExtractPresenter {

    @Override
    public CommonProductResponse prepareSuccessfulView(CommonProductResponse response) {
        return response;
    }

    @Override
    public CommonProductResponse prepareFailView(ProductBusinessException exception) throws ProductBusinessException {
        throw exception;
    }

    @Override
    public List<CommonProductResponse> prepareSuccessfulView(List<CommonProductResponse> response) {
        return response;
    }

}
