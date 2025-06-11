package study;

public class control {
	public static void main(String[] args) {
		for(int i = 0; i <= 9; i++) {
			System.out.println(i);
		}
		System.out.println("====1==================================");
		for(int j = 0; j <= 9; j++) {
			System.out.println(j);
		}
		System.out.println("====2==================================");
		for(int z = 0; z <= 4; z++) {
			System.out.println(z);
		}
		System.out.println("====3==================================");
		int cnt = 1;
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
//				System.out.println("i = " + i + " j = " + j);
				for(int z = 0; z <= 3; z++) {
//					System.out.print(" i = " + i + " j = " + j + " i * j = " + i*j);
					System.out.print((i + z) + " * " + j +" = " + (i + z) * j+"\t");
				}
				System.out.println("============" + cnt++ + "=============");
			}
			System.out.println(cnt += 3);
			i = i + 3;
		}
		System.out.println("====1==================================");
		
	}
}
