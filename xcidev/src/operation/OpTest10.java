package operation;

public class OpTest10 {
	public static void main(String[] args) {
		// 축약형 7
		int a = 10;
		int b = 5;
		
		b += a++;
		// 가능하지만, 권장하지 않음
		b += ++a;
		// b = b + (++a)
		System.out.println("a, b = " + a + ", " + b);
	}

}
