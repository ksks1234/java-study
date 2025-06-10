package operation;

public class OpTest3 {
	public static void main(String[] args) {
		// 논리연산
		boolean b1 = true, b2 = false;
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("b1 && b2" + " = " + (b1 && b2)); 
		System.out.println("b1 || b2" + " = " + (b1 || b2));
		System.out.println("!b1" + " = " + !b1);
		
		// 비트 연산
		int n1 = 5, n2 = 3;
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n1 & n2 = " + (n1 & n2));
		// 숫자의 어떤 특정 비트를 뽑아낼 때 자주 사용함
		// 예를 들어 0101000에서 2번째 비트의 값을 알고 싶을 때 0100000을 & 해서 결과를 비교
		System.out.println("n1 | n2 = " + (n1 | n2));
		System.out.println("~n1 = " + ~n1);
		
		// 치환하는 방법
		/* 1. temp 변수를 새롭게 정의하여 치환
		 * 2. ^ 를 사용하는 방법
		 * 		n1 = n1 ^ n2;
		 * 		n2 = n2 ^ n1;
		 * 		n1 = n1 ^ n2;
		 * 		결과 : n1 = 3, n2 = 5
		 *  */
		
		System.out.println("종료");
	}
}
