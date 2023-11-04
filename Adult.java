package org.object_code.object;

public class Adult extends Humann{

	public void move() {
		System.out.println("저벅저벅");
		
	}

	public void cry() {
		System.out.println("흑흑");
		
	}
	public static void main(String[] args) {
		Adult a=new Adult();
		a.cry();
		a.move();
	}

	

	}


