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
		 * 클래스 AA는 
		 * public 생성자이므로 
		 * 다른 패키지에서 객체 선언과 생성자 호출 가능
		 * 클래스 BB는 
		 * import 할 수 없으므로
		 * 객체 선언과 생성자 호출 불가능
		 * 클래스CC는
		 * 객체는 선언할 수 있지만
		 * defualt 생성자이므로 생성자 호출 불가능
		 */
	}
}
