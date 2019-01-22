package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Sergey Sachavichka (sachavichka@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class ConditionTest {

	/**
	 * Расстояние между двумя точками.
	 */
	
	@Test
	public void Point() {
		Point a = new Point(0, 0);
		Point b = new Point(3, 4);
		double result = a.distanceTo(b);
		//если результат теста равен 5, то программа работает верно
		System.out.println(result);
	}
	
	
}