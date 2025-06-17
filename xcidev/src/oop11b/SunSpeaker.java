package oop11b;

public class SunSpeaker implements Speaker {
	public SunSpeaker() {
		System.out.println("SunSpeaker: 제품이 생성됨");
	}

	@Override
	public void soundUp() {
		System.out.println("SunSpeaker: 귀가 녹아 내립니다.");
		
	}

	@Override
	public void soundDown() {
		System.out.println("SunSpeaker: 귀가 안정적입니다.");
		
	}
	
	

}
