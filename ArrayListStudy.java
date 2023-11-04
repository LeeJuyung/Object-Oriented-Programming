package org.object_code.object;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListStudy {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,5,6,10,13,20));
		System.out.println(a);
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int i=sc.nextInt();
		if(a.contains(i)==true) {
			System.out.println("이미 있습니다");
		}
		while(i!=0) {
			
			for(int k=0;k<a.size();k++) {
				if(a.get(k)<i) {
					k++;
				}
				else a.add(k, i);
				return;
				
			}
			System.out.println(a);
			break;
		}
		if(i==0) {
			System.out.println("종료");
		}
	}

}
