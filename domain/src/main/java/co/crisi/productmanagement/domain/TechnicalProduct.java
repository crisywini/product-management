package co.crisi.productmanagement.domain;

import java.util.Objects;

public record TechnicalProduct(String id, String name, String description, double price, String technicalInformation,
                               String instructionManual) implements ITechnicalProduct {

    private static final int MINIMUM_NAME_CHARACTER_LENGTH = 5;

    public TechnicalProduct {
        isNameValid();
        isTechnicalInformationValid();
    }

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
        return Objects.nonNull(name) && name.length() > MINIMUM_NAME_CHARACTER_LENGTH;
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
