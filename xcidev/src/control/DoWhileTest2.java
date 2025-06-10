package control;

public class DoWhileTest2 {
	public static void main(String[] args) {

		// 1부터 1000까지 4의 배수의 합 구하기
		int sum = 0;
		int i = 1;
		do {
			if (i % 4 == 0) {
				sum += i;
			}
			i++;
		} while (i <= 1000);
		System.out.println(sum);
		System.out.println("종료");
	}
}
