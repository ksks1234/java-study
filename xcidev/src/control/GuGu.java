package control;

public class GuGu {
	public static void main(String[] args) {

		// for문 1
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}

		System.out.println("for2===============");

		// for문 2
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				for (int y = 0; y <= 3; y++) {
					System.out.printf((i+y) + " * " + j + " = " + ((i+y) * j) + "\t");
				}
				System.out.println();
			}
			i = i + 3;
			System.out.println();
		}
		System.out.println("for3===============");
		
		// for문 3
		for (int i = 2; i <= 9; i += 4) {           // i: 시작 단 (2, 6)
			for (int j = 1; j <= 9; j++) {          // j: 곱해지는 수
				for (int k = i; k < i + 4 && k <= 9; k++) {   // k: 단 (i부터 i+3까지, 단 9까지 제한)
					System.out.printf(k + " * " + j + " = " + (k * j) + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}

		System.out.println("while===============");

		// while문
		int i = 2;
		while (i < 10) {
			int j = 1;
			while (j < 10) {
				int y = 0;
				while (y < 4) {
					System.out.print((i + y) + " * " + j + " = " + (i + y) * j + "\t");
					y++;
				}
				j++;
				System.out.println();
			}
			i = i+4;
			System.out.println();
		}

		// do while문
	}

}
