package oop3;

public class PointTest1 {
	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point();
		p1.color = "RED";
		p1.draw();
		p2.color = "BLUE";
		p2.draw();
		System.out.println("종료");
	}

}
