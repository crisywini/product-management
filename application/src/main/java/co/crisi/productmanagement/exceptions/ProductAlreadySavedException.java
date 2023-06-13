package co.crisi.productmanagement.exceptions;

public class ProductAlreadySavedException extends CommonProductBusinessException{

    public ProductAlreadySavedException(String errorMessage) {
        super(errorMessage);
    }

}
