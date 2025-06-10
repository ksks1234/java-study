package operation;

import java.util.Scanner;

public class OpTest1 {
	public static void main(String[] args) {
		int a = 10, b = 5;
		
		System.out.println(a + " + " + b + " = " + a + b); // 105
		System.out.println(a + " + " + b + " = " + ( a + b )); // 15
		System.out.println(a + " - " + b + " = " + ( a - b )); // 5
		System.out.println(a + " * " + b + " = " + ( a * b )); // 50
		System.out.println(a + " / " + b + " = " + ( a / b )); // 2
		// 정수와 정수를 연산하면 정수가 된다. ex) 7/4 = 1
		// 제대로 된 결과를 얻고 싶다면 형변환이 필요하고 형변환은 연산이 되기 전에 변환되어야 한다.
		// System.out.println(a + " / " + b + " = " + ( a / (double)b )); 7/4 = 1.75
		System.out.println(a + " % " + b + " = " + ( a % b )); // 0
		
		Scanner sc = new Scanner(System.in);
		// system.in -> 키보드 입력
		System.out.print("a : "); a = sc.nextInt();
		System.out.print("b : "); b = sc.nextInt();
		
		System.out.println(a + " + " + b + " = " + a + b);
		System.out.println(a + " + " + b + " = " + ( a + b ));
		System.out.println(a + " - " + b + " = " + ( a - b ));
		System.out.println(a + " * " + b + " = " + ( a * b )); 
		System.out.println(a + " / " + b + " = " + ( a / b )); 
		System.out.println(a + " % " + b + " = " + ( a % b ));
		
		sc.close();
		// 잘 닫아주어야 한다.
		System.out.println("종료"); // 15
	}

}
