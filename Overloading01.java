package org.object_code.object;

public class Overloading01 {
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(char a, char b) {
		System.out.println(a+b);
	}
	public void add(String a, String b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Overloading01 o = new Overloading01();
		int a=1, b=2;
		o.add(a, b);
		o.add('a', 'b');
		o.add("a", "b");
		
	}

}