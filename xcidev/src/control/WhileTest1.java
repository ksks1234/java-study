package control;

public class WhileTest1 {
	public static void main(String[] args) {

//		for (int n = 1; n <= 3; n++) {
//			System.out.println("sysone");
//		}
		
		// 위 for문을 while문으로 변환
		// 초기식은 젤 처음에 두기
		// 조건식은 while의 조건식에 넣기
		// 증감식은 꼭 마지막에 두기
		int n = 1;
		while (n <= 3) {
			System.out.println(n + "0:sysone");
			n++;
		}
		System.out.println("종료");
	}
}
