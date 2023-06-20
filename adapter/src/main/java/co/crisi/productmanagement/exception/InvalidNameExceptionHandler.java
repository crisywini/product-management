package co.crisi.productmanagement.exception;

import co.crisi.productmanagement.exceptions.InvalidNameException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class InvalidNameExceptionHandler {

    @ExceptionHandler(InvalidNameException.class)
    public @ResponseBody
    ResponseEntity<String> handle(InvalidNameException exception) {
        return ResponseEntity.badRequest().body(exception.getMessage());
    }

}
