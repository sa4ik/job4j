package ru.job4j.array;

/**
 *@author Sergey Sachavichka (sachavichka@gmail.com)
 *@version $Id$
 *@since 0.1
 */
 
 public class Square {
	 public int[] calculate(int bound) {
		 int[] rst = new int[bound];
		 for (bound = 1; bound != rst.length; bound++) {
			 rst[bound] = bound*bound;
		 }
		 return rst;
	 }
 }