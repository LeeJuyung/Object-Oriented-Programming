package org.object_code.object;

public class 하노이 {
	int n; //원판 수
	char a;//1.시작기둥
	char b;//2.끝 기둥
	char c;//3.보조 기둥(가운데)
	
	static void hanoi(int n, char a, char b, char c) {
		if(n==1) {
			System.out.println("기둥 "+a+"의 원반을 "+c+"로 옮긴다");
		}
		else {
			hanoi(n-1,a,c,b);
			System.out.println("기둥 "+a+"의 원반을 "+c+"로 옮긴다");
			hanoi(n-1,b,a,c);
		}
	}

	public static void main(String[] args) {
		hanoi(3,'1','2','3');
	}

}
