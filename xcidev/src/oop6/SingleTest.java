package oop6;

public class SingleTest {
	public static void main(String[] args) {
		// 싱글톤 X
		Single s1 = new Single();
		Single s2 = new Single();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		// hashCode가 서로 다름
		// 서로 다르면? 다른 객체로 봐야함 -> 공유가 된 상태가 아님
		
		// 싱글톤 1
		Single2 s3 = Single2.getInstance();
		Single2 s4 = Single2.getInstance();
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		// 같은 hashCode가 생성
		// 객체 공유됨
		
		// 싱글톤 2
		Single3 s5 = Single3.getInstance();
		Single3 s6 = Single3.getInstance();
		System.out.println(s5.hashCode());
		System.out.println(s6.hashCode());
		// 같은 hashCode가 생성
		// 객체 공유됨
		
 	}

}
