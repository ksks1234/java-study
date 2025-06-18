package sec02_staticinnerclass.EX01_CreateObjectAccessMember;

class A {
	int a = 3;
	static int b = 4; 
	void method1() {
		System.out.println("instance method");
	}
	void method2() {
		System.out.println("static method");
	}
	// 정적 이너 클래스
	// 정적 이너 클래스는 아우터 클래스의 정적 멤버만 사용 가능
	class B {
		void bcd() {
			// 빌드 사용
//			System.out.println(a);
			System.out.println(b);	// 정적 멤버
			
			// 메서드 호출
			// method1();
			method2();	// 정적멤버
		}
	}
}
public class CreateObjectAccessMember {
	public static void main(String[] args) {
		// 정적 이너 클래스의 객체 생성
		A a = new A();
		
		// 멤버 사용
		A.B b = a.new B();
		b.bcd();
	}

}
