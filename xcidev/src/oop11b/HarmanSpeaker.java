package oop11b;

public class HarmanSpeaker implements Speaker {

	public HarmanSpeaker() {
		System.out.println("OrangeSpeaker: 제품이 생성됨");
	}
	
	@Override
	public void soundUp() {
		System.out.println("HarmanSpeaker: 소리를 키웁니다.");		
	}

	@Override
	public void soundDown() {
		System.out.println("HarmanSpeaker: 소리를 줄입니다.");
		
	}

}
