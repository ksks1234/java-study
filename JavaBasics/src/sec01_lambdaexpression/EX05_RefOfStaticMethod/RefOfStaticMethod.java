package sec01_lambdaexpression.EX05_RefOfStaticMethod;

interface A {
	void abc();	
}

class B {
	static void bcd() {
		System.out.println("메서드");
	}
}

public class RefOfStaticMethod {
	public static void main(String[] args) {
		//** 정적 메서드 참조 **
		// 1. 익명이너클래스 방법
		A a1 = new A() {
			@Override
			public void abc() {
				B.bcd();
			}
		};
		
		// 2. 람다식
		A a2 = ()->{ B.bcd(); };
		
		// 3. 정적메서드 참조
		A a3 = B::bcd;			
		
		a1.abc();	// 메서드
		a2.abc();	// 메서드
		a3.abc();	// 메서드
	}
}