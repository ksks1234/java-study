package sec01_finalmodifier.EX01_FinalModifier_2;


class A {
	void abc() {}
	final void bcd() {}
}

class B extends A {
	void abc() {}
	void bcd() {}
	// final 필드는 최초 선언된 이후 값을 대입할 수 없음
}

final class C {
}

class D extends C {
	// final 필드는 최초 선언된 이후 값을 대입할 수 없음
}

public class FinalModifier_2 {
	public static void main(String[] args) {
		
	}
}
