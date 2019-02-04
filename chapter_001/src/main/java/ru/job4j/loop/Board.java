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
		 for (widht = 0; widht <=4; widht++) {
			 for (height = 0; height <=4; height++) {
				 if ((widht+height)%2==0) {
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