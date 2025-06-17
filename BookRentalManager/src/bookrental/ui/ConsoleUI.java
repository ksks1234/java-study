// 프로그램 UI
package bookrental.ui;

import java.util.Scanner;
import bookrental.service.BookService;

public class ConsoleUI {
	public void start() {
		BookService bookService = new BookService();
		int selectNum;
		int bookNum;
		boolean running = true;
		try (Scanner sc = new Scanner(System.in)) {
			do {
				printMenu();
				System.out.print("선택: ");
				try {
					selectNum = sc.nextInt();
					if (selectNum == 1) {
						bookService.printBookList();
					} else if (selectNum == 2) {
						System.out.print("대여할 책 번호 입력: ");
						bookNum = sc.nextInt();
						if (bookService.isValidIndex(bookNum)) {
							bookService.rentBook(bookNum);
						}
					} else if (selectNum == 3) {
						System.out.print("반납할 책 번호 입력: ");
						bookNum = sc.nextInt();
						if (bookService.isValidIndex(bookNum)) {
							bookService.returnBook(bookNum);
						} 
					} else if (selectNum == 4) {
						running = false;
					} else {
						System.out.println("목록에서 제공하는 숫자를 입력해주세요");
					}
				} catch (Exception e) {
					System.out.println("숫자만 입력해 주세요");
					sc.nextLine();	// 버퍼 비우기
				}
			} while (running);
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
