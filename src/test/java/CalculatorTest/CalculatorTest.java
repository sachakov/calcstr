package CalculatorTest;

import Calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {


    static Calculator calculator = new Calculator();

    @Test
    public void testSum1() {
        Assert.assertEquals(0, calculator.calculate("sdfs"));

    }

    @Test
    public void testSum2() {
        Assert.assertEquals(8, calculator.calculate("2 2 4"));

    }

    @Test
    public void testSum3() {
        Assert.assertEquals(8, calculator.calculate("2qwe2%^&4"));
    }
}
