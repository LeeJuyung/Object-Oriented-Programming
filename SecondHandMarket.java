package org.object_code.object;

interface Buyable {
	void buy();
}

interface Sellable {
	void sell();
}

public class SecondHandMarket implements Buyable, Sellable {
	// 중고마켓에서 사고 파는 활동을 한다.
	public void sell() {
		System.out.println("중고물건을 팔다");
	}
	public void buy() {
		System.out.println("중고물건을 사다");
	}
	public void send_message() {
		System.out.println("메시지를 보내다");
	}
	public static void main(String[] args) {
		System.out.println("60201359 이주영");
		SecondHandMarket s = new SecondHandMarket();
		s.buy();
		s.sell();
		s.send_message();
	}
}
