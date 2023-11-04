package org.object_code.object;

public class VendingMachine {
	//멤버변수
	int money;
	int water;
	
	//메소드
	void insertCoin(int coin) {
		money += coin;
		//생수 개당 800원
		if(money>=800&&water>=1) {
			System.out.println("생수 나옴");
			money-=800;
			water-=1;
			System.out.println("재고는 "+water);
		}
		else {
			System.out.println("생수 X");
		}
		System.out.println("잔돈은 "+money);
		System.out.println();
		
		if(water<=0) {
			System.out.println("재고없음");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("60201359 이주영");
		VendingMachine v = new VendingMachine();
		//생수 재고 3개
		v.water=3;
		v.insertCoin(500);
		v.insertCoin(100);
		v.insertCoin(500);
		v.insertCoin(1900);
		v.insertCoin(500);
		v.insertCoin(1000);
		
	}

}
