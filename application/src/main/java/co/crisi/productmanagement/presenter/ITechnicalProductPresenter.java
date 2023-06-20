package co.crisi.productmanagement.presenter;

import co.crisi.productmanagement.exceptions.ProductBusinessException;
import co.crisi.productmanagement.model.response.TechnicalProductResponse;

public interface ITechnicalProductPresenter {

    TechnicalProductResponse prepareFailView(ProductBusinessException exception) throws ProductBusinessException;

    TechnicalProductResponse prepareSuccessfulView(TechnicalProductResponse response);

}
