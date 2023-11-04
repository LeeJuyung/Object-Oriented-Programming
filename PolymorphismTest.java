package org.object_code.draw;

abstract class Shape{
	abstract void draw();
}

class Point extends Shape{
	public void draw() {
		System.out.println("점을 찍는다");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("선을 그린다");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("원을 그린다");
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("사각형을 그린다");
	}
}
class TriAngle extends Shape{
	public void draw() {
		System.out.println("삼각형을 그린다");
	}
}

public class PolymorphismTest {

	public static void main(String[] args) {
		Shape[]shapes=new Shape[5];
		shapes[0]=new Point();
		shapes[1]=new Line();
		shapes[2]=new Circle();
		shapes[3]=new Rect();
		shapes[4]=new TriAngle();
		
		//Shape[] shapes = {new Point(),new Line(),
		//		new Circle(),new Rect(),new TriAngle()};
		
		for(int i=0;i<5;i++) {
			shapes[i].draw();
		}
}
}