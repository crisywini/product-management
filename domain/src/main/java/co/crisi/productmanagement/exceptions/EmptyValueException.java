package co.crisi.productmanagement.exceptions;

public class EmptyValueException extends RuntimeException {

    public EmptyValueException(String errorMessage) {
        super(errorMessage);
    }

}
