package co.crisi.productmanagement.presenter.extract;

import co.crisi.productmanagement.exceptions.ProductBusinessException;
import co.crisi.productmanagement.model.response.TechnicalProductResponse;
import co.crisi.productmanagement.presenter.ITechnicalProductExtractPresenter;
import java.util.List;

public class TechnicalProductExtractPresenter implements ITechnicalProductExtractPresenter {

    @Override
    public TechnicalProductResponse prepareSuccessfulView(TechnicalProductResponse response) {
        return response;
    }

    @Override
    public TechnicalProductResponse prepareFailVieW(ProductBusinessException exception)
            throws ProductBusinessException {
        throw exception;
    }

    @Override
    public List<TechnicalProductResponse> prepareSuccessfulView(List<TechnicalProductResponse> response) {
        return response;
    }

}
