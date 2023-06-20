package co.crisi.productmanagement.exception;

import co.crisi.productmanagement.exceptions.ProductAlreadySavedException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ProductAlreadyExistsExceptionHandler {

    @ExceptionHandler(ProductAlreadySavedException.class)
    public @ResponseBody
    ResponseEntity<String> handle(ProductAlreadySavedException exception) {
        return ResponseEntity.badRequest().body(exception.getMessage());
    }

}
