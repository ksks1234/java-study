package oop2;

public class PointTest2 {
	public static void main(String[] args) {
		Point2D pt = new Point2D();
		System.out.println("x = " + pt.x);
		System.out.println("y = " + pt.y);
		
		Point2D pt2 = new Point2D(100, 200);
		System.out.println("x = " + pt2.x);
		System.out.println("y = " + pt2.y);
	}
	
}
