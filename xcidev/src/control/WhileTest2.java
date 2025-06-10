package control;

public class WhileTest2 {
	public static void main(String[] args) {

		// 1부터 1000까지 3의 배수의 합계
		
//		for (int i = 1; i <= 1000; i++) { // 1부터 1000까지 3의 배수의 합계
//			if (i % 3 == 0) {
//				sum += i;
//			}
//		}
		// 1번 풀이
		int sum1 = 0;
		int i = 1;
		while (i <= 1000) {
			if (i % 3 == 0) {
				sum1 += i;
			}
			i++;
		}
		System.out.println(sum1);
		System.out.println("종료");
		
		// 2번 풀이
//		for (int i = 3; i <= 1000; i += 3) { // 1부터 1000까지 3의 배수의 합계
//			sum += i;
//		}
		int sum2 = 0;
		int j = 3;
		while(j <= 1000) {
			sum2 += j;
			j += 3;
		}
		System.out.println(sum2);
		System.out.println("종료");
	}
}
