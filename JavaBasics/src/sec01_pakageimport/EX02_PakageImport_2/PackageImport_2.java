package sec01_pakageimport.EX02_PakageImport_2;

import sec01_pakageimport.common.A;

public class PackageImport_2 {
	public static void main(String[] args) {
		A a = new A();
		// 다른 패키지의 클래스를 사용할 때는
		// 패키지명을 포함한 풀네임을 사용해야함 
		
		// 멤버 활용
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
		
	}

}
