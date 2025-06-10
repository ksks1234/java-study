package control;

public class ForTest2 {
	public static void main(String[] args) {
		int sum = 0;

		// 1번 풀이 - for문 안에 if문
		for (int i = 1; i <= 1000; i++) { // 1부터 1000까지 3의 배수의 합계
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("1부터 1000까지의 3의 배수의 합계는 " + sum);
		System.out.println("종료");

		sum = 0;

		// 2번 풀이 - for문의 조건식을 3의 배수가 되도록 수정
		for (int i = 3; i <= 1000; i += 3) { // 1부터 1000까지 3의 배수의 합계
			sum += i;
		}
		System.out.println("1부터 1000까지의 3의 배수의 합계는 " + sum);
		System.out.println("종료");

	}
}
