package co.crisi.productmanagement.exceptions;

public class ProductNotFoundException extends ProductBusinessException{

    public ProductNotFoundException(String errorMessage) {
        super(errorMessage);
    }

}
