package control;

import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		int s, b; // 스트라이크와 볼
		int c1, c2, c3; // 난수 값
		int h1, h2, h3; // 유저가 입력하는 값
		int count = 0; // 맞추는 횟수
		
		c1 = (int)(Math.random() * 10);
		do {
			c2 = (int) (Math.random() * 10);
		} while (c2 == c1); // 중복되지 않도록 비교
		do {
			c3 = (int) (Math.random() * 10);
		} while (c3 == c1 || c3 == c2); // 중복되지 않도록 비교
		
		
		Scanner sc = new Scanner(System.in);
		
		do {
			s = b = 0; // 스트라이크와 볼 초기화
			System.out.print("0부터 9사이의 중복되지 않은 숫자 3개 ex) 7 0 2 >> ");
			h1 = sc.nextInt();
			h2 = sc.nextInt();
			h3 = sc.nextInt();
			
			// 첫 번째 자리 숫자 검증
			if(h1 == c1) s++;
			else if (h1 == c2 || h1 == c3) b++;
			
			// 두 번째 자리 숫자 검증
			if(h2 == c2) s++;
			else if (h2 == c1 || h2 == c3) b++;
			
			// 세 번째 자리 숫자 검증
			if(h3 == c3) s++;
			else if (h3 == c1 || h3 == c2) b++;
			
			System.out.println(s + "S " + b + "B");
			count++;
		} while (s != 3);
		
		System.out.println("축하합니다! " + count + "번 만에 맞추셨습니다~!");
		sc.close(); // Scanner 닫음
	}
}
