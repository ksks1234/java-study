package sec02_string.EX05_MethodsOfString_1;

import java.util.Arrays;

public class MethodsOfString_1 {
	public static void main(String[] args) {
		// 문자열 길이
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		System.out.println(str1.length());
		System.out.println(str2.length()); // 한글, 영문 구분없이 한 문자당 1개의 크기를 가짐
		System.out.println();
		
		// 문자열 검색
		// @chatAt()
		System.out.println(str1.charAt(1));
		System.out.println(str2.charAt(1)); // 한글, 영문 구분 없이 인덱스 1 위치의 문자
		System.out.println();
		
		// @indexOf(), lastIndexOf()
		System.out.println(str1.indexOf('a'));			// 앞에서부터 첫번째 'a'가 위치한 인덱스
		System.out.println(str1.lastIndexOf('a'));		// 뒤에서부터 첫번째 'a'가 위치한 인덱스
		System.out.println(str1.indexOf('a', 8));
		System.out.println(str1.lastIndexOf('a', 8));
		System.out.println(str1.indexOf("Java"));
		System.out.println(str1.lastIndexOf("Java"));
		System.out.println(str2.indexOf("하세요"));
		System.out.println(str2.lastIndexOf("하세요"));
		System.out.println(str1.indexOf("Bye")); // 해당 문자열이 없는 경우 -1 리턴
		System.out.println(str2.lastIndexOf("고맙습니다."));
		System.out.println();
		
		// 문자열 변환 및 연결
		// @String.valueOf(기본 자료형): 기본 자료형 -> 문자열 변환
		String str3 = String.valueOf(2.3);
		String str4 = String.valueOf(false);
		System.out.println(str3);
		System.out.println(str4);
		
		// @concat(): 문자열 연결
		String str5 = str3.concat(str4);
		System.out.println(str5);
		
		// String.valueOf() + concat()
		String str6 = "안녕" + 3;
		String str7 = "안녕".concat(String.valueOf(3));
		
		// 문자열을 byte[] 또는 char[]로 변환
		String str8 = "Hello Java";
		String str9 = "안녕하세요";
		
		// @getBytes(): 문자열 -> byte[] 변환
		byte[] array3 = str8.getBytes();
		byte[] array4 = str9.getBytes();
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
	}

}
