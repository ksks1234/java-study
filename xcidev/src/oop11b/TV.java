package oop11b;

public interface TV {
//	public void setSpeaker(Speaker speaker);
	// 이러면 모든 TV에 기능을 생성해야함... 그걸 막기 위해 default 선언
	public default void setSpeaker(Speaker speaker) {};
	public abstract void powerOn();
	public abstract void powerOff();
	public abstract void soundDown();
	public abstract void soundUp();
	public abstract void channelDown();
	public abstract void channelUp();

}
