package operation;

public class OpTest15 {
	public static void main(String[] args) {
		int dice = (int)(Math.random() * 6 + 1);
		/*
		 * Math.random()의 특징
		 * - 가장 큰 수   = 0.999999999
		 * - 가장 작은 수 = 0.000000000
		 * 그래서 Math.random() * 6을 하면 5.99999... 가 되므로 + 1을 해줘야 한다.
		 * 그리고 계산 전에 먼저 형변환을 취하면 자리수를 버려 0이 된다.
		 * */
		
		System.out.println(dice);
		System.out.println((int)(Math.random() * 6 + 1));
		System.out.println((int)(Math.random() * 6 + 1));
		System.out.println((int)(Math.random() * 6 + 1));
	}

}
