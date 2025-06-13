package sec02_typecasting.EX03_Typecasting_3;

// 클래스의 상속 관계
class A {}
class B extends A{};

/* 캐스팅의 가능 여부를 확인할 수 있는 instanceof */

public class Typecasting_3 {
	public static void main(String[] args) {
		// instanceof
		A aa = new A();
		A ab = new B();
		
		System.out.println(aa instanceof A);	// true
		System.out.println(ab instanceof A);	// true
		
		System.out.println(aa instanceof B);	// false
		System.out.println(ab instanceof B);	// true
		
		if(aa instanceof B) {
			B b = (B) aa;
			System.out.println("aa를 B로 캐스팅했습니다.");
		} else {
			System.out.println("aa는 B 타입으로 캐스팅이 불가능!!");	// 출력
		}
				
		if(ab instanceof B) {
			B b = (B) ab;
			System.out.println("ab를 B로 캐스팅했습니다.");	// 출력
		} else {
			System.out.println("ab는 B 타입으로 캐스팅이 불가능!!");
		}
		
		if("안녕" instanceof String) {
			System.out.println("\"안녕\"은 String 클래스입니다.");
		}
		
	}

}
