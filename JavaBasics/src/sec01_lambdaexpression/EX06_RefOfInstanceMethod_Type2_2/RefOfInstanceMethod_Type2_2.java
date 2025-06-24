package sec01_lambdaexpression.EX06_RefOfInstanceMethod_Type2_2;

interface A {
	int abc(String str);
}

interface B {
	String bcd(String str);
}

public class RefOfInstanceMethod_Type2_2 {
	public static void main(String[] args) {
		// 1. 익명 이너 클래스
		A a1 = new A() {
			@Override
			public int abc(String str) {
				return str.length();
			}
		};
		B b1 = new B() {
			@Override
			public String bcd(String str) {
				return str.toLowerCase();
			}
		};
		// 2. 람다식
		A a2 = (String str) -> str.length();
		B b2 = (String str) -> str.toLowerCase();
		// 3. 자바가 제공하는 인스턴스 메서드 참조
		A a3 = String::length;
		B b3 = String::toUpperCase;
		System.out.println(a1.abc("안녕"));	// 2
		System.out.println(a2.abc("안녕"));	// 2
		System.out.println(a3.abc("안녕"));	// 2
		System.out.println(b1.bcd("Hello"));	// hello
		System.out.println(b2.bcd("Hello"));	// hello
		System.out.println(b3.bcd("Hello"));	// HELLO
	}
}
