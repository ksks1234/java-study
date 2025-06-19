package sec05_threadstates.EX03_TimedWaiting_Sleep;

class MyThread extends Thread {
	boolean yieldFlag;

	@Override
	public void run() {
		// Thread.yield();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(" -- sleep() 진행 중 Interrupt() 발생");
			for (long i = 0; i < 100000000000000000L; i++) {
			} // 시간지연
		}
	}
}
// 쓰레드가 상태가 전환되는데 약간의 시간이 걸려서 
// 위에 MyThread의 catch 문에서 시간을 지연시켜 상태 변경 확인
public class TimedWaiting_Sleep {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		
		try {Thread.sleep(100);} catch (InterruptedException e) {}	// 쓰레드 준비 시간
		System.out.println("MyThread State = " + myThread.getState());
		// TIMED_WAITING
		myThread.interrupt();	// TIMED_WAITING -> RUNNABLE 상태 전환
		try {Thread.sleep(100);} catch (InterruptedException e) {}
		// 인터럽트 준비 시간
		System.out.println("MyThread State = " + myThread.getState());
	}

}
