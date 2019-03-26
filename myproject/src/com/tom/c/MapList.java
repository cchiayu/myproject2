package com.tom.c;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class MapList {

	public static void main(String[] args) {
		Random ran = new Random();
	
		List<Integer> list = new ArrayList();
		for(int i =0;i<20;i++) {
			list.add(0);
		}
		for (int i=0;i<10000;i++) {
			int p = ran.nextInt(20);
			Integer value = list.get(p);

			list.set(p, value+1);
			
		}
		  System.out.println(list);
				
	}

}
