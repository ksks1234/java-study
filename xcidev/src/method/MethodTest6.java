package method;

public class MethodTest6 {
	public static void main(String[] args) {
		int[] a = {10};
		
		callref(a);
		System.out.println("callref : " + a[0]);
		System.out.println("종료");
	}

	private static void callref(int[] a) { // 배열을 가리키는 id값이 넘어감, 값이 넘어가는게 아님
		System.out.println("callref : " + a[0]);
		a[0]++;
		System.out.println("callref : " + a[0]);
		
	}

}