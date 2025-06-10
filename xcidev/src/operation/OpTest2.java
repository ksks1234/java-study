package operation;

import java.util.Scanner;

public class OpTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// system.in -> 키보드 입력
		System.out.print("a : "); int a = sc.nextInt();
		System.out.print("b : "); int b = sc.nextInt();
		
		System.out.println(a + " > " + b + " = " + ( a > b));
		System.out.println(a + " >= " + b + " = " + ( a >= b));
		System.out.println(a + " < " + b + " = " + ( a < b));
		System.out.println(a + " <= " + b + " = " + ( a <= b));
		System.out.println(a + " == " + b + " = " + ( a == b));
		System.out.println(a + " |= " + b + " = " + ( a |= b));

		
		sc.close();
		// 잘 닫아주어야 한다.
		System.out.println("종료");
	}

}
