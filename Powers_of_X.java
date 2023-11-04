package org.object_code.object;

public class Powers_of_X {
	
	public static int recursionF(int x, int n) {
		if(n==0) {
			return 1;
		}
		else if(n==1) {
			return x;
		}
		else return x*recursionF(x,--n);
	}

	public static void main(String[] args) {
		System.out.println("60201359 이주영");
		int x=2, n=0;
		System.out.println(recursionF(x,n));
	}

}
