package com.tom.h;

public class HorseRunnable implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <=1000; i++) {
			System.out.println ("Horse1:" + i);
		}
		
	}

}
