package oop11b;

public class SamsungTV implements TV {
//	private Speaker speaker = new HarmanSpeaker();
	private Speaker speaker;
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	public SamsungTV() {
		System.out.println("SamsungTV: 제품이 생성됨");
	}
	public void powerOn() {
		System.out.println("SamsungTV: 전원을 켭니다.");
	}

	public void powerOff() {
		System.out.println("SamsungTV: 전원을 끕니다.");
	}

	public void soundDown() {
		if(speaker == null) {
			System.out.println("SamsungTV: 소리를 줄입니다.");
		} else {
			speaker.soundDown();
		}
	}

	public void soundUp() {
		if(speaker == null) {
			System.out.println("SamsungTV: 소리를 키웁니다.");
		} else {
			speaker.soundUp();
		}
	}

	public void channelDown() {
		System.out.println("SamsungTV: 채널을 내립니다.");
	}

	public void channelUp() {
		System.out.println("SamsungTV: 채널을 올립니다.");
	}

}
