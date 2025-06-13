package oop6.multi;

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
