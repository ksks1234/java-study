package sec02_genericclass_EX03_Solution2_UsingObject.copy;

class Apple {
	@Override
	public String toString() {
		return "Apple입니다";
	}
}

class Pencil{
	@Override
	public String toString() {
		return "Pencil 입니다";
	}
}
class Goods <T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}

public class Solution2_UsingObject {
	public static void main(String[] args) {
		// Goods1을 이용해 Apple 객체를 추가하거나 가져오기
		Goods<Apple> goods1 = new Goods<>();
		goods1.set(new Apple());	
		Apple apple = goods1.get();	// 다운캐스팅 필요 없음
		System.out.println(apple.toString());
		
		// Goods2를 이용해 Pencil 객체를 추가하거나 가져오기
		Goods<Pencil> goods2 = new Goods<>();
		goods2.set(new Pencil());	// Pencil 타입만 입력 가능
		Pencil pencil = goods2.get();
		System.out.println(pencil.toString());
		
		// 잘못된 타입 선언
		Goods<Apple> goods3 = new Goods<>();
		goods3.set(new Apple());
//		Pencil pencil2 = goods3.get();
		// 강한 타입 체크로 문법 오류 발생
		// 컴파일 전 syntax error 남
		
	}

}
