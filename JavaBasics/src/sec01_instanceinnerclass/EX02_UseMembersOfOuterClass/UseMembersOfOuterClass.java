package sec01_instanceinnerclass.EX02_UseMembersOfOuterClass;

class A {
	int a = 3;
	int b = 4; 
	void abc() {
		System.out.println("A 클래스 메서드 abc()");
	}
	// 인스턴스 이너 클래스
	class B {
		int a = 5;
		int b = 6; 
		void abc() {
			System.out.println("B 클래스 메서드 abc()");
		}
		void bcd() {
			// 이너 클래스의 멤버 호출 또는 사용
			System.out.println(a);
			System.out.println(b);
			abc();

			// 아우터 클래스의 메서드 호출 또는 사용
			System.out.println(A.this.b);
			System.out.println(A.this.b);
			A.this.abc();
		}
	}
}
public class UseMembersOfOuterClass {
	public static void main(String[] args) {
		// 아우터 클래스 객체 생성
		A a = new A();
		
		// 멤버 사용
		A.B b = a.new B();
		b.bcd();
	}

}
