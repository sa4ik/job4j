package ru.job4j.array;

/**
 *@author Sergey Sachavichka (sachavichka@gmail.com)
 *@version $Id$
 *@since 0.1
 */
 
 public class Square {

	/**
	 * Создает и заполняет массив квадратами чисел от 1 до bound.
	 * @param rst and bound.
	 * @return rst.
	 */

	 public int[] calculate(int bound) {
		 int[] rst = new int[bound];
		 for (bound = 1; bound <= rst.length; bound++) {
			 rst[bound - 1] = bound * bound;
		 }
		 return rst;
	 }
 }