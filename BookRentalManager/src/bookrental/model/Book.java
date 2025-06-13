package bookrental.model;

public class Book {
	private String title;		// 책 제목
	private String author;		// 지은이
	private boolean isRented;	// 도서 대출 가능 여부
	
	// 책 제목과 저자를 받아 초기화, 대여 상태는 기본값 false
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.isRented = false;
	}
	
	/*
	 * → 대여 가능할 경우 isRented = true로 설정하고 성공 메시지 출력
	 * → 이미 대여 중이면 실패 메시지 출력
	 * */
	public void rent() {
		if(!this.isRented) {
			this.isRented = true;
			System.out.println("책을 대여하였습니다.");
		} else {
			System.out.println("이미 대여되었거나, 대여할 수 없는 책입니다.");
		}
	};
	
	/*
	 * 대여 중인 경우 isRented = false로 설정하고 반납 메시지 출력
	 * 대여되지 않은 상태면 실패 메시지 출력
	 */
	public void returnBook() {
		if(this.isRented) {
			this.isRented = false;
			System.out.println("책을 반납하였습니다.");
		} else {
			System.out.println("이미 반납되거나, 반납할 수 없는 책입니다.");
		}
	}
	
	// 책 제목, 저자, 대여 상태를 출력
	// 예시: [대여가능] 어벤져스 - 이작가
	public void printInfo() {
		String state;
		if(this.isRented) {
			state = "대여불가능";
		} else {
			state = "대여가능";
		}
		System.out.print("[" + state + "] " + this.title + " - " + this.author);			
	}
}
