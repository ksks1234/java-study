package array;

public class ArrayTest1 {
	public static void main(String[] args) {
/*
 * 		// 배열 선언 방법 1
		int[] s = new int[3];
		// int[]s = new int[3]; 이렇게 s를 붙여도 가능

		s[0] = 100;
		s[1] = 200;
		s[3] = 300;
		
		// 배열 선언 방법 2
		int[] s = new int[] {100,200,300};
*/
		// 배열 선언 방법 3
		int[] s = {100,200,300};
		
		// 배열 출력 방법 1
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println("종료");

		// 배열 출력 방법 2
//		for(int i = 0; i < 3; i++) {
		// 배열의 크기가 변할 수 있음
//		for (int i = 0; i < s.length; i++) {
		// s.length 이건 수천만건의 데이터를 length하는 적절하지 않을 수 있음
		
		int len = s.length; 
		// 위를 해결하기 위해 length를 변수에 넣고 사용하기
		for (int i = 0; i < len; i++) {
			System.out.println(s[i]);
		}
		System.out.println("종료");

	}
}
