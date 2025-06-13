package oop8;

public class AnimalTest {
	public static void main(String[] args) {
		/*
		 **** 클래스 사이의 형변환
		 *1. 반드시 extends, implements 관계에서 가능
		 *2. 업 캐스팅은 무조건 가능
		 *3. 다운 캐스팅은 원 인스턴스가 현재 다운캐스팅 하려는 타입 또는
		 *	 서브 타입인 경우에 가능
		 *4. 현재 참조하는 타입에 정의되었거나 상속받은 멤버에만 접근 가능
		 */
		Animal a = new Animal();
		System.out.println(a);
		
		Animal b = new Bird();
		System.out.println(b);
		
		Animal condor = new Condor();
		System.out.println(condor);
		
		Bird b2 = new Condor();
		System.out.println(b);
		
		Bird b3 = (Bird) b;
		System.out.println(b3);
		System.out.println(b3.wings());
		
		Bird b4 = new Bird();
		System.out.println(b4);
		
//		Condor c2 = (Condor) b4;	// 에러
//		System.out.println(c2);
		
		Condor c3 = (Condor) b2;
		System.out.println(c3);
		System.out.println(c3.attack());
		System.out.println(c3.wings());
		
		Animal a3 = new Cat();
		System.err.println(a3);
		
//		Bird b5 = (Bird) a3;
//		System.out.println(b5);
		// Runtime에서 에러, 클래스 캐스트 오류
		// 단일 상속만 가능하기 때문에 안됨
		// 대부분의 객체 지향은 이런 업다운 캐스팅 구조를 가지고 있음
	}

}
