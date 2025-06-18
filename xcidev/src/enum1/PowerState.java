package enum1;

public enum PowerState {
	OFF("전원이 꺼졌습니다."), 
	ON("전원이 켜졌습니다."), 
	SUSPEND("절전 모드입니다.");

	private final String message; // 필드
	// 생성자 (enum은 생성자가 private 또는 default만 가능) 

	PowerState(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void printStatus() {
		System.out.println("현재 상태는 " + name() + ", [STATUS] " + message);
	}
	
	@Override
	public String toString() {
		return getMessage();
		// 이거 없으면 ON, OFF가 나옴
	}
}
