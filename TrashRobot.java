package org.object_code.object;

public class TrashRobot {
	// 쓰레기 처리, 관리하는 로봇

	// 멤버변수
	boolean isfull;
	int size;

	// 메소드
	void binisfull() {
		isfull=true;
		System.out.println("가득참");
	}

	void putTrash(int trash) {
		size += trash;
		// 최대 용량 30
		if (size <= 30) {
			System.out.println("쓰레기 넣음 잔여공간 " + (30-size));
		} else {
			System.out.println("쓰레기통 가득참 비우고 넣으세요");
		}
	}

	void popTrash(int trash) {
		// 쓰레기통에서 다시 꺼낼 때
		size -= trash;
		System.out.println("쓰레기 꺼냄 잔여공간 " + (30-size));
	}

	void clean() {
		size = 0;
		System.out.println("쓰레기통 초기화 잔여공간 " + (30-size));
	}

	public static void main(String[] args) {
		System.out.println("60201359 이주영");
		TrashRobot t = new TrashRobot();
		// 쓰레기통 초기 size=0
		t.size = 0;
		t.putTrash(10);
		t.putTrash(50);
		t.clean();
		t.putTrash(20);
		t.popTrash(15);
		t.isfull=false;
	}

}
