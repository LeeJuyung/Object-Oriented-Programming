package org.object_code.object;

public class MoterCycle {
	
	boolean fuel_is_full;
	int energy;
	int speed;
	
	void fill_fuel() {
		fuel_is_full=true;
		System.out.println("연료 가득참");
	}
	
	void fill(int oil) {
		energy+=oil;
		if(energy>100) {
			System.out.println("연료가 충분하며");
		}
		else {
			System.out.println("연료가 부족하며");
		}
		System.out.println("현재 연료는 "+energy);
	}
	void speed_up() {
		speed+=50;
		System.out.println("현재 속도 "+speed);
	}
	void speed_dowm() {
		speed-=50;
		if(speed<0) speed=0;
		System.out.println("현재 속도 "+speed);
	}

	public static void main(String[] args) {
		MoterCycle m=new MoterCycle();
		m.fuel_is_full=false;
		m.fill(10);
		m.fill(100);
		m.speed=100;
		m.speed_up();
		m.speed_dowm();
	}

}
