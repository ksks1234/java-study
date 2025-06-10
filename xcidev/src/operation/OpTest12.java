package operation;

import java.util.Scanner;

public class OpTest12 {
	public static void main(String[] args) {
		/*
		 * Q. Scanner를 사용하여 정수를 입력
		 * ex) 10 또는 -5를 입력했다면
		 * 10(은)는 짝수입니다.
		 * -5(은)는 홀수입니다.
		 */

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a % 2 == 0 ? 
						   a + "(은)는 짝수입니다." : a + "(은)는 홀수입니다.");
		sc.close();
		
		// 만약, a = -5, a % 2 로 나머지 연산을 할 경우,-2가 되는 경우가 생김
		// 음수값을 나머지 연산 적용시 반드시 절대값을 먼저 취해야 한다.
		
		int b = -5;
		System.out.println(b % 2 == 1 ? 
						   b + "(은)는 짝수입니다." : b + "(은)는 홀수입니다.");
		System.out.println(b % 2 == 1 ? 
						   Math.abs(b) + "(은)는 짝수입니다." : b + "(은)는 홀수입니다.");
		
	}

}
