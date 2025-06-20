package sec01_theceedforgeneric_EX02_Solution1_UsingObject;

// Apple, Pencil 클래스를 모두 저장하거나 꺼낼 수 있는 클래스
class Apple {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Apple입니다";
	}
}

class Pencil{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Pencil 입니다";
	}
}
class Goods {
	private Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	

}

public class Solution1_UsingObject {
	public static void main(String[] args) {
		// Goods1을 이용해 Apple 객체를 추가하거나 가져오기
		Goods goods1 = new Goods();
		goods1.setObject(new Apple());	
		Apple apple = (Apple) goods1.getObject();
		System.out.println(apple.toString());
		
		// Goods2를 이용해 Pencil 객체를 추가하거나 가져오기
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil());	// Pencil 타입만 입력 가능
		Pencil pencil = (Pencil) goods2.getObject();
		System.out.println(pencil.toString());
		
	}

}
