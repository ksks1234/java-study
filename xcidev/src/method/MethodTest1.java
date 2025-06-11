package method;

public class MethodTest1 {
	public static void main(String[] args) {
		System.out.println("------- println으로 출력 -------");
		System.out.println("+==========+");
		System.out.println("|  신해철  |");
		System.out.println("+==========+");
		// 이걸 반복해서 여러개 만들면 너무 많고 힘듬
		// 그래서 모듈화 진행
		
		System.out.println();
		System.out.println("------- print method로 출력 -------");
		print("신해철");
		print("서태지");
		print(); // method overload(메소드 중복 정의)
		// 메서드 이름은 같고 매개변수가 다른 것 : 오버로딩
		// 이름 같고 매개변수 같고 내용이 다른 것 : 오버라이딩
		
		// 클래스는 속성(비행위) 행위(메서드)로 구분된다.
		
	}

	private static void print() {
		System.out.println("안녕하세요");
		
	}

	private static void print(String name) {
		System.out.println("+==========+");
		System.out.println("|  "+name+"  |");
		System.out.println("+==========+");
		
	}

}
