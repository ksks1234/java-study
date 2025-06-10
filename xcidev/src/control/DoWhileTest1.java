package control;

public class DoWhileTest1 {
	public static void main(String[] args) {

		int i = 1;
		while (i <= 3) {
			System.out.println("SysOne");
			i++;
		}
		System.out.println("종료");

		// 위의 while문을 do while로 변환
		i = 1;
		do {
			System.out.println("Sysone");
			i++;
		} while (i <= 3);
		System.out.println("종료");

		// 1부터 1000까지 4의 배수의 합 구하기
		int sum = 0;
		i = 1;
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
