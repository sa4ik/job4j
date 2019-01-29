package ru.job4j.max;

/**
 *@author Sergey Sachavichka (sachavichka@gmail.com)
 *@version $Id$
 *@since 0.1
 */
 public class Max {
 	/**
  * Находит максимальное из двух чисел.
  * @param first and second and third.
  * @return maximum.
  */
	 public int max(int first, int second) {
		 return Math.max(first, second);

	 }

	 public int max (int first, int second, int third) {
	 	return Math.max(max(first, second), third);

	 }
 }