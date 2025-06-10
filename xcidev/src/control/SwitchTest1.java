package control;

public class SwitchTest1 {
	public static void main(String[] args) {
		int n = 1;

		// 세가지 case 모두 출력됨
		switch (n) {
		case 1:
			System.out.println("남자");
		case 2:
			System.out.println("여자");
		default:
			System.out.println("에러");
		}
		System.out.println("종료");

		// break문
		switch (n) {
		case 1:
			System.out.println("남자");
			break;
		case 2:
			System.out.println("여자");
			break;
		default:
			System.out.println("에러");
		}
		System.out.println("종료");

		/*
		 * case 1, 3 남자 case 2, 4 여자 그 외 에러
		 */
		n = 5;

		switch (n) {
		case 1, 3, 5:
			System.out.println("남자");
			break;
		case 2, 4, 6:
			System.out.println("여자");
			break;
		default:
			System.out.println("에러");
		}
		System.out.println("종료");

		// 위와 아래가 같은 거임
		// 위는 자바 버전이 올라가면서 생긴 기능
		// 저런게 있다는 것만 알고 있을 것
		switch (n) {
		case 1:
		case 3:
			System.out.println("남자");
			break;
		case 2:
		case 4:
			System.out.println("여자");
			break;
		default:
			System.out.println("에러");
		}
		
		// break문과 같은 역할 ->
		switch (n) {
		case 1, 3, 5 ->
			System.out.println("남자");
		case 2, 4, 6 ->
			System.out.println("여자");
		default ->
			System.out.println("에러");
		}		
		System.out.println("종료");
	}
}
