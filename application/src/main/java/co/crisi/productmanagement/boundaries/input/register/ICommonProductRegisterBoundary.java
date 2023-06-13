package co.crisi.productmanagement.boundaries.input.register;

import co.crisi.productmanagement.exceptions.CommonProductBusinessException;
import co.crisi.productmanagement.model.request.CommonProductRequest;
import co.crisi.productmanagement.model.response.CommonProductResponse;

public interface ICommonProductRegisterBoundary {

    CommonProductResponse create(CommonProductRequest request) throws CommonProductBusinessException;

}
