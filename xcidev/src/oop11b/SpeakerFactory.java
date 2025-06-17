package oop11b;
//simple factory pattern
//GoF 패턴에 있는 건 아님
// Factory를 여러개 만드니까... 드는 생각 => 통합하는게 낫지 않나?
// => 좋은 생각이 아님
public class SpeakerFactory {
	public static Speaker getSpeaker() {
		String speakerClassName = null;
		try {
			speakerClassName = productReader.getValue("speaker");
			return (Speaker) Class.forName(speakerClassName).getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			System.out.println(speakerClassName + " 클래스가 존재하지 않거나 에러입니다.");
		}
		return null;
	}
	

}
