package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *@author Sergey Sachavichka (sachavichka@gmail.com)
 *@version $Id$
 *@since 0.1
 */
 
 public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
		int sum = counter.add(1, 0);
		assertThat(sum, is(30));
    }
}