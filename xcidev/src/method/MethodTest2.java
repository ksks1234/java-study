package method;

public class MethodTest2 {
	public static void main(String[] args) {
		int a = 10, b = 5;
		System.out.println(a + "+" + b + "=" + add(a, b));
		System.out.println(a + "-" + b + "=" + sub(a, b));
		System.out.println(a + "*" + b + "=" + mul(a, b));
		System.out.println(a + "/" + b + "=" + div(a, b) + "..." + mod(a, b));
		System.out.println("종료");
		
	}

	private static int mod(int a, int b) {
		int mod = a % b;
		return mod; // a % b;
	}

	private static int div(int a, int b) {
		int div = a / b;
		return div;	// a / b;
	}

	private static int mul(int a, int b) {
		int mul = a * b;
		return mul;	// a * b;
	}

	private static int sub(int a, int b) {
		int sub = a - b;
		return sub;	// a - b;
	}

	private static int add(int a, int b) {
		int sum = a + b;
		return sum;	// a + b;
	}

}
