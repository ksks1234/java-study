package control;

public class IfTest1 {
	public static void main(String[] args) {
		int n = 1; // 주민등록번호 7번째 숫자일 경우

		// 기본 if문과 if-else문
		if (n == 1) {
			System.out.println("남자입니다.");
		} else {
			System.out.println("여자입니다.");
		}
		System.out.println("종료");

		// if-else if-else 문
		if (n == 1) {
			System.out.println("남자입니다.");
		} else if (n == 2) {
			System.out.println("여자입니다.");
		} else if (n == 3) {
			System.out.println("남자입니다.");
		} else if (n == 4) {
			System.out.println("여자입니다.");
		} else if (n == 5) {
			System.out.println("외국인 남자입니다.");
		}
		System.out.println("종료");
		
		// if-else if-else 문의 조건문2
		if (n == 1 || n == 3) {
			System.out.println("남자입니다.");
		} else if (n == 2 || n == 4) {
			System.out.println("여자입니다.");
		} else if (n == 5) {
			System.out.println("외국인 남자입니다.");
		}
		System.out.println("종료");
	}

}
