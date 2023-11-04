package org.object_code.object;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cafe_order_system {

	public static void main(String[] args) {
		System.out.println("60201359 이주영");
		Queue<String> menu = new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("주문은 1, 완료는 2, 종료는 0");
			int n=sc.nextInt();
			if(n==1) {
				System.out.print("주문하실 음료는? ");
				String order=sc.next();
				menu.add(order);
				System.out.println("따뜻하게 1, 차갑게 2");
				int t=sc.nextInt();
				if(t==1) {
					System.out.println("따뜻한 "+order+ " 주문 받았습니다. 잠시 기다려주세요~");
				}
				else {
					System.out.println("차가운 "+order+ " 주문 받았습니다. 잠시 기다려주세요~");
				}
				System.out.println("준비중 "+menu.size()+"개");
			}
			else if(n==2) {
				if(menu.size()==0) {
					System.out.println("주문받은 내역이 없습니다.");
				}
				else {
					System.out.println(menu.poll()+" 나왔습니다~");
					System.out.println("준비중 "+menu.size()+"개");
				}
			}
			if(n==0) {
				if(menu.size()!=0) {
					System.out.println("남은 주문을 끝내주세요.");
					continue;
				}
				else {
					System.out.println("시스템을 종료합니다.");
					
				}
				break;
			}
		}
		
	}

}
