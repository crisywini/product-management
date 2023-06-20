package co.crisi.productmanagement.boundaries.input.extract;

import co.crisi.productmanagement.exceptions.ProductBusinessException;
import co.crisi.productmanagement.model.response.TechnicalProductResponse;
import java.util.List;

public interface ITechnicalProductExtractBoundary {

    TechnicalProductResponse getById(String id) throws ProductBusinessException;

    List<TechnicalProductResponse> getAll();

}
