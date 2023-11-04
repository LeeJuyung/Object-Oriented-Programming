package org.object_code.object;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class ArrayListNum {

	public static void main(String[] args) {
		ArrayList<Integer> num= new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		
		while(true) {
			int i =sc.nextInt();
			
			if(i!=0) {		
				num.add(i);
			}
			else {
				break;
			}
			
		}
		int max=Collections.max(num);
		int min=Collections.min(num);
		System.out.println("최소값 : "+min);
		System.out.println("최대값 : "+max);
		
	}

}
