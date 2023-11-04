package org.object_code.object;

public class Recursion01 {
	
	public static void hello(int count) {
		if(count==0) 
			return;
		
		System.out.println("hello world");
		
		hello(--count);
		
	}

	public static void main(String[] args) {
		hello(5);
	}

}



