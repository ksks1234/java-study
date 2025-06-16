package oop11;

public interface TV {
	public default void setSpeaker(Speaker speaker) {};
	// default 메서드로, 설계가 바뀌어도 다른 제품에 문제가 없도록 함
	// 알아서 각각의 TV에 연결시키는 것도 가능함
	public abstract void powerOn();
	public abstract void powerOff();
	public abstract void soundDown();
	public abstract void soundUp();
	public abstract void channelDown();
	public abstract void channelUp();

}
