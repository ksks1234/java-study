package oop11;

import java.io.FileInputStream;
import java.util.Properties;

public class TVUser {
	public static void main(String[] args) throws Exception {
		// 실체를 업캐스팅해서 사용하는 것이 좋음
//		TV tv = new SamsungTV();
//		tv.powerOn();
//		tv.channelUp();
//		tv.channelUp();
//		tv.channelDown();
//		tv.soundUp();
//		tv.soundDown();
//		tv.powerOff();
//		TV tv2 = new LgTV();
//		tv2.powerOn();
//		tv2.channelUp();
//		tv2.channelUp();
//		tv2.channelDown();
//		tv2.soundUp();
//		tv2.soundDown();
//		tv2.powerOff();
//		TV tv3 = new AppleTV();
//		tv3.powerOn();
//		tv3.channelUp();
//		tv3.channelUp();
//		tv3.channelDown();
//		tv3.soundUp();
//		tv3.soundDown();
//		tv3.powerOff();
//		
		// new를 제거하여 dependency injection 해보기
		// 실행 시에 주입되면 됨
		Properties prop = new Properties();
		prop.load(new FileInputStream("src/oop11/product.properties"));

		String tvName = prop.getProperty("tv");
		Class tvClass = Class.forName(tvName);
		
		TV tv = (TV) tvClass.getConstructor().newInstance();
		// new Instance는 무조건 Object를 리턴하므로 업캐스팅 후 다시 다운캐스팅 해줘야함
//		tv.setSpeaker(new HarmanSpeaker());
		// tv와 스피커의 관계의 의존성을 제거하기
		String speakerName = prop.getProperty("speaker");
		Class speakerClass = Class.forName(speakerName);
//		Speaker speaker = (Speaker) speakerClass.getConstructor().newInstance();
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		tv.setSpeaker((Speaker) speakerClass.getConstructor().newInstance());
		tv.soundDown();
		tv.powerOff();

	}
	


}
