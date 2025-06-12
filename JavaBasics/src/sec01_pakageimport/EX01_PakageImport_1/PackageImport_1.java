package sec01_pakageimport.EX01_PakageImport_1;

public class PackageImport_1 {
	public static void main(String[] args) {
		sec01_pakageimport.common.A a = new sec01_pakageimport.common.A();
		// 다른 패키지의 클래스를 사용할 때는
		// 패키지명을 포함한 풀네임을 사용해야함 
		
		// 멤버 활용
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
		
	}

}
