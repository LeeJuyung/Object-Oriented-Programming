package org.object_code.object;
import java.util.Scanner;

public class Boom {
	
	public static void boom(int cnt) {
		if(cnt==0) {
			System.out.println("Boom!");
			return;
		}
		
		else {
			System.out.println(cnt);
			boom(--cnt);
		}
		
	}

	public static void main(String[] args) {
		System.out.println("60201359 이주영");
		System.out.print("숫자를 입력하세요. ");
		Scanner sc=new Scanner(System.in);
		int cnt = sc.nextInt();
		boom(cnt);
	}

}
