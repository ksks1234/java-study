package oop11b;
//simple factory pattern
//GoF 패턴에 있는 건 아님
public class TVFactory {
	public static TV getTv() {
		String tvClassName = null;
		try {
			tvClassName = productReader.getValue("tv");
			return (TV) Class.forName(tvClassName).getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			System.out.println(tvClassName + " 클래스가 존재하지 않거나 에러입니다.");
		}
		return null;
	}
	

}
