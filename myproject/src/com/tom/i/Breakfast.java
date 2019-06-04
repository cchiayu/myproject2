package com.tom.i;

public class Breakfast extends Thread {

	@Override
	public void run() {
		
		System.out.println("Making breakfast");
		try {
			Thread.sleep(4000);
			System.out.println("Breakfast done");

		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	
}
