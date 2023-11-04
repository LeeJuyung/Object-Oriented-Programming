package org.object_code.object;

public class Rectangle1 extends Shape1 {
		private int width;
		private int height;

		public Rectangle1(int x, int y, int width, int height) {
			super(x, y);
			this.width = width;
			this.height = height;
			System.out.println("Rectangle()");
		}

		double calcArea() {
			return width * height;
		}
	}

