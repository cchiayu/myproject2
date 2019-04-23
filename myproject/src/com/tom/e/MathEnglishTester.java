package com.tom.e;

import java.util.Scanner;

public class MathEnglishTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("英文分數?");
		String num =sc.nextLine();
		int english= Integer.parseInt(num);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("數學分數?");
		String ber = scan.nextLine();
		int math = Integer.parseInt(ber);
		int Average= (english+math)/2;
		System.out.print("平均為"+Average);
	}

}

