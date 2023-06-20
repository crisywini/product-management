package co.crisi.productmanagement.presenter.register;

import co.crisi.productmanagement.exceptions.ProductBusinessException;
import co.crisi.productmanagement.model.response.TechnicalProductResponse;
import co.crisi.productmanagement.presenter.ITechnicalProductPresenter;

public class TechnicalProductPresenter implements ITechnicalProductPresenter {

    @Override
    public TechnicalProductResponse prepareFailView(ProductBusinessException exception)
            throws ProductBusinessException {
        throw exception;
    }

    @Override
    public TechnicalProductResponse prepareSuccessfulView(TechnicalProductResponse response) {
        return response;
    }

}
