// 인터페이스 상속 자식 클래스의 접근 지정자
package sec02_interface.EX03_InheristanceOfInterface_2;

interface A {
	public abstract void abc();
}

interface B {
	void bcd();	// public abstract 자동 추가
}

class C implements A {
	public void abc() {
		// ...
	}
	
}
// public -> default 불가능
// void is an invalid type for the variable bcd
class D implements B {
	void bcd{
		
	}
}
public class InheristanceOfInterface_2 {
	public static void main(String[] args) {
	}
}
