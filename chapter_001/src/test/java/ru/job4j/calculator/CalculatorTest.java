package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Sergey Sachavichka (sachavichka@gmail.com)
 * @version $1.0$
 * @since 18.01.2019
 */

public class CalculatorTest  {

    /**
     * Test calculator.
     */
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	
	@Test
    public void whenDiv2On2OneThen1()  {
        Calculator calc = new Calculator();
        calc.div(2D, 2D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
	
	@Test
    public void whenSubstractTwoMinusTwoThenZero()  {
        Calculator calc = new Calculator();
        calc.add(2D, 2D);
        double result = calc.getResult();
        double expected = 0D;
        assertThat(result, is(expected));
    }
	
	@Test
    public void whenMultipleTwoMultipleTwoThenFour()  {
        Calculator calc = new Calculator();
        calc.add(2D, 2D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }
	
}