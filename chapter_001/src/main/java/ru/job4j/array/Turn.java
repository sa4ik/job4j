package ru.job4j.array;

/**
 *@author Sergey Sachavichka (sachavichka@gmail.com)
 *@version $Id$
 *@since 0.1
 */
 
 public class Turn {
	 public int [] back(int[] array) {
		 for (int index = 0; index < array.lenght/2; index++) {
			int temp = array[array.lenght-index-1];
			array[array.lenght-index-1] = array[index];
			array[index] = temp;
		 }
		 return array;
	 }
 }