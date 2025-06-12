package sec01_accessmodifier.EX01_AccessModifierOfMember.pack1;

public class B {
	// 객체 생성
	A a = new A();
	
	public void print() {
		System.out.print(a.a + " ");
		System.out.print(a.b + " ");
		System.out.print(a.c + " ");
//		System.out.print(a.d + " ");	// private 필드 접근 불가능
		System.out.println();
	}

}
