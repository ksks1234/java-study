package control;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		/*
		 * Q. Scanner로 정수를 입력 변수 score에 저장. 
		 * 0 ~ 100 사이의 정수로 값이 잘 입력 되었다고 가정 
		 * 90~100 : A
		 * 80 ~ 89 : B 
		 * 70 ~ 79 : C 
		 * 60 ~ 69 : D 
		 * 0 ~ 59 : F
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("score : ");
		int score = sc.nextInt();

		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else if (score >= 0) {
			System.out.println("F");
		} else {
			System.out.println("0 ~ 100까지의 숫자를 입력해 주세요");
		}
		
		// 위의 문을 한 줄로 적음
		if 		(score >= 90) System.out.println("A");
		else if (score >= 80) System.out.println("B");
		else if (score >= 70) System.out.println("C");
		else if (score >= 60) System.out.println("D");
		else if (score >= 0) System.out.println("F");
		else System.out.println("F");
		
		// 조건문을 비교문으로 할 경우, 방향성을 비슷하게 하여 가독성을 높이자
		// 컴퓨터 성능이 좋아져서, 빅데이터 같이 몇 천만건 처리가 아니면
		// 위 식과 아래 식의 성능 차이를 고려할 정도는 아니다.
		if 		(score <= 90 && score >= 100) System.out.println("A");
		else if (score <= 80 && score >= 89) System.out.println("B");
		else if (score <= 70 && score >= 79) System.out.println("C");
		else if (score <= 60 && score >= 69) System.out.println("D");
		else System.out.println("F");

		sc.close();
	}

}
