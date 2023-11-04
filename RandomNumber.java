package org.object_code.object;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ran = (int) (Math.random()*501 + 500);
		System.out.println(ran);
		int cnt=0;
		
		while(true) {
			System.out.println("500부터 1000 사이 숫자를 입력하세요");
			int n = sc.nextInt();
		    cnt++;
		    if(n == ran) {
		    	System.out.println("정답! "+cnt+"회만에 맞혔습니다");
		        break;
		        
		    }
		}
	}

}
