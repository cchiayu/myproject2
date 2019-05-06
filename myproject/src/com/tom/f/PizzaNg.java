package com.tom.f;

import java.util.Scanner;

public class PizzaNg {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 try {
		 System.out.print("Pizza想切幾塊?");
		 String piece = scanner.nextLine();
	     int n = Integer.parseInt(piece);
	    	if (n == 0) {
	    		System.out.println("你確定不要切?");
	    	}else if(n>=1 && n <=7) {
	    		System.out.println("數量錯誤");
	    	}else if(n>=9 && n <=11) {
	    		System.out.println("數量錯誤");
	    	}else if(n>=13 && n <=15) {
	    		System.out.println("數量錯誤");
	    	}else if (n<=0) {
	    		System.out.println("超出範圍");
	    	}else if (n>=17) {
		    		System.out.println("超出範圍");
	    	}else if (n==8) {
			    		System.out.println("謝謝選購");
	    	}else if (n==12) {
	    		System.out.println("謝謝選購");
	    	}else if (n==16) {
	    		System.out.println("謝謝選購");
	    	}} catch(NumberFormatException e) {
		    	System.out.println("格式錯誤");
		    	}
}
	}