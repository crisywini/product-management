package co.crisi.productmanagement.boundaries.input.register;

import co.crisi.productmanagement.exceptions.ProductBusinessException;
import co.crisi.productmanagement.model.request.register.CommonProductRequest;
import co.crisi.productmanagement.model.response.CommonProductResponse;

public interface ICommonProductRegisterBoundary {

    CommonProductResponse create(CommonProductRequest request) throws ProductBusinessException;

}
