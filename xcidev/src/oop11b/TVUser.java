package oop11b;

public class TVUser {
	public static void main(String[] args) throws Exception {
		// 실체를 업캐스팅해서 사용하는 것이 좋음
		System.out.println("==========SamsungTV===================");
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
		System.out.println();
		System.out.println("==========LgTV===================");
		TV tv2 = new LgTV();
		tv2.powerOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.channelDown();
		tv2.soundUp();
		tv2.soundDown();
		tv2.powerOff();
		System.out.println();
		System.out.println("===TVFactory, SpeakerFactory===================");
		// 설정파일인 properties를 수정하면 됨
		TV tv3 = TVFactory.getTv();
		tv3.setSpeaker(SpeakerFactory.getSpeaker());
		tv3.powerOn();
		tv3.channelUp();
		tv3.channelUp();
		tv3.channelDown();
		tv3.soundUp();
		tv3.soundDown();
		tv3.powerOff();
	}

}
