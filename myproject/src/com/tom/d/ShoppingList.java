package com.tom.d;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {

	public static void main(String[] args) {
		List<Item> items = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String name ="";
		while(!name.equals("q")) {
			
		
		System.out.print("Please enter item name:");
		 name = scanner.nextLine();
		System.out.print("Please enter quantity:");
//		int qty =scanner.nextInt();
		int qty = Integer.parseInt(scanner.nextLine());
		items.add(new Item(name ,qty));
		for(Item item: items) {
			System.out.println(item.name +"\t"+item.qty);
		}
	}

}}
