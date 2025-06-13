package sec02_typecasting.EX01_Typecasting_1;

// 클래스의 상속 관계
class A {}
class B extends A{};
class C extends B{};
class D extends B{};

public class Typecasting_1 {
	public static void main(String[] args) {
		// 업캐스팅(자동 변환) : 캐스팅 구문을 생략했을 때 컴파일러가 자동으로 추가
		A ac = (A) new C(); 	// C -> A 업캐스팅(자동 변환)
		B bc = (B) new C();		// C -> B 업캐스팅(자동 변환)
		B bb = new B();
		A a = (A) bb;			// B -> A 업캐스팅(자동 변환)
		
		// 다운캐스팅(수동변환) : 캐스팅할 수 없을 때(실행할 때 예외 발생)
		A aa = new A();
		B b = (B) aa;
		C c = (C) aa;
		
		// 다운캐스팅(수동변환) : 캐스팅이 가능할 때
		A ab = new B();
		B b1 = (B) ab;
		C c = (C) ab;	// 불가능
		
		B bd = new D();
		D d = (D) bd;
		
		A ad = new D();
		B b2 = (B) ad;
		D d1 = (D) ad;
	}

}
