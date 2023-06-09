package co.crisi.productmanagement.domain.factory;

import co.crisi.productmanagement.domain.IProduct;

public interface ICommonProductFactory {

    IProduct create(String id, String name, String description, double price);

}
