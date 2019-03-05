package com.tom.b;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q2 {

	public static void main(String[] args) {
		List<String>order = new ArrayList();
		/*呼叫客人取餐可重複叫號*/
		order.add("1號請取餐");
		order.add("2號請取餐");
		order.add("3號請取餐");
		order.add("2號請取餐");
		order.add("2號請取餐");
		System.out.println(order);
		
		Set<Integer>lotto = new HashSet<>();
		/*樂透號碼不可重複*/
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
