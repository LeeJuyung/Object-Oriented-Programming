package org.object_code.object;

public class Class {
	public boolean equals(Object b) {
		if(this == b)return true;
		else return false;
	}
	
	public static void main(String[] args) {
		Object a=new Object();
		Object b=new Object();
		if(a.equals(b)) {
			System.out.println("같은 객체");
		}
		else System.out.println("다른 객체");
	}

}
