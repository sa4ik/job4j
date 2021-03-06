package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *@author Sergey Sachavichka (sachavichka@gmail.com)
 *@version $Id$
 *@since 0.1
 */
public class MaxTest {
	@Test
	public void whenFirstLessSecond() {
		Max maxim = new Max();
		int result = maxim.max(1,2);
		assertThat(result, is(2));
		
	}
	
	@Test
	public void whenSecondLessFirst() {
		Max maxim = new Max();
		int result = maxim.max(6,3);
		assertThat(result, is(6));
		
	}

	@Test
	public void whenFirstAndSecondLessThird() {
		Max maxim = new Max();
		int result = maxim.max(2,4,6);
		assertThat(result, is(6));
	}
}