package basic;

import java.math.BigDecimal;

public class PrimitiveTypes {
	public static void main(String[] args) {
		// 자바의 8가지 자료형
		
		boolean b = true; // 1byte
		System.out.println(b);
		
		byte b2 = 10; // -128 ~ 127 , 1byte
		System.out.println(b2);
		
		char c = '밥'; // 오직 하나의 문자만, 2byte, 0 ~ 2^16(65535)까지 문자가 매핑
		
		int i = 2147483647; // -2^31 ~ 2^31 -1,20억 만
		System.out.println(i);
		i = i + 1; // 만약 +1을 한다면 순환이 되며 제일 작은 수로 간다.
		System.out.println(i); // -2147483648
		
		short sh = 32767; // -2^15 ~ 2^15 -1(-32768 ~ 32767) 2byte
		System.out.println(sh);
		
		long lo = 2147483648L; // L을 꼭 붙여서 long인걸 알려줘야함, int의 2배의 자릿수 8byte
		System.out.println(lo);
		
		double d = 3.1415926535; // 8byte
		System.out.println(d);
		
		float f = 3.1415926535f; // 4byte, 정밀함이 필요하면 double을 쓴다.
		System.out.println(f);
		
		System.out.println(2 - 1.1); // 예상 결과 : 0.9, 결과 : 0.8999999999999999
		
		BigDecimal bi = new BigDecimal("2");
		System.out.println(bi.subtract(new BigDecimal("1.1"))); // 0.9
		// 달러, 센트 등 정확한 금액을 계산할 때 쓰면 좋음
		
	}

}
