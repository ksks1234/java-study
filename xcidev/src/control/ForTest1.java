package control;

public class ForTest1 {
	public static void main(String[] args) {
		
		for (int n = 1; n <= 3; n++) {
			System.out.println("sysone");
		}
		System.out.println("종료");
		
		/*
		 * 출력 결과가 아래와 같도록 하기 
		 * 10:sysone 
		 * 20:sysone 
		 * 30:sysone 
		 * 종료
		 */

		// 1. 조건문 건드리기
		for (int n = 10; n <= 30; n = n + 10) {
			System.out.println(n + ":sysone");
		}
		System.out.println("종료");

		// 2. 출력문 건드리기 1
		for (int n = 1; n <= 3; n++) {
			System.out.println(n * 10 + ":sysone");
		}
		System.out.println("종료");
		
		// 3. 출력문 건드리기 2
		for (int n = 1; n <= 3; n++) {
			System.out.println(n + "0:sysone");
		}
		System.out.println("종료");
	}
}
