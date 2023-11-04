package org.object_code.object;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		StudentScore a = new StudentScore();
		System.out.println("국어점수는? ");
		a.score_Kor=sc.nextInt();
		System.out.println("영어점수는? ");
		a.score_Eng=sc.nextInt();
		
		//a.score_Kor=90;
		//a.score_Eng=80;
		System.out.println(a.sum());
	}
}