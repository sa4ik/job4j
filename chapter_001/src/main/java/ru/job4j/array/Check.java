package ru.job4j.array;

/**
 *@author Sergey Sachavichka (sachavichka@gmail.com)
 *@version $Id$
 *@since 0.1
 */
 
 public class Check {
	 public boolean mono(boolean[] data) {
		 boolean result = false;
		 for (int index = 0; index < data.length; index++) {
            if (data[index]!=data[0])
            	return result;

		 }
       return result = true;
	 }
 }




