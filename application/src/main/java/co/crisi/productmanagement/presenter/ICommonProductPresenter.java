package co.crisi.productmanagement.presenter;

import co.crisi.productmanagement.exceptions.ProductBusinessException;
import co.crisi.productmanagement.model.response.CommonProductResponse;

public interface ICommonProductPresenter {

    CommonProductResponse prepareSuccessfulView(CommonProductResponse request);

    CommonProductResponse prepareFailView(ProductBusinessException exception)
            throws ProductBusinessException;

}
