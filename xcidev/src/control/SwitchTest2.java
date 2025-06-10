package control;

import java.util.Scanner;

public class SwitchTest2 {
	public static void main(String[] args) {
		/*
		 * Q. Scanner로 정수를 입력 변수 score에 저장. 
		 * 0 ~ 100 사이의 정수로 값이 잘 입력 되었다고 가정 
		 * 90~100 : A, 80 ~ 89 : B, 70 ~ 79 : C, 60 ~ 69 : D, 0 ~ 59 : F
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("score : ");
		int score = sc.nextInt();

		switch (score / 10) {
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		System.out.println("종료");
		sc.close();
	}
}
