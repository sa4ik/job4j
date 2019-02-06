package ru.job4j.loop;

/**
 *@author Sergey Sachavichka (sachavichka@gmail.com)
 *@version $Id$
 *@since 0.1
 */
 
 public class Board {
	 public String paint(int widht, int height) {
		 StringBuilder screen = new StringBuilder();
		 String ln = System.lineSeparator();
		 for (int h = 0; h < height; h++) {
			 for (int w = 0; w < widht; w++) {
				 if ((w+h)%2==0) {
					 screen.append("x");
				 } else {
					 screen.append(" ");
				 }
			 }
			 screen.append(ln);
		 }
		 return screen.toString();
	 }
	 
 }