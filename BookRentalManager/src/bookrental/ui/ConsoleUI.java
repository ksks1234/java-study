package bookrental.ui;

import java.util.Scanner;

import bookrental.service.BookService;

public class ConsoleUI {
	public void start() {
		BookService bookService = new BookService();
		int selectNum;
		int bookNum;
		try (Scanner sc = new Scanner(System.in)) {
				do {
					printMenu();
					System.out.print("선택: ");
					selectNum = sc.nextInt();
					if (selectNum == 1) {
						bookService.printBookList();
					} else if (selectNum == 2) {
						System.out.print("대여할 책 번호 입력: ");
						bookNum = sc.nextInt();
						bookService.rentBook(bookNum);
					} else if (selectNum == 3) {
						System.out.print("반납할 책 번호 입력: ");
						bookNum = sc.nextInt();
						bookService.returnBook(bookNum);
					} else {
						System.out.println("목록에서 제공하는 숫자를 입력해주세요");
					}
				} while (selectNum != 4);
			System.out.println(">> 프로그램을 종료합니다.");
		}
	}
	

	private void printMenu() {
		System.out.println("=== 도서 대여 시스템 ===");
		System.out.println("1. 도서 목록 보기");
		System.out.println("2. 도서 대여");
		System.out.println("3. 도서 반납");
		System.out.println("4. 종료");
	};

}
