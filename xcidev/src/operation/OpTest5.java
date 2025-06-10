package operation;

public class OpTest5 {
	public static void main(String[] args) {
		// 축약형 연산2
		int a = 10;
		
		a = a + 1;
		// ++a, a++ 와 같음
		
		System.out.println(a);
		int b = a++;
		/*
		 * b = a
		 * a = a + 1
		 * (전위 증가)
		 * */
		System.out.println(b);
		System.out.println("a, b = " + a + ", " + b);
		
	}

}
