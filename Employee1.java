package org.object_code.object;

public class Employee1 extends Human {
	//근로자. 사람의 자식클래스
	String company; //회사명
	int work_hour; //일 근로시간
	
	void work() {
		System.out.println(work_hour+"시간씩 일을 한다");
	}
	void move() {
		System.out.println("출퇴근을 한다");
	}
	void say_hello() {
		System.out.println("안녕하세요~ 인사한다");
	}
	//부모 추상클래스의 메소드
	void breath() {
		System.out.println("숨을 쉰다");
	}

public static void main(String[] args) {
	System.out.println("60201359 이주영");
	Employee1 e=new Employee1();
	e.name="김땡땡";
	e.breath();
	e.say_hello();
	e.move();
	e.work_hour=6;
	e.work();
}}
