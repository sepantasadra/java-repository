import Seller.CarSeller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MathTest {

    @Test
    void Should_Do_Math_Methods() {
        double x = -2.3;
        double variable = 0;

        double absoluteX = Math.abs(x);
        double cosVariable = Math.cos(variable);

        System.out.println(absoluteX);
        System.out.println(cosVariable);
        System.out.println(Arrays.toString(CarSeller.nameOfSellers));

        Assertions.assertEquals(2.3, absoluteX);
        Assertions.assertEquals(1, cosVariable);
    }
}
