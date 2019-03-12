package com.tom.c;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapPractice {
	public static void main(String[] args) {
		Random ran = new Random();
		Map<Integer,Integer>p =new HashMap<Integer,Integer>();
		for(int i = 0; i < 10000; i++) { 
			int r = ran.nextInt(20);
			Integer value = p.get(r);
			if (value==null) {
			value = 1;
			}else
			{
			value = value+1;
			}
		p.put(r, value);
	}
		System.out.print(p);
	}
		}


