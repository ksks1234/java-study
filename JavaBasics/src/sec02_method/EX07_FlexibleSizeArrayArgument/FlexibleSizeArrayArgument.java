package sec02_method.EX07_FlexibleSizeArrayArgument;

public class FlexibleSizeArrayArgument {
	public static void main(String[] args) {
		// method1(int... values)
		method1(1, 2);
		method1(1, 2, 3);
		method1();
		
//		mehtod2(String...values)
		method2("안녕", "방가");
		method2("땡큐", "베리", "감사");
		method2("");
	}
	
	public static void method1(int...values) {
		/*
		 * 배열 출력 방법 1
		 * for (int i = 0; i < values.length; i++) {
		 * 	Sytem.out.print(values[i] + " ");
		 * }
		 */
		// 배열 출력 방법 2
		for(int k : values) {
			System.out.print(k + " ");
		}
		/*
		 * 배열 출력 방법 3
		 * System.out.println(Arrays.toString(values);
		 */
		System.out.println();
	}
	public static void method2(String...values) {
		/*
		 * 배열 출력 방법 1
		 * for (int i = 0; i < values.length; i++) {
		 * 	Sytem.out.print(values[i] + " ");
		 * }
		 */
		// 배열 출력 방법 2
		for(String k : values) {
			System.out.print(k + " ");
		}
		/*
		 * 배열 출력 방법 3
		 * System.out.println(Arrays.toString(values);
		 */
		System.out.println();
	}
	

}
