package com.tom.i;

public class Wizard extends Thread{

	public void thunder() {
		System.out.println("THUNDER START!!");;
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("THUNDER END!!");
	}

	
	@Override
	public void run() {
		thunder();
		
	}
	/*�H�U������,�n�令�������@��THUNDER START END�t�@�Ӥ~��}�l*/
	public static void main (String[]args){	
	Wizard w1 = new Wizard();
	w1.start();
	Wizard w2 = new Wizard();
	w2.start();
	}

}
