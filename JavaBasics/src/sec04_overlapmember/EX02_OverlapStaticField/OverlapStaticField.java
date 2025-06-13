package sec04_overlapmember.EX02_OverlapStaticField;

class A {
	static int m = 3;
}
class B extends A {
	static int m = 4;
}
public class OverlapStaticField {
	public static void main(String[] args) {
		// 클래스 명으로 바로 접근
		System.out.println(A.m);
		System.out.println(B.m);
		System.out.println();
		
		// 객체 생성
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		// 인스턴스 필드
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m);
	}
}
