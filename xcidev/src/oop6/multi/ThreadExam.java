package oop6.multi;
//자바는 클래스 다중 상속을 지원하지 않지만,
//인터페이스는 여러 개 구현할 수 있어서 다중 상속처럼 동작하게 할 수 있다.
//Runnable은 인터페이스이며, Thread도 Runnable을 구현한 클래스이다.
//이 예제에서는 Runnable을 구현한 ThreadExam 객체를 Thread 생성자에 넣어 실행시킨다.

class Important {
	
}
public class ThreadExam extends Important implements Runnable {
	public static void main(String[] args) {
//		run();
		Runnable t = new ThreadExam();
		Thread t2 = new Thread(t);
		t2.start();
		for(int i = 1; i<= 5; i++) {
			System.out.println("main : "  + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("main : 종료");
	}

	@Override
	public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("run : " + i);
            try {
                Thread.sleep(1000); // 1초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("run : 종료");		
	}


}
