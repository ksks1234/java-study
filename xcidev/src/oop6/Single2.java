package oop6;

// 싱글톤 만들기 1
public class Single2 {
	// 자기 자신을 참조하는 
	private static Single2 single;
	
	// 생성자를 private으로 만들어 감춘다.
	// -> 외부에서 생성하지 못하게 하기
	private Single2() {
		
	}
	
	// 생성자로 쓰는 애들은 getSingle 보다는 Instance라는 이름을 붙인다
	public static Single2 getInstance() {
		if(single == null) {
			single = new Single2();
		}
		return single;	// 자기 자신을 return 한다.
	}

}
