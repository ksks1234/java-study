package oop1;

public class PointTest {
	public static void main(String[] args) {
		Point2D pt = new Point2D();
		// 아규먼트가 없는 인스턴스를 실행하려면,
				// 기본 생성자를 만들어줘야함
				// 새로운 무언가를 만드려면 새로운 생성자를 만들어주는게 좋음
		pt.setX(100);
		pt.setY(200);
		System.out.println("x = " + pt.getX());
		System.out.println("y = " + pt.getY());
	}
	
}
