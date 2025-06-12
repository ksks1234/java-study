package oop6;

// 싱글톤 만들기 2
public class Single3 {
	// Eager Initalization : 조기 초기화
	private static Single3 single = new Single3();
	
	private Single3() {
		
	}
	
	public static Single3 getInstance() {
		return single;	
	}

}
