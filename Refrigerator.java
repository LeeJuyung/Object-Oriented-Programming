package org.object_code.object;

public class Refrigerator {
	int temp;
	boolean isOn;
	
	void switchOn() {
		isOn=true;
		System.out.println("전원 플러그 연결함");
	}
	void switchOff() {
		isOn=false;
		System.out.println("전원 플러그 뽑음");
	}
	void raiseTemp() {
		temp+=1;
		System.out.println("현재온도: "+temp+"도");
	}
	void lowerTemp() {
		temp-=1;
		System.out.println("현재온도: "+temp+"도");
	}
	

	public static void main(String[] args) {
		Refrigerator r=new Refrigerator();
		r.temp=26;
		r.switchOff();
		r.switchOn();
		r.lowerTemp();
		r.raiseTemp();
	}

}
