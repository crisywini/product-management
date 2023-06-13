package co.crisi.productmanagement.boundaries.input.register;

import co.crisi.productmanagement.exceptions.ProductBusinessException;
import co.crisi.productmanagement.model.request.TechnicalProductRequest;
import co.crisi.productmanagement.model.response.TechnicalProductResponse;

public interface ITechnicalProductRegisterBoundary {

    TechnicalProductResponse create(TechnicalProductRequest request) throws ProductBusinessException;

}
