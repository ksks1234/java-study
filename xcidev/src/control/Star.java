package control;

public class Star {
	public static void main(String[] args) {
		System.out.println("왼쪽 정렬 피라미드===============================");
		int i = 1;
		while (i <= 5) {
			int j = 1;
			while (j <= 6) {
				if(i >= j) System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("오른쪽 정렬 피라미드===============================");
		i = 1;
		while (i <= 5) {
			int j = 1;
			while (j <= 6) {
				if(i > 6-j) System.out.print("*");
				else System.out.print(" ");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("거꾸로 가운데 정렬===============================");
		i = 1;
		while (i <= 5) {
			int j = 1;
			while (j <= 6 - i) {
				if (i <= j)
					System.out.print("*");
				else
					System.out.print(" ");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("거꾸로 오른쪽 정렬===============================");
		i = 1;
		while (i <= 5) {
			int j = 1;
			while (j <= 5) {
				if (i <= j)
					System.out.print("*");
				else
					System.out.print(" ");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("거꾸로 왼쪽 정렬===============================");
		i = 1;
		while (i <= 5) {
			int j = 1;
			while (j <= 5) {
				if (i <= j)
					System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("===============================");
		for (int z = 1; z <= 5; z++) {
			for (int x = z; x <= 4; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
