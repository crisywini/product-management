package co.crisi.productmanagement.model;

import co.crisi.productmanagement.model.response.CommonProductResponse;
import java.util.Random;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CommonProductResponseMother {

    private static final Random RANDOM_GEN = new Random();

    public CommonProductResponse random() {
        return new CommonProductResponse(RANDOM_GEN.nextLong() + "", "Random product", "a Random product",
                RANDOM_GEN.nextDouble());
    }

}
