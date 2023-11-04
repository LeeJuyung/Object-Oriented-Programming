package org.object_code.object;

public class TV extends Home_appliance {//TV. 자식클래스
	int volume;

	void run() {
		System.out.println("TV를 작동합니다");
	}
	void schedule(int time) {
		System.out.println(time + " 시간 뒤 TV를 종료합니다");	
	}
	void volume_up() {
		volume+=1;
		System.out.println("현재 볼륨 "+volume);
	}
}
class Fan extends Home_appliance {//선풍기. 자식클래스
	int power;
	void run() {
		System.out.println("선풍기를 작동합니다");
	}
	void schedule(int time) {
		System.out.println(time+"시간 뒤 선풍기를 중지합니다");
	}
	void power_up() {
		power+=1;
		if(power>=3) {
			power=3;
		}
		System.out.println("1~3 중 현재 선풍기 강도 "+power);
	}
}