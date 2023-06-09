package co.crisi.productmanagement.domain.validators;

import co.crisi.productmanagement.exceptions.EmptyValueException;
import co.crisi.productmanagement.exceptions.NullEntityException;
import java.util.Optional;

public class Validations {

    public static <T extends Object> T nonNull(T object, String errorMessage) {
        return Optional.ofNullable(object)
                .orElseThrow(() -> new NullEntityException(errorMessage));
    }

    public static String nonEmpty(String object, String errorMessage) {
        return Optional.ofNullable(object)
                .filter(e -> !e.isEmpty())
                .orElseThrow(() -> new EmptyValueException(errorMessage));
    }


}
