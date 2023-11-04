package org.object_code.object;

class Animal2{
	public void move() {
		System.out.println("동물이 움직인다.");
	}
}
class Tiger extends Animal2{
	public void move() {
		System.out.println("호랑이가 달린다.");
	}
}
class Eagle extends Animal2{
	public void move() {
		System.out.println("독수리가 난다.");
	}
}
public class AnimalTest {

	public void moveAnimal(Animal2 a) {
		a.move();
	}

	public static void main(String[] args) {
		Tiger t=new Tiger();
		Eagle e=new Eagle();
		AnimalTest test=new AnimalTest();
		test.moveAnimal(t);
		test.moveAnimal(e);
	}

}
