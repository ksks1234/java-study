package sec02_method.EX06_MethodOverloading;

public class MethodOverloading {
	public static void main(String[] args) {
		// 서로 다른 시그니처를 지니고 있는
		// print() 메서드를 입력매개변수에 따라 호출
		print();
		print(3);
		print(5.8);
		print(2,5);
	}
	public static void print() {
		System.out.println("데이터가 없습니다.");
	}
	public static void print(int a) {
		System.out.println(a);
	}
	public static void print(double a) {
		System.out.println(a);
	}
//	
//	void print(double a){}와 중복으로 정의 불가능
//	public static void print(double b) {
//		System.out.println(b);
//	}
	
	public static void print(int a, int b) {
		System.out.println("a: " + a + " b:" + b);
	}
//	
//	void print(int a, int b){}와 중복으로 정의 불가능
//	public static int print(int a, int b) {
//		System.out.println("a: " + a + " b:" + b);
//		return a + b;	
//	}

}
