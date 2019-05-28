package com.tom.h;

public class Horse extends Thread{
	public Horse(String name) {
		setName(name);
	}
	@Override
	public void run() {
		for (int i = 1; i <=1000 ; i++) {
			System.out.println (getName() + i);
			super.run();
		}
		
	}

}
