package oop2;

public class Point2D {
	int x;
	int y;
	
	public Point2D() { // default constructor(기본 생성자)
		this(1, 2);
		System.out.println("Point2D() 수행");
		/*
		 * System.out.println("Point2D() 수행");
		 * this(1, 2);
		 * 이건 에러남
		 */
	} 

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x, y) 수행");
	}

}
