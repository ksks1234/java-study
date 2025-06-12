package oop4;

class RefMe{
	RefMe() {
		System.out.println("RefMe() 수행");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("낮의 빛이 밤의 어둠의 깊이를 알게뭐냐");
	}
	// finalize : gc에 수집될 때 실행, 근데 없어질 예정
}

public class ReferenceTest {
	public static void main(String[] args) throws Exception {
		RefMe r1 = new RefMe();
		RefMe r2 = r1;
		r1 = null;
		System.gc();
		System.out.println("r1에 null 할당");
		Thread.sleep(1000);

		r2 = null;
		System.gc();
		System.out.println("r2에 null 할당");
		Thread.sleep(1000);
		
		System.out.println("종료");
	}

}
