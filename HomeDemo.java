package org.object_code.object;

public class HomeDemo {

	//메인메소드
	public static void main(String[] args) {
		System.out.println("60201359 이주영");
		TV t=new TV();
		t.run();
		t.volume=5;
		t.charge(3);
		t.schedule(2);
		t.volume_up();
		
		Fan f=new Fan();
		f.power=1;
		f.run();
		f.power_up();
		f.schedule(1);
		f.charge(4);
	}}

