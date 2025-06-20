package minikiosk.exception;

public class InvalidQuantityException extends Exception {

	public InvalidQuantityException() {
		super();
	}

	public InvalidQuantityException(String message) {
		super(message);
	}
	
	public void quantityCheck(int userQuantity) throws InvalidQuantityException {
		if(userQuantity < 0) {
			throw new InvalidQuantityException("주문은 1개 이상 필수입니다.");
		}
	}
	
	
}
