package co.crisi.productmanagement.domain;

import java.util.Objects;

public record CommonProduct(String id, String name, String description, double price) implements IProduct {


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

}
