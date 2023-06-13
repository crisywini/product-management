package co.crisi.productmanagement.model;

import co.crisi.productmanagement.model.request.CommonProductRequest;
import java.util.Random;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CommonProductRequestMother {

    private static final Random RANDOM_GEN = new Random();

    public CommonProductRequest random() {
        return new CommonProductRequest(RANDOM_GEN.nextLong() + "", "Random product", "a Random product",
                RANDOM_GEN.nextDouble());
    }

}
