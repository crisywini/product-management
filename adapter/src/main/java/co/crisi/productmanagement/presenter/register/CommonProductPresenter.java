package co.crisi.productmanagement.presenter.register;

import co.crisi.productmanagement.exceptions.ProductBusinessException;
import co.crisi.productmanagement.model.response.CommonProductResponse;
import co.crisi.productmanagement.presenter.ICommonProductPresenter;

public class CommonProductPresenter implements ICommonProductPresenter {

    @Override
    public CommonProductResponse prepareSuccessfulView(CommonProductResponse response) {
        return response;
    }

    @Override
    public CommonProductResponse prepareFailView(ProductBusinessException exception) throws ProductBusinessException {
        throw exception;
    }

}
