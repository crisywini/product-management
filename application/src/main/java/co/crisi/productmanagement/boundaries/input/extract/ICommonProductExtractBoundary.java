package co.crisi.productmanagement.boundaries.input.extract;

import co.crisi.productmanagement.exceptions.ProductBusinessException;
import co.crisi.productmanagement.model.response.CommonProductResponse;
import java.util.List;

public interface ICommonProductExtractBoundary {

    CommonProductResponse getById(String id) throws ProductBusinessException;

    List<CommonProductResponse> getAll();

}
