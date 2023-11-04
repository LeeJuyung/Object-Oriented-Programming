package org.object_code.object;

class Overloading{
	void same(int a) {
		System.out.println("정수를 입력했습니다.");
	}
	void same(double a) {
		System.out.println("실수를 입력했습니다.");
	}
	void same(String a) {
		System.out.println("문자열을 입력했습니다.");
	}
}

public class OverloadingDemo {

	public static void main(String[] args) {
		Overloading o =new Overloading();
		System.out.println("60201359 이주영");
		o.same(3);
		o.same(3.5);
		o.same("one");
	}

}
