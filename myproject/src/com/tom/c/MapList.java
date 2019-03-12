package com.tom.c;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class MapList {

	public static void main(String[] args) {
		Random ran = new Random();
		int [] value = new int[20];
		List<Integer> list = new ArrayList<>();
		for (int i=0;i<10000;i++) {
			int p = ran.nextInt(20);
			list.add(p);
			
			value[p]++;
			
		}
			for(int i=0;i<value.length; i++) {
				
				System.out.println(i+":"+value[i]);
		
	}
			
	}

}
