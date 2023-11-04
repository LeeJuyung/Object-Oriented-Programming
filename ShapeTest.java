package org.object_code.object;

class Point{
	public void draw() {
		System.out.println("점을 찍는다");
	}
}
class Line{
	public void draw() {
		System.out.println("선을 그린다");
	}
}
class Circle{
	public void draw() {
		System.out.println("원을 그린다");
	}
}
class Rect{
	public void draw() {
		System.out.println("사각형을 그린다");
	}
}
class TriAngle{
	public void draw() {
		System.out.println("삼각형을 그린다");
	}
}
public class ShapeTest {

	public static void main(String[] args) {
		Point p=new Point();
		Line l=new Line();
		Circle c=new Circle();
		Rect r=new Rect();
		TriAngle t=new TriAngle();
		
		p.draw();
		l.draw();
		c.draw();
		r.draw();
		t.draw();
	}

}
