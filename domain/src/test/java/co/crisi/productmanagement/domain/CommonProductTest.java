package co.crisi.productmanagement.domain;

import co.crisi.productmanagement.exceptions.EmptyValueException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class CommonProductTest {


    @Test
    void isNameValid() {

        var throwable = catchThrowable(() -> {
            IProduct commonProduct = new CommonProduct("", "", "", 30000);
        });

        assertThat(throwable)
                .isNotNull()
                .hasMessage("The id should not be empty")
                .isInstanceOf(EmptyValueException.class);
    }

}