package co.crisi.productmanagement.domain.factory;

import co.crisi.productmanagement.domain.ITechnicalProduct;

public interface ITechnicalProductFactory {

    ITechnicalProduct create(String id, String name, String description, double price, String technicalInformation,
            String instructionManual);

}
