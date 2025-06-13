package oop10;

class Point {}
public class HashCodeTest {
	public static void main(String[] args) {
		Point p = new Point();
		System.out.printf("%x", p.hashCode());
		// 해시코드가 4byte라 해시코드가 중복될 가능성이 있음
		// 같은 객체라 인식하기 위해서는 hashCode가 같으면 같은 객체라고 보는데, 
		// equals도 비교해서 true인지 한번 더 확인 한다.
		// 그럼에도 같은 객체가 아닌데 true가 나올 수 있다.
	}

}
