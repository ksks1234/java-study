package oop9;

// 삼각형 넓이 구하기
public class Triangle extends Shape {
	int w = 10;
	int h = 5;

	@Override
	public void area() {
		res = (w * h) / 2;
	}

}
