package org.object_code.object;

class Shape{
	public Shape(String msg) {
		System.out.println("Shape 생성자() "+msg);
	}
	public Shape() {}
}
public class Rectangle extends Shape{

	public Rectangle() {
		super("문자열");
		System.out.println("Rectangle 생성자()");
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
	}

}
