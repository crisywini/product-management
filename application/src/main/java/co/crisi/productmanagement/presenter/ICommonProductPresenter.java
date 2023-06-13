package co.crisi.productmanagement.presenter;

import co.crisi.productmanagement.exceptions.CommonProductBusinessException;
import co.crisi.productmanagement.model.response.CommonProductResponse;

public interface ICommonProductPresenter {

    CommonProductResponse prepareSuccessfulView(CommonProductResponse request);

    CommonProductResponse prepareFailView(CommonProductBusinessException exception)
            throws CommonProductBusinessException;

}
