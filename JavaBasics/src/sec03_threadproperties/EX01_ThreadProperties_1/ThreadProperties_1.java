package sec03_threadproperties.EX01_ThreadProperties_1;

// 쓰레드 객체의 속성 다루기
public class ThreadProperties_1 {
	public static void main(String[] args) {
		//객체 참조하기, 쓰레드의 개수 가져오기
		Thread curThread = Thread.currentThread();
		System.out.println("현재 쓰레드의 이름 = " + curThread.getName());
		System.out.println("동작하는 쓰레드의 개수 = " + Thread.activeCount());
		
		// 쓰레드 이름 자동 지정
		for(int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		// 쓰레드 이름 직접 지정 1 + setName()으로 이름 지정
		for(int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			thread.setName(i + "번째 쓰레드");
			System.out.println(thread.getName());
			thread.start();
		} 
		// 쓰레드 이름 직접 지정 2 - 생성자로 이름 지정
		for(int i = 0; i < 3; i++) {
			Thread thread = new Thread(i + "번째 쓰레드");
			System.out.println(thread.getName());
			thread.start();
		}
		
		// 쓰레드 이름 자동 지정
		for(int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		// 쓰레드의 개수 가져오기
		System.out.println("동작하는 쓰레드의 개수 = " + Thread.activeCount());
		// Thrad.activeCount() : 현재 실행중인 쓰레드의 갯수,
		// (실행 완료된 쓰레드의 개수는 제외)
		
		/*
		 * 실행결과 : 이유 => 쓰레드가 실행 중, 몇 개가 종료되서 그 이후 다시 카운트
		 * -------------
		 * 현재 쓰레드의 이름 = main
			동작하는 쓰레드의 개수 = 1
			Thread-0
			Thread-1
			Thread-2
			0번째 쓰레드
			1번째 쓰레드
			2번째 쓰레드
			0번째 쓰레드
			1번째 쓰레드
			2번째 쓰레드
			Thread-6
			Thread-7
			Thread-8
			동작하는 쓰레드의 개수 = 3
		 */
		
	}

}
