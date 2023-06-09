package co.crisi.productmanagement.domain.factory.impl;

import co.crisi.productmanagement.domain.CommonProduct;
import co.crisi.productmanagement.domain.IProduct;
import co.crisi.productmanagement.domain.factory.ICommonProductFactory;

public class CommonProductFactory implements ICommonProductFactory {

    @Override
    public IProduct create(String id, String name, String description, double price) {
        return new CommonProduct(id, name, description, price);
    }

}
