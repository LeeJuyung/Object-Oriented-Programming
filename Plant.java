package org.object_code.object;

public class Plant extends Creature{
	boolean is_monoecious;
	void photosynthesize() {
		System.out.println("광합성하다");
	}
	public static void main(String[] args) {
		Plant p=new Plant();
		p.set_size(3);
		p.breathe();
		p.is_monoecious=true;
		p.photosynthesize();
	}
}
