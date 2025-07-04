package sec02_exceptionhandlingsyntax.EX04_MultiCatch_3;

public class MultiCatch_3 {
	public static void main(String[] args) {
		// 1. catch 블록을 각각 처리했을 때
		try {
			System.out.println(3 / 1);
			int num = Integer.parseInt("10A");
		} catch (ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		} catch (NumberFormatException e) {
			System.out.println("예외가 발생했습니다.");
		}
		System.out.println();

		// 2. catch 블록을 하나로 통합했을 때

		try {
			System.out.println(3 / 1);
			int num = Integer.parseInt("10A");
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println("예외가 발생했습니다.");
		}
	}

}
