package co.crisi.productmanagement.presenter;

import co.crisi.productmanagement.exceptions.CommonProductBusinessException;
import co.crisi.productmanagement.model.request.CommonProductRequest;
import co.crisi.productmanagement.model.response.CommonProductResponse;

public interface ICommonProductPresenter {

    CommonProductResponse prepareSuccessfulView(CommonProductRequest request);

    CommonProductResponse prepareFailView(CommonProductBusinessException exception)
            throws CommonProductBusinessException;

}
