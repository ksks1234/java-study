package sec02_string.EX04_PlusOperationOfString;

public class SharingStringObject {
	public static void main(String[] args) {
		String str1 = new String("안녕");
		String str2 = "안녕";
		String str3 = "안녕";
		String str4 = new String("안녕");
		
		// 스택 메모리값 비교(==)
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str2 == str3 : " + (str2 == str3));
		System.out.println("str3 == str4 : " + (str3 == str4));
		System.out.println("str4 == str1 : " + (str4 == str1));
	}

}
