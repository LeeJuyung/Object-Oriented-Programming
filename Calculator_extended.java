package org.object_code.object;

public class Calculator_extended extends Calculator {
	public Calculator_extended(int a, int b) {
		super(a,b);
	}

	public int avg() {
		return (super.x + super.y) / 2;
	}

	public static void main(String[] args) {
		Calculator_extended c = new Calculator_extended(2, 6);
		System.out.println(c.avg());

	}

}