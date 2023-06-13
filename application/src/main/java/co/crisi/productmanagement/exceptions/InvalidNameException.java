package co.crisi.productmanagement.exceptions;

public class InvalidNameException extends ProductBusinessException {

    public InvalidNameException(String errorMessage) {
        super(errorMessage);
    }

}
