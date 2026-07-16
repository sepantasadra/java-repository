package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static calculator.CalculatorS.calc;

public class CalculatorTest {
//    @Test
//    void Should_Add_Two_Nums() {
//
//        CalculatorS calculatorS = new CalculatorS();
//
//        double addResult = calculatorS.add("-1.3", "2.1");
//
//        System.out.println(addResult);
//
//        Assertions.assertEquals(addResult, 0.8);
//
//    }

    @Test
    void Should_Answer_String_Of_Nums_And_Methods() {

        ArrayList <String> xxx = new ArrayList<>();

        xxx.add("2");
        xxx.add("-");
        xxx.add("3");
        xxx.add("*");
        xxx.add("4");
        xxx.add("/");
        xxx.add("8");
        xxx.add("+");
        xxx.add("6");
        xxx.add("-");
        xxx.add("4");
        xxx.add("*");
        xxx.add("12");
        xxx.add("/");
        xxx.add("6");
        xxx.add("+");
        xxx.add("7");

        Assertions.assertEquals(5.5, calc(xxx));


        ArrayList <String> qqq = new ArrayList<>();

        qqq.add("2");
        qqq.add("*");
        qqq.add("3");
        qqq.add("/");
        qqq.add("4");
        qqq.add("*");
        qqq.add("6");

        Assertions.assertEquals(9, calc(qqq));
    }
}
