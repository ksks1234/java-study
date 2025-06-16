// 인터페이스와 클래스의 상속 키워드
package sec02_interface.EX02_InheristanceOfInterface_1;

interface A {
}

interface B {
}

// 단일 인터페이스 상속
class C implements A {
	
}

// 다중 인터페이스 상속
class D implements A, B {
	
}

// 클래스와 인터페이스를 한 번에 상속
class E extends C implements A, B {
	
}
public class InheristanceOfInterface_1 {
	public static void main(String[] args) {
	}
}
