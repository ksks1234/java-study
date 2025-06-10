package array;

public class ArrayTest4 {
	public static void main(String[] args) {

		// [표][행][렬]
		int[][][] score = 
			{ 
				{ 
					{ 90, 90, 80, 70 }, 
					{ 90, 70, 70, 60 }, 
					{ 80, 50, 60, 50 } 
					},
				{ 
					{ 100, 90, 80, 70 }, 
					{  90, 80, 70, 60 }, 
					{  80, 70, 60, 50 } 
				} 
			};
		
		for (int tab = 0; tab < score.length; tab++) {
			System.out.println((tab + 1) + "학기의 성적");
			System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
			for (int row = 0; row < score[tab].length; row++) {
				int sum = 0;
				for (int col = 0; col < score[tab][row].length; col++) {
					System.out.print(score[tab][row][col] + "\t");
					sum += score[tab][row][col];
				}
				System.out.println(sum + "\t" + sum / score[tab][row].length);
			}
			System.out.println();
		}

		System.out.println("종료");

	}
}
