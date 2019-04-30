package com.tom.e;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int bonus = 20000;
		Scanner scanner = new Scanner(System.in);
		System.out.print("多少人要分?");
		String number =scanner.nextLine();
		
		try{
			int n = Integer.parseInt(number);
			int div = bonus/n;
			System.out.println("每個人得?" + div);
		}catch(Exception e) {
			System.out.println("資料錯誤");
		}
		/*}catch(ArithmeticException e) {
			   System.out.println("數值運算錯誤");
		} catch(NumberFormatException e) {
			   System.out.println("數字格式錯誤");
		*/ 
	}

}
  