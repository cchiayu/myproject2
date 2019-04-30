package com.tom.e;
	import java.util.Scanner;
	public class ScoreTesterNG {
	public static void main(String[] args) {

	 Scanner scanner = new Scanner(System.in);
	    try {
	    	System.out.print("請輸入英文分數");
	    	String english = scanner.nextLine();
	    	int h = Integer.parseInt(english);
	    		if(h >100 || h < 0){
	    				h = (Integer) null;
	    		}
	    	System.out.print("請輸入數學分數");
	    	String math = scanner.nextLine();
	    	int m = Integer.parseInt(math);
	    		if(m>100 || m< 0){
	    			m= (Integer) null;
	    		}
	    	int average= (h + m)/2;
	    	System.out.print("平均為"+ average);
	    	} 	catch(NumberFormatException e) {
	    	// e.printStackTrace();用於觀察錯誤
	    	System.out.println("訊息格式錯誤");
	    	}	catch(NullPointerException e)  {
	    	// e.printStackTrace();用於觀察錯誤
	        System.out.println("訊息成績應為0~100");
	    	}
			}
}  
		/*NullPointerException  當所需資料為null時拋出異常
	  	NumberFormatException   資料格式錯誤	
	  	ArithmeticException     用0做為除數使得結果產生異常,h=h/0*/
	
