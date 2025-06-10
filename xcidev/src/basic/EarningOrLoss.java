package basic;

public class EarningOrLoss {
	public static void main(String[] args) {
		double seed_money = 1_000_000; 
		// 편한대로 하면 되는데 달러면 3자리, 우리나라는 4자리로 구별
		seed_money = seed_money + (seed_money * 0.1); // 10% 수익
		seed_money = seed_money - (seed_money * 0.1); // 10% 손해
		System.out.println(seed_money); // 990000.0 (손실)

		seed_money = 1_000_000;
		seed_money = seed_money - (seed_money * 0.1); // 10% 손해
		seed_money = seed_money + (seed_money * 0.1); // 10% 수익
		System.out.println(seed_money); // 990000.0 (손실)

		seed_money = 1_000_000;
		seed_money = seed_money + (seed_money * 0.4); // 40% 손해
		seed_money = seed_money - (seed_money * 0.3); // 30% 수익
		System.out.println(seed_money); // 980000.0 (손실)

		seed_money = 1_000_000;
		for (int i = 1; i <= 50; i++) { // 50번 반복
			seed_money = seed_money + (seed_money * 0.4); // 40% 손해
			seed_money = seed_money - (seed_money * 0.3); // 30% 수익
		}
		System.out.println(seed_money); // 364169.6800871176 (손실)

		// 수익이 나려면 어떻게 해야할까? -> seed_money를 반으로 줄인다.
		// 켈리 공식
		seed_money = 1_000_000;
		for (int i = 1; i <= 50; i++) { // 50번 반복
			seed_money = seed_money + (seed_money / 2 * 0.4); // 40% 손해
			seed_money = seed_money - (seed_money / 2 * 0.3); // 30% 수익
		}
		System.out.println(seed_money); // 2691588.029073608 (수익)

	}
}
