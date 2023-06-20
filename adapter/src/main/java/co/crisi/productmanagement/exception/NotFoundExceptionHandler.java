package co.crisi.productmanagement.exception;

import co.crisi.productmanagement.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class NotFoundExceptionHandler {


    @ExceptionHandler(ProductNotFoundException.class)
    public @ResponseBody
    ResponseEntity<String> handleNotFoundException(ProductNotFoundException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }

}
