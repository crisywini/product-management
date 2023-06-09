package co.crisi.productmanagement.exceptions;


public class NullEntityException extends RuntimeException{

    public NullEntityException(String errorMessage){
        super(errorMessage);
    }

}
