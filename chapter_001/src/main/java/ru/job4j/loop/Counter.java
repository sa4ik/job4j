package ru.job4j.loop;

/**
 *@author Sergey Sachavichka (sachavichka@gmail.com)
 *@version $Id$
 *@since 0.1
 */
 
 public class Counter {
	 /**
  * Находит сумму всех четных чисел в диапазоне от 1 до 10.
  * @param start and finish.
  * @return sum.
  */
  
  public int add(int start, int finish) {
  	int sum = 0;
	  
	  for (; start<=finish; start++) {
		  if (start % 2 == 0)
			  sum += start;

	  }
	  return sum;
  }
	 
	 
	 
 }