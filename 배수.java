package org.object_code.object;

public class 배수 {
	
	public static int re(int x) {
		if(x==0)
			return 0;
		else return (re(x));
		
	}
	

	public static void main(String[] args) {
		int x=100;
		System.out.println(re(x));
	}

}
