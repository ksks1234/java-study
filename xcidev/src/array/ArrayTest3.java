package array;

public class ArrayTest3 {
	public static void main(String[] args) {

		// [행][열]
		int[][] score = 
			{ 
				{ 100, 90, 80, 70 }, 
				{  90, 80, 70, 60 }, 
				{  80, 70, 60, 50 } 
			};

		// 만약 [][][] 이렇게 3개면?
		// [표][행][렬]
		
		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
		for (int row = 0; row < score.length; row++) {
			int sum = 0;
			// score.length => 행의 갯수임(주소가 세로로 참조함)
			for (int col = 0; col < score[row].length; col++) {
				// score[row].length => 자바는 row의 갯수가 다를 수 있으므로 0이 아닌 row를 정확하게 쓴다.
				System.out.print(score[row][col] + "\t");
				sum = sum + score[row][col];
			}
			System.out.println(sum + "\t" + sum / score[row].length);
		}

		System.out.println("종료");

	}
}
