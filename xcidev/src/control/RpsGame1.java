package control;

import java.util.Scanner;

public class RpsGame1 {
	public static void main(String[] args) {
		/*
		 * Q. 가위는 1, 바위는 2, 보는 3을 입력 >
		 * You : 가위 
		 * Com : 보 
		 * You WIN 
		 * You ...
		 */

		final int SCISSORS = 1;
		final int ROCK = 2;
		final int PAPER = 3;
		
		Scanner sc = new Scanner(System.in);
		int userNumber;
		do {
			// 사용자에게 메세지 출력
			System.out.print("가위는 1, 바위는 2 보는 3을 입력 (0은 종료)>> ");
			// 유저에게 입력받음
			userNumber = sc.nextInt();
			// 유저의 선택 메세지 출력
			System.out.print("You : ");
			switch (userNumber) {
			case 1 -> System.out.println("가위");
			case 2 -> System.out.println("바위");
			default -> System.out.println("보");
			}
			
			// 컴퓨터가 가위바위보 선택함
			int comNumber = (int) (Math.random() * 3 + 1);
			// 컴퓨터의 선택 메세지 출력
			System.out.print("Com : ");
			switch (comNumber) {
			case 1 -> System.out.println("가위");
			case 2 -> System.out.println("바위");
			default -> System.out.println("보");
			}
			
			// 유저의 값과 컴퓨터의 값 비교
			if (userNumber == comNumber) {
				System.out.println("비겼습니다.");
			} else if (userNumber == SCISSORS && comNumber == PAPER) {
				System.out.println("You WIN");
			} else if (userNumber == ROCK && comNumber == SCISSORS) {
				System.out.println("You WIN");
			} else if (userNumber == PAPER && comNumber == ROCK) {
				System.out.println("You WIN");
			} else {
				System.out.println("Com WIN");
			}
			// 유저가 0을 입력하면 종료
		} while (userNumber != 0);
		sc.close();
		System.out.println("종료");
	}
}