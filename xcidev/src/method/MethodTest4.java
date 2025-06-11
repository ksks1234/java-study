package method;

public class MethodTest4 {
	public static void main(String[] args) {
		prn(1);
		prn(2,3);
		prn(4,5,6);
	}

	private static void prn(int... n) { // 타입 옆에 ...을 붙이자
		// 가변형 인자 타입을 받으면 배열로 받는다.
		for(int i : n) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

}
