package org.object_code.object;

import java.util.Scanner;

public class Polygon {
	String triangle="T";
	String rectangle="R";
	
	void area(String s, int a, int b) {
		if(s.equals(triangle)) {
			int area = a*b/2;
			System.out.println(area);
		}
		else if(s.equals(rectangle)) {
			int area = a*b;
			System.out.println(area);
		}
	}

	public static void main(String[] args) {
		System.out.println("60201359 이주영");
		Polygon p = new Polygon();

		Scanner sc = new Scanner(System.in);
		p.area(sc.next(), sc.nextInt(), sc.nextInt());
	}

}
