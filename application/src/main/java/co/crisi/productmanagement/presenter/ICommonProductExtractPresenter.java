package co.crisi.productmanagement.presenter;

import co.crisi.productmanagement.exceptions.ProductBusinessException;
import co.crisi.productmanagement.model.response.CommonProductResponse;
import java.util.List;

public interface ICommonProductExtractPresenter {

    CommonProductResponse prepareSuccessfulView(CommonProductResponse response);

    CommonProductResponse prepareFailView(ProductBusinessException exception) throws ProductBusinessException;

    List<CommonProductResponse> prepareSuccessfulView(List<CommonProductResponse> response);

}
