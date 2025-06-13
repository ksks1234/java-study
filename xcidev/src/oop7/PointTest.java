package oop7;

public class PointTest {
	public static void main(String[] args) {
		Point2D p1 = new Point2D();
		p1.x = 100;
		p1.y = 200;
		
		// 업 캐스팅
		Point2D p2 = new Point3D();
		p2.x = 1000;	// 업캐스팅
		p2.y = 2000;	// 업캐스팅
//		p2.z = 3000;	// 2D는 3D가 뭘 만들었는지 몰라서 안됨
		
		// 다운 캐스팅
		// 업 캐스팅 한 것을 다시 재참조할 때 가능
		Point3D p3 = (Point3D) p2;
		p3.x = 1000;
		p3.y = 2000;
		p3.z = 3000;
	}
}
