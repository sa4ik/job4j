package ru.job4j.array;

/**
 *@author Sergey Sachavichka (sachavichka@gmail.com)
 *@version $Id$
 *@since 0.1
 */
 
 public class FindLoop {
	 
	 /**
	 * Находит индекс заданного элемента.
	 * @param rst and el.
	 * @return rst.
	 */
	 
	 public int indexOf(int[] data, int el) {
		 int rst = -1;
		 for (int index = 0; index < data.length; index++) {
			 if (data[index] == el) {
				 rst = index;
				 break;
			 }
		 }
		 return rst;
	 }
 }