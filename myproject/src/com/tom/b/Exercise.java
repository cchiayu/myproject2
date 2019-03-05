package com.tom.b;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Exercise {

	public static void main(String[] args) {
		List<Integer> bag = new ArrayList();
		bag.add(3);
		bag.add(95);
		bag.add(3);
		bag.add(6);
		System.out.println(bag);
		
		Set<Integer> box = new HashSet();
		box.add(3);
		box.add(6);
		box.add(3);
		box.add(62);
		System.out.println(box);
		

	}

}
