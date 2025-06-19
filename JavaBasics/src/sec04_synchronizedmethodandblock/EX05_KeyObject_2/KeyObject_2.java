package sec04_synchronizedmethodandblock.EX05_KeyObject_2;

// 공유 객체
// abc(), bcd() : this 객체가 갖고 있는 하나의 열쇠를 함께 사용
// Object : Objct 열쇠가 값오 있는 열쇠를 사용
class MyData {
	synchronized void abc() {
		for(long i = 0; i < 3; i++) {
			System.out.println(i + "sec");
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
		}
	}

	synchronized void bcd() {
		for (long i = 0; i < 3; i++) {
			System.out.println(i + "초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	void cde() {
		synchronized (new Object()) {
			for (long i = 0; i < 3; i++) {
				System.out.println(i + "번째");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		}
	}
}

public class KeyObject_2 {
	public static void main(String[] args) {
		// 공유 객체 생성
		MyData myData = new MyData();

		// 3개의 쓰레드가 각각의 메서드 호출
		new Thread() {
			public void run() {
				myData.abc();
			};
		}.start();

		new Thread() {
			public void run() {
				myData.bcd();
			};
		}.start();

		new Thread() {
			public void run() {
				myData.cde();
			};
		}.start();
	}
}
