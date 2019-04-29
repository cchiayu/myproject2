package com.tom.e;

public class MyException extends Exception{
	
	 int math;
	 int english;
	 
	public MyException(int score) {
		if(math >100 || math < 0){
			System.out.println("訊息成績應為0~100");
			}else{
			this.math = math;
			}
		if(english >100 || english < 0){
			System.out.println("訊息成績應為0~100");
			}else{
			this.english = english;
			}
	}
	
}
		//catch(MyException e) {
	    	//System.out.println("成績應為0~100");
	    //}
	
