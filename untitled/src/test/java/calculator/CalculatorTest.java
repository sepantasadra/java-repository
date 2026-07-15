package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static calculator.CalculatorS.add;

public class CalculatorTest {
    @Test
    void Should_Add_Two_Nums() {

        CalculatorS calculatorS = new CalculatorS();

        double addResult = calculatorS.add("-1.3", "2.1");

        System.out.println(addResult);

        Assertions.assertEquals(addResult, 0.8);

    }
}
