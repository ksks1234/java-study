package sec01_accessmodifier.EX03_AccessModifierOfClass_2;

import sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.AA;
//import sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.BB;
import sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.CC;

public class AccessModifierOfClass_2 {
	public static void main(String[] args) {
		// 객체 생성
		AA a = new AA();
//		BB b = new BB();
//		CC c = new CC();
		
		/*
		 * 같은 패키지에서는 public 클래스와
		 * default 클래의 타입 모두 객체를 선언할 수 있다.
		 * public 생성자와 default 생성자 모두 호출 가능
		 */
	}
}
