package sec01_field.Ex01_FieldComponent;

// 클래스 생성
class A {
	int m = 4;			// 필드
	int n = 3;			// 필드

	void work1() {
		int k = 5;		// 지역변수
		System.out.println(k);
		work2(3);
		// work2() 안에 정의된 지역 변수를 스택 메모리에 추가
	}

	void work2(int i) {	// 인수를 변수 i에 대입해 입력 매개변수로 활용
		int j = 4;		// 지역변수
		System.out.println(i + j);
	}
}

public class FieldComponent {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.m);
		System.out.println(a.n);
		// 메서드 호출
		a.work1();
		// work1() 안에 정의된 지역 변수를 스택 메모리에 추가
	}

}
