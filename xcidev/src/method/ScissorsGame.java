package method;

import java.util.Scanner;

public class ScissorsGame { // 기존 RpsGame1을 가져와 완성하기
	private static final int SCISSORS = 1;
	private static final int PAPER = 2;
	private static final int ROCK = 3;

	public static void main(String[] args) {

		int you;
		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.print("가위는 1, 바위는 2 보는 3을 입력 (0은 종료) > ");
				you = sc.nextInt();
				int com = (int) (Math.random() * 3) + 1;

				System.out.println("caption==============================");
				System.out.println("You : " + caption(you));
				System.out.println("Com : " + caption(com));
				resultMessage(you, com);

				/* println은 제약사항이 많음(모바일이나 다른 언어에 삽입 어려울 수 있음, 제한적임)
				 * System.out.println("printCaption==========================");
				 * System.out.print("You : "); printCaption(you); System.out.print("Com : ");
				 * printCaption(com); result(you, com);
				 */
			} while (you != 0);

		}

	}

	private static void resultMessage(int you, int com) {
		if (you == com) {
			System.out.println("비겼습니다.");
		} else if (you == SCISSORS && com == PAPER ||
				   you == ROCK     && com == SCISSORS ||
				   you == PAPER    && com == ROCK) {
			System.out.println("You WIN");
		} else {
			System.out.println("Com WIN");
		}
	}

	private static String caption(int val) {
		switch (val) {
		case 1:
			return "가위";
		case 2:
			return "바위";
		case 3:
			return "보";
		default:
			return "에러";
		}
	}

	private static void printCaption(int val) {
		switch (val) {
		case 1:
			System.out.println("가위");
			break;
		case 2:
			System.out.println("바위");
			break;
		case 3:
			System.out.println("보");
			break;
		default:
			System.out.println("에러");
		}
	}
}