package control;

public class DoWhileTest3 {
	public static void main(String[] args) {
		int dice1, dice2;
		dice1 = (int)(Math.random() * 6) + 1;
		// 바꾸고자 하는 구문을 블럭으로 잡고
		// 마우스 오른쪽 클릭 -> Surround With -> do 클릭( 그럼 변환이 됨 )
		do {
			dice2 = (int) (Math.random() * 6) + 1;
		} while ((dice1 == dice2)); // condition에 조건 설정
		System.out.println(dice1 + "," + dice2); // 중복 숫자는 안나옴
		System.out.println("종료");
		
		// 
	}
}
