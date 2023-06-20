package co.crisi.productmanagement.boundaries.output.extract;

import co.crisi.productmanagement.boundaries.output.register.IProductExistsGateway;
import co.crisi.productmanagement.domain.CommonProduct;
import java.util.List;
import java.util.Optional;

public interface ICommonProductExtractGateway extends IProductExistsGateway {

    List<CommonProduct> getAll();

    Optional<CommonProduct> findById(String id);


}
