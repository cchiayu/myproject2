package com.tom.b;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q2 {

	public static void main(String[] args) {
		List<String>order = new ArrayList();
		/*�I�s�ȤH���\�i���ƥs��*/
		order.add("1���Ш��\");
		order.add("2���Ш��\");
		order.add("3���Ш��\");
		order.add("2���Ш��\");
		order.add("2���Ш��\");
		System.out.println(order);
		
		Set<Integer>lotto = new HashSet<>();
		/*�ֳz���X���i����*/
		lotto.add(2);
		lotto.add(6);
		lotto.add(25);
		lotto.add(19);
		lotto.add(37);
		lotto.add(40);
		lotto.add(2);
		lotto.add(6);
		System.out.println(lotto);
	}

}
