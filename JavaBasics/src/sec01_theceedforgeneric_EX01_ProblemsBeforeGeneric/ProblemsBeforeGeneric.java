package sec01_theceedforgeneric_EX01_ProblemsBeforeGeneric;
// Apple 클래스와 Apple 클래스를 담을 수 있는 Goods1 클래스
class Apple {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Apple입니다";
	}
}
class Goods1 {
	private Apple apple;
	public Apple getApple() {
		return apple;
	}
	
	public void setApple(Apple apple) {
		this.apple = apple;
	}

	
}

// Pencil 클래스와 Pencil 클래스를 담을 수 있는 Goods2 클래스
class Pencil{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Pencil 입니다";
	}
}
class Goods2 {
	private Pencil pencil;
	

	public Pencil getPencil() {
		return pencil;
	}
	

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}


}

public class ProblemsBeforeGeneric {
	public static void main(String[] args) {
		// Goods1을 이용해 Apple 객체를 추가하거나 가져오기
		Goods1 goods1 = new Goods1();
		goods1.setApple(new Apple());	// Apple 타입만 입력 가능
		Apple apple = goods1.getApple();
		System.out.println(apple.toString());
		
		// Goods2를 이용해 Pencil 객체를 추가하거나 가져오기
		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil());	// Pencil 타입만 입력 가능
		Pencil pencil = goods2.getPencil();
		System.out.println(pencil.toString());
		
	}

}
