package sec01_array.EX09_ReadArrayData_2D;

public class ReadArrayData_2D {
	public static void main(String[] args) {
		// 2차원 데이터의 배열의 길이
		int[][] array1 = new int[2][3];
		System.out.println(array1.length);
		System.out.println(array1[0].length);
		System.out.println(array1[1].length);
		System.out.println();

		int[][] array2 = new int[][] { { 1, 2 }, { 4, 5, 6 } };
		System.out.println(array2.length);
		System.out.println(array2[0].length);
		System.out.println(array2[1].length);
		System.out.println();

		// 2차원 배열의 출력 방법
		System.out.print(array2[0][0] + " ");
		System.out.print(array2[0][1] + " ");
		System.out.println();
		System.out.print(array2[1][0] + " ");
		System.out.print(array2[1][1] + " ");
		System.out.println(array2[1][2]);

		// 출력하기 2
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		
		// 출력하기 3
		// for-each문 사용하기
		for (int[] array : array2) {
			for (int k : array) {
				System.out.print(k + " ");
			}
		}
		System.out.println();

	}
}
