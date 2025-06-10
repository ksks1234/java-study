package operation;

public class OpTest9 {
	public static void main(String[] args) {
		// 축약형 연산6
		int a = 10;

		//특정 구간만큼 증가할 경우
		a = a + 2;
		a += 2; // a = a + 2와 같음
		System.out.println(a);
		a -= 2; // a = a - 2와 같음
		System.out.println(a);
		a *= 2; // a = a * 2와 같음
		System.out.println(a);
		a /= 2; // a = a / 2와 같음
		System.out.println(a);
		a %= 2; // a = a % 2와 같음
		System.out.println(a);
		
		// 시프트 연산의 경우
		a >>= 2;
		System.out.println(a);
		
	}

}
