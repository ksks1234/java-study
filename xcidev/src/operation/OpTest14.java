package operation;

public class OpTest14 {
	public static void main(String[] args) {
		int n = (int) 3.9999;	// 강제 형변환, 명시적 형변환
		System.out.println(n);	// 3 (버림 발생)
		
		double d = 10;			// 자동 형변환, 묵시적 형변환
		System.out.println(d);	// 10.0
		
	}

}
