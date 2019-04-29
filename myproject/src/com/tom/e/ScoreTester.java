package com.tom.e;
	import java.util.Scanner;
	public class ScoreTester {
	public static void main(String[] args) throws MyException {

	 Scanner scanner = new Scanner(System.in);
	    try {
	    System.out.print("請輸入英文分數");
	    int h= Integer.parseInt(scanner.nextLine());
	    System.out.print("請輸入數學分數");
	    int m = Integer.parseInt(scanner.nextLine());
	  //  Score e = new Score(scanner.nextLine());
	  //  Score m = new Score(scanner.nextLine());
	    int average= (h + m)/2;
		System.out.print("平均為"+ average);
	     }catch(NumberFormatException e) {
	      System.out.println("訊息格式錯誤");
	   } 
	    
	    	int english;
	    	int math  ;

	    	public ScoreTester (int math,int english) {
	    	this.math = math;
	    	this.english = english; 	
	    	
		if(math >100 || math < 0) {
		   System.out.println("訊息成績應為0~100");
			}else{
			//this.math = math;
			}
		if(english >100 || english < 0){
			System.out.println("訊息成績應為0~100");
			}else{
				 
			//this.english = english;
			}
	     }
	    }
	
	}
			
	

