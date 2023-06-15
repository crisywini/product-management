package co.crisi.productmanagement.presenter;

import co.crisi.productmanagement.exceptions.ProductBusinessException;
import co.crisi.productmanagement.model.response.CommonProductResponse;

public class CommonProductPresenter implements ICommonProductPresenter{

    @Override
    public CommonProductResponse prepareSuccessfulView(CommonProductResponse response) {
        return response;
    }

    @Override
    public CommonProductResponse prepareFailView(ProductBusinessException exception) throws ProductBusinessException {
        throw exception;
    }

}
