package co.crisi.productmanagement.boundaries.output.extract;

import co.crisi.productmanagement.boundaries.output.register.IProductExistsGateway;
import co.crisi.productmanagement.domain.TechnicalProduct;
import java.util.List;
import java.util.Optional;

public interface ITechnicalProductExtractGateway extends IProductExistsGateway {

    Optional<TechnicalProduct> getById(String id);

    List<TechnicalProduct> getAll();

}
