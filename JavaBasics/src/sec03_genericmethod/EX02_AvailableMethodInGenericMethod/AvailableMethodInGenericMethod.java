package sec03_genericmethod.EX02_AvailableMethodInGenericMethod;

class A {
	public <T> void method(T t) {
//		System.out.println(t.length());
		// 불가능 - String 메서드 호출 불가능
		System.out.println(t.equals("안녕"));
		// 가능 - Object 메서드만 호출 가능
	}
}
public class AvailableMethodInGenericMethod {
	public static void main(String[] args) {
		
		A a = new A();
		a.<String>method("안녕");
	}

}
