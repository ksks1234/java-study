package exception;

import java.util.Random;
import java.util.Scanner;
/*
 * 컴퓨터가 만든 1~99 사이의 값을 맞추는 UpDown 게임을 작성
 * System.out.println("맞았습니다. 컴퓨터가 생각하던 값은 " + n + "입니다."); // 몇 번의 시도만에 맞췄는지 출력
 * 
 * switch-cast를 자바 7버전 이하로 작성
 */
public class ExceptionTest5 {
	public static void main(String[] args) {
//		int n = (int)(Math.random() * 99) + 1;
		Random random = new Random();
		int n = random.nextInt(99) + 1;
		// Math.random 이랑 같은 기능
		int you = 0;
		int cnt = 0;
		try(Scanner sc = new Scanner(System.in)) {
			while (true) {
				cnt++;
				System.out.println("1부터 99사이의 정수를 입력하세요 > ");
				if (!sc.hasNextInt()) {
					System.out.println("값이 잘못 입력되었습니다.");
					sc.nextLine();
					continue;
				}
				you = sc.nextInt();
				sc.nextLine();
				if( !(1<= you && you <= 99)) {
					System.out.println("값의 범위가 틀렸습니다. 1<= x <= 99 사이의 정수로 입력하세요");
				} else if(you != n) {
					printUpOrDown(you, n);
				} else {
					printResultMessage(cnt, you ,n);
					break;
				}
			}
		}
		System.out.println("종료");
	}

	private static void printUpOrDown(int you, int n) {
		if(you > n) {
			System.out.println("Down");
		} else {
			System.out.println("Up");
		}
	}

	private static void printResultMessage(int cnt, int you, int n) {
		System.out.println("입력 값은 " + you + "입니다.");
		switch(cnt) {
		case 16 :
		case 15 :
		case 14 :
		case 13 :
			System.out.println("아쉽네...");
			break;
		case 12 :
		case 11 :
		case 10 :
		case  9 :
			System.out.println("그렇저렇이군...");
			break;
		case 8:
		case 7:
		case 6:
		case 5:
			System.out.println("Good~!");
			break;
		case 4 : 
		case 3 : 
		case 2 : 
		case 1 : 
			System.out.println("Great~!");
			break;
		default :
			System.out.println("...분발을 요구함");
		}
		System.out.println("맞았습니다. 컴퓨터가 생각하던 값은 " + n + "입니다. 도전횟수: " + cnt);
	}

}
