package co.crisi.productmanagement.domain;

public interface IProduct {

    String getId();

    String getName();

    String getDescription();

    double getPrice();

    boolean isNameValid();

}
