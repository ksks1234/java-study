package sec04_boundedtype.EX01_BoundedTypeOfGenericClass;

// 제네릭 클래스에서의 제네릭 타입 제한 범위 설정

class A {}
class B extends A{}
class C extends B{}

class D <T extends B > {	// B와 C만 올 수 있음
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;

	}
}
public class BoundedTypeOfGenericClass {
	public static void main(String[] args) {
		// D<A> d1 = new D<>();	// 불가능
		D<B> d2 = new D<>();
		D<C> d3 = new D<>();
		D d4 = new D<>();	// D<B> d4 = new D<>();
		
		d2.set(new B());
		d2.set(new C());
		
		// d3.set(newB());
		// d3 객체는 객체를 생성할 때 제네릭타입으로
		// C를 지정하므로 B 객체는 입력 불가능
		d3.set(new C());
		d4.set(new B());
		d4.set(new C());
	}
}
