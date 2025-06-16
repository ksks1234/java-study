// 익명 이너 클래스를 활용해 인터페이스 객체 생성
package sec02_interface.EX05_CreateObjectOfInterface_2;

interface A {
	int a = 3;
	void abc();
}
public class CreateObjectOfInterface_2 {
	public static void main(String[] args) {
		// 객체 생성
		A a1 = new A() {
			public void abc() {
				System.out.println("방법 2. 익명 이너 클래스를 이용한 객체 생성");
			}
		};
		A a2 = new A() {
			public void abc() {
				System.out.println("방법 2. 익명 이너 클래스를 이용한 객체 생성");
			}
		};
		
		//메서드 호출
		a1.abc();
		a2.abc();
		
	}
}
