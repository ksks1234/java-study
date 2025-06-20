package sec02_genericclass_EX01_SingleGenericArgument;

class MyClass<T> {
	private T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

public class SingleGenericArgument {
	public static void main(String[] args) {
		MyClass<String> mc1 = new MyClass<String>();
		// String 타입을 저정하거나 꺼낼 수 있는 객체로 지정
		mc1.setT("안녕");
		System.out.println(mc1.getT());
		MyClass<Integer> mc2 = new MyClass<>();
		// Integer 타입을 저장하거나 꺼낼 수 있는 객체로 지정
		// 오른쪽에 타입을 안써도 왼쪽의 타입을 따라감
		mc2.setT(100);
		System.out.println(mc2.getT());
		MyClass<Integer> mc3 = new MyClass<>();
//		mc3.setT("안녕"); // 강한 타입 체크로 문법 오류 발생
		// Integer 를 int로 적는 행위 X
		
	}

}
