package oop9;

// 원 넓이 계산
public class Circle extends Shape {
	int r = 10;
	
	// Shape의 area 상속
	@Override
	public void area() {
		res = 3.14 * r * r;
	}

}
