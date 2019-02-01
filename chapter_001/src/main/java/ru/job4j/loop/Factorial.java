package ru.job4j.loop;

/**
 *@author Sergey Sachavichka (sachavichka@gmail.com)
 *@version $Id$
 *@since 0.1
 */
 
 public class Factorial {

	/**
	 * Вычисляет факториал числа n.
	 *
	 * @param n.
	 * @return factor.
	 */
	public int calc(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;

		}
		return result;

	}
}