package co.crisi.productmanagement.domain;

import java.util.Objects;

import static co.crisi.productmanagement.domain.validators.Validations.nonEmpty;
import static co.crisi.productmanagement.domain.validators.Validations.nonNull;

public record TechnicalProduct(String id, String name, String description, double price, String technicalInformation,
                               String instructionManual) implements ITechnicalProduct {

    private static final int MINIMUM_NAME_CHARACTER_LENGTH = 5;

    public TechnicalProduct(String id, String name, String description, double price, String technicalInformation,
            String instructionManual) {
        this.id = nonEmpty(id, "The id should be provided");
        this.name = nonEmpty(name, "The name should be provided");
        this.description = nonEmpty(description, "The description should be provided");
        this.price = nonNull(price, "The price should be provided");
        this.technicalInformation = nonEmpty(technicalInformation, "The technical information should be provided");
        this.instructionManual = nonEmpty(instructionManual, "The instruction manual should be provided");
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
