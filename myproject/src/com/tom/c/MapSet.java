package com.tom.c;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MapSet {
public static void main(String[] args) {
		Random ran = new Random();
		int [] value = new int[20];
		Set<Integer> Set = new HashSet<>();
		for (int i=0;i<10000;i++) {
			int p = ran.nextInt(20);
			Set.add(p);
			
			value[p]++;
			
		}
			for(int i=0;i<value.length; i++) {
				
				System.out.println(i+":"+value[i]);
		
	}
			
	}

}


