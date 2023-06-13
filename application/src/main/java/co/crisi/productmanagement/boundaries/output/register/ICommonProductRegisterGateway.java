package co.crisi.productmanagement.boundaries.output.register;

import co.crisi.productmanagement.domain.IProduct;

public interface ICommonProductRegisterGateway extends IProductExistsGateway {

    void save(IProduct product);

}
