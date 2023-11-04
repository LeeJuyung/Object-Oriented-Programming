package org.object_code.object;
class Product{
	int price;
	int bonusPoint;
}
class TV1 extends Product{}
class Computer extends Product{}
class Audio extends Product{}

public class Buyer {
	int money;
	int bonusPoint;
	
	public Buyer() {
		money=1000;
		bonusPoint=0;
	}
	void buy(Product p) {
		money-=p.price;
		bonusPoint +=p.bonusPoint;
	}

	public static void main(String[] args) {
		Buyer b=new Buyer();
		TV1 t01=new TV1();
		Computer c=new Computer();
		Audio a=new Audio();
		b.buy(a);
		System.out.println(t01.toString());
	}

}
