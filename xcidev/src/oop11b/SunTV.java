package oop11b;

public class SunTV implements TV {
	private Speaker speaker;
	@Override
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	public SunTV() {
		System.out.println("SunTV: 제품이 생성됨");
	}

	@Override
	public void powerOn() {
		System.out.println("SunTV: 전원을 켭니다.");		
	}

	@Override
	public void powerOff() {
		System.out.println("SunTV: 전원을 끕니다.");
		
	}

	@Override
	public void soundDown() {
		if(speaker == null) {
			System.out.println("SunTV: 소리를 줄입니다.");
		} else {
			speaker.soundDown();
		}
		
	}

	@Override
	public void soundUp() {
		if(speaker == null) {
			System.out.println("SunTV: 소리를 키웁니다.");
		} else {
			speaker.soundUp();
		}
		
	}

	@Override
	public void channelDown() {
		System.out.println("SunTV: 채널을 내립니다.");
		
	}

	@Override
	public void channelUp() {
		System.out.println("SunTV: 채널을 올립니다.");
		
	}

}
