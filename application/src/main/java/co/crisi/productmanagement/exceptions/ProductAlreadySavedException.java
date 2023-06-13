package co.crisi.productmanagement.exceptions;

public class ProductAlreadySavedException extends ProductBusinessException {

    public ProductAlreadySavedException(String errorMessage) {
        super(errorMessage);
    }

}
