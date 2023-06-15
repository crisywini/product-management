package co.crisi.productmanagement.presenter;

import co.crisi.productmanagement.exceptions.ProductBusinessException;
import co.crisi.productmanagement.model.response.TechnicalProductResponse;

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
