package co.crisi.productmanagement.presenter;

import co.crisi.productmanagement.exceptions.ProductBusinessException;
import co.crisi.productmanagement.model.response.TechnicalProductResponse;
import java.util.List;

public interface ITechnicalProductExtractPresenter {

    TechnicalProductResponse prepareSuccessfulView(TechnicalProductResponse response);

    TechnicalProductResponse prepareFailVieW(ProductBusinessException exception) throws ProductBusinessException;

    List<TechnicalProductResponse> prepareSuccessfulView(List<TechnicalProductResponse> response);

}
