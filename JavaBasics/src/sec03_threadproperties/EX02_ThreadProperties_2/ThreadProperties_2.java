package sec03_threadproperties.EX02_ThreadProperties_2;

// 우선순위
class MyThread extends Thread {
	@Override
	public void run() {
		for(long i = 0; i < 1_000_000_000_000_000_000L; i++) {} // 시간 지연용 
		System.out.println(getName()+ " 우선순위 : " + getPriority());
	}
	
}

public class ThreadProperties_2 {
	public static void main(String[] args) {
		
		// CPU 코어 수
		System.out.println("코어 수: " + Runtime.getRuntime().availableProcessors());
		
		// 우선순위 자동 설정
		for(int i = 0; i < 3; i++) {
			Thread thread = new MyThread();
			thread.start();
		}
		
		try {Thread.sleep(1000);} catch(InterruptedException e) {}
		
		// 우선순위 직접 설정
		for(int i = 0; i < 10; i++) {
			Thread thread = new MyThread();
			thread.setName(i + "번째 쓰레드");
			if(i==9) thread.setPriority(10);
			thread.start();
		}
		
	}

}
