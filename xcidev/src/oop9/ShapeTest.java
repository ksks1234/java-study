package oop9;

public class ShapeTest {
	public static void main(String[] args) {
		System.out.println("===== 1번 방법 : 직접 인스턴스 생성 후 area() 호출 및 출력 ======");
		Circle c = new Circle();
		c.area();
		System.out.println(c.res);

		Ractangle r = new Ractangle();
		r.area();
		System.out.println(r.res);

		Triangle t = new Triangle();
		t.area();
		System.out.println(t.res);

		System.out.println("===== 2번 방법 : new 인스턴스를 각 도형 타입의 printArea() 메서드에 파라미터로 전달 ======");
		printArea(new Circle());
		printArea(new Ractangle());
		printArea(new Triangle());

		System.out.println("===== 3번 방법 : 업캐스팅 + instanceof 로 하나의 메서드에서 다양한 도형 처리 ======");
		printArea2(new Circle());
		printArea2(new Ractangle());
		printArea2(new Triangle());
	}

	// 2번 방법 시 각자의 메서드에 맞는 매개변수 줌
	private static void printArea(Circle c) {
		c.area();
		System.out.println(c.res);
	}

	private static void printArea(Ractangle r) {
		r.area();
		System.out.println(r.res);
	}

	private static void printArea(Triangle t) {
		t.area();
		System.out.println(t.res);
	}

	// 3번 방법 - 업캐스팅하여 메서드를 하나로 만듬
	private static void printArea2(Shape s) {
		s.area();
		if (s instanceof Circle) {
			Circle c = (Circle) s;
			System.out.println("반지름 " + c.r + "인 원의 넓이는 " 
								+ c.res + " 입니다.");
		} else if (s instanceof Ractangle) {
			Ractangle r = (Ractangle) s;
			System.out.println("가로가 " + r.w + ", 세로가 " + r.h + "인 사각형의 넓이는 " 
								+ r.res + " 입니다.");
		} else if (s instanceof Triangle) {
			Triangle t = (Triangle) s;
			System.out.println("밑변이 " + t.w + ", 높이가 " + t.h + "인 삼각형의 넓이는 " 
								+ t.res + " 입니다.");
		}
	}
}
