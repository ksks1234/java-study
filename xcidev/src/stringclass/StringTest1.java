package stringclass;

public class StringTest1 {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		// 힙에 만들어짐
		
		String str1 = new String("문자열");
		// 정석적인 방법
		String str2 = "문자열";
		// 일반적으로 사용하는 방법
		
		String str3 = "";
		for(int i=1; i<= 3; i++) {
			str3 +="ABC";
		}
		// 문자열은 객체를 만들 때 새로운 위치에 만들고, 로더가 링크를 건다.
		// 힙에 저장된 객체는 해싱 알고리즘이 이용된다.
		// 그리고 이전 참조하지 않는 객체는 GC 대상이 되어 삭제된다.
		// 특정 시점이 끝나면(블럭이 끝나거나 등) 해당 메모리가 삭제된다.
		System.out.println(str3);
		
		
		System.out.println("ABCDE".substring(2, 4));
		String a = new String("Hello");
		String b = new String("Hello");
		System.out.println(a == b);
		System.out.println(a.equals(b));
		String c = "Hello";
		String d = "Hello";
		System.out.println(c == d);
		System.out.println(c.equals(d));
		
	}

}
