package minikiosk.exception;

public class ItemNotFoundException extends Exception {

	public ItemNotFoundException() {
		super();
	}

	public ItemNotFoundException(String message) {
		super(message);
	}
	
	public void itemCheck(String item) throws ItemNotFoundException {
		if(item == null || item == "") {
			throw new ItemNotFoundException("메뉴에 없는 음식입니다.");
		}
	}
	

}
