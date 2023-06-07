package co.crisi.productmanagement.domain;

import java.util.Objects;

public record TechnicalProduct(String id, String name, String description, double price, String technicalInformation,
                               String instructionManual) implements ITechnicalProduct {

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isNameValid() {
        return Objects.nonNull(name) && name.length() > 5;
    }

    @Override
    public String getTechnicalInformation() {
        return technicalInformation;
    }

    @Override
    public String getInstructionManual() {
        return instructionManual;
    }

    @Override
    public boolean isTechnicalInformationValid() {
        return Objects.nonNull(instructionManual) && !instructionManual.isEmpty();
    }

}
