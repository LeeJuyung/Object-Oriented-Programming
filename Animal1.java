package org.object_code.object;

public class Animal1 extends Creature{
	int num_of_legs;
	void move() {
		System.out.println("움직이다");
	}
	
	public static void main(String[] args) {
		Animal1 a=new Animal1();
		a.set_size(10);
	}

}
