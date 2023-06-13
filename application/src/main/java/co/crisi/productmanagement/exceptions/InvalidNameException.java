package co.crisi.productmanagement.exceptions;

public class InvalidNameException extends CommonProductBusinessException{

    public InvalidNameException(String errorMessage) {
        super(errorMessage);
    }

}
