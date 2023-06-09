package co.crisi.productmanagement.domain;

import java.util.Objects;

import static co.crisi.productmanagement.domain.validators.Validations.nonNull;
import static co.crisi.productmanagement.domain.validators.Validations.nonEmpty;

public record CommonProduct(String id, String name, String description, double price) implements IProduct {


    private static final int MINIMUM_NAME_CHARACTER_LENGTH = 5;

    public CommonProduct(String id, String name, String description, double price) {
        this.id = nonEmpty(id, "The id should not be empty");
        this.name = nonEmpty(name, "The name should not be empty");
        this.description = nonEmpty(description, "The description should not be empty");
        this.price = nonNull(price, "The price should not be empty");
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

}
