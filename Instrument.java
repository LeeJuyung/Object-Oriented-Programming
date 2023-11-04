package org.object_code.object;

interface Playable {
	
	public void ready();
	public void play();

}

class Violin implements Playable{
	public void ready() {
		System.out.println("바이올린이 준비되었습니다.");
	}
	public void play() {
		System.out.println("낑~낑~낑~");
		
	}
}
class Guitar implements Playable{
	public void ready() {
		System.out.println("기타가 준비되었습니다.");
	}
	public void play() {
		System.out.println("디링디링");
		
	}
}

public class Instrument {

	public static void main(String[] args) {
		Violin v1=new Violin();
		v1.ready();
		v1.play();
		Guitar g1=new Guitar();
		g1.ready();
		g1.play();

	}

}
