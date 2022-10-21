package com.ruby.java.ch06;

class Point {

	private int x, y;

	// 생성자, 리턴타입 없고, 이름이 클래스랑 같아야한다.
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void getPoint() {
		System.out.println("x = " + x + ", y = " + y);
	}
}

class ColorPoint extends Point {
	private String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
		// setPoint(x, y);
	}

	public void getColor() {
		System.out.println("color = " + color);
		getPoint();
	}
}

public class TestPoint {

	public static void main(String[] args) {
		// Point p = new Point();
		// p.setPoint(2, 5);
		// p.getPoint();

		// ColorPoint c = new ColorPoint();
		// c.setColor(10, 20, "red");
		// c.getColor();

		ColorPoint cp = new ColorPoint(10, 20, "red"); // 함수는 같은데 매개변수가 다르다 = 오버로딩
		cp.getColor();
	}
}
