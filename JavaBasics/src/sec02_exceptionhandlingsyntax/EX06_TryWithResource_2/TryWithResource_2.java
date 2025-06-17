package sec02_exceptionhandlingsyntax.EX06_TryWithResource_2;

class A implements AutoCloseable {
	String resource;

	A(String resource) {
		this.resource = resource;
	}

	@Override
	public void close() throws Exception {
		if (resource != null) {
			resource = null;
			System.out.println("리소스가 해제됐습니다.");
		}

	}

}

public class TryWithResource_2 {
	public static void main(String[] args) {

		// 1. 리소스를 사용하고 finally에서 리소스 수동 해제하기
		A a1 = null;
		try {
			a1 = new A("특정 파일");
			System.out.println(a1.resource);
		} catch (Exception e) {
			System.out.println("예외 처리");
		} finally {
			// 리소스 수동 해제
			if (a1.resource != null) {
				try {
					a1.close();
				} catch (Exception e) {
				}
			}
		}

		// 2. 리소스 자동 해제
		// AutoCloseable을 implements 해야한다.
		// try 종료 블럭을 만나면 close를 전부 호출함
		try (A a2 = new A("특정 파일");) {
			System.out.println(a2.resource);
		} catch (Exception e) {
			System.out.println("예외 처리");
		}
	}

}
