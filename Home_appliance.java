package org.object_code.object;
//부모 추상클래스
public abstract class Home_appliance {
	int battery=50;
	
	abstract void run();
	abstract void schedule(int time);
	
	void charge(int hour) {
		battery+=hour*10;
		if(battery>=100) {
			battery=100;
		}
		System.out.println(hour+"시간 충전 후 배터리:"+battery);
	}
}
