package co.crisi.productmanagement.boundaries.output.register;

import co.crisi.productmanagement.domain.ITechnicalProduct;

public interface ITechnicalProductRegisterGateway extends IProductExistsGateway {

    void save(ITechnicalProduct product);

}
