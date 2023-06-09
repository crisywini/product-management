package co.crisi.productmanagement.domain.factory.impl;

import co.crisi.productmanagement.domain.ITechnicalProduct;
import co.crisi.productmanagement.domain.TechnicalProduct;
import co.crisi.productmanagement.domain.factory.ITechnicalProductFactory;

public class TechnicalProductFactory implements ITechnicalProductFactory {

    @Override
    public ITechnicalProduct create(String id, String name, String description, double price,
            String technicalInformation, String instructionManual) {
        return new TechnicalProduct(id, name, description, price, technicalInformation, instructionManual);
    }

}
