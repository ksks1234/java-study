package sec02_createdandstartthread.EX04_CreateAndStartThread_M2C2;
// Runnable 인터페이스를 상속해 클래스를 생성한 후 쓰레드 3개 생성

class SMIFileRunnable implements Runnable {
	@Override
	public void run() {
		// 자막 번호 하나 ~ 다섯
		String[] strArray = { "하나", "둘", "셋", "넷", "다섯" };
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}

		// 자막 번호 출력
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(" - (자막 번호) " + strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}

class VideoFileRunnable implements Runnable {
	@Override
	public void run() {
		// 비디오 프레임 1~5
		int[] intArray = { 1, 2, 3, 4, 5 };

		// 비디오 프레임 출력
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임) " + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class CreateAndStartThread_M2C2 {
	public static void main(String[] args) {
		// smiFileRunnable 객체 생성 및 시작
		Runnable smiFileRunnable = new SMIFileRunnable();
//		smiFileRunnable.start();
		// Rannable 객체에는 start()가 메서드가 없어 오류 발생

		Thread thread1 = new Thread(smiFileRunnable);
		thread1.start();
		
		// VideoFileThread 객체 생성
		Runnable videoFileRunnable = new VideoFileRunnable();
		Thread thread2 = new Thread(videoFileRunnable);
		thread2.start();

	}
}
