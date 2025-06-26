package jdbc2;

import java.util.Scanner;

// 리팩토링 순서
// 1. User Data를 분리
// 2. 클래스 이름을 조금 불임
public class MembershipManagement {
	// DB 관련 정보를 UserDAO로 옮김

	private static Scanner sc = new Scanner(System.in);
	private static User loggedInUser = null; // 로그인 판별

	// 3. UserDAO 싱글톤 생성 후 참조
	// 7. UserDAO에서 UserService를 만들어서 DAO의 비즈니스 로직을 분리
	private static final UserService userService = UserService.getInstance();

	public static void main(String[] args) {
		while (true) {
			System.out.println("----------------");
			System.out.println("0. " + MessageUtil.get("menu.signup"));
			System.out.println("1. " + MessageUtil.get("menu.login"));
			System.out.println("2. " + MessageUtil.get("menu.exit"));
			System.out.println("----------------");
			System.out.print("입력 > ");

			int choice = getNumberInput();

			switch (choice) {
			case 0 -> signUp();
			case 1 -> {
				if (login()) { afterLoginMenu();}
			}
			case 2 ->
				System.out.println("프로그램을 종료합니다.");
			default ->
				System.out.println("잘못된 입력입니다.");
			}
		}
	}

	private static void signUp() {
		// 예외처리 같은거 잘 해주면 좋음
		System.out.print("id: ");
		String username = sc.nextLine();
		System.out.print("pw: ");
		String password = sc.nextLine();
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("이메일: ");
		String email = sc.nextLine();
		int birthYear;
		
		System.out.print("생년: ");
		birthYear = getNumberInput();

		// 5. DAO에 보낼 내용을 user에 담음
		User user = new User(username, password, name, email, birthYear);

		// 4. db 처리 부분을 DAO로 분리
		// 6. user를 DAO에 넘김
		// 8. userService.singUp의 return이 boolean 이므로 if문에 넣음
		if (userService.signUp(user)) {
			System.out.println("회원가입 성공.");
		} else {
			System.out.println("회원가입 실패.");
		}

	}

	private static boolean login() {
		int attempts = 0;
		while (attempts < 3) {
			System.out.print("id: ");
			String username = sc.nextLine();
			System.out.print("pw: ");
			String password = sc.nextLine();
			loggedInUser = userService.login(username, password);
			if (loggedInUser != null) {
				System.out.println("로그인 성공: " + loggedInUser.getName());
				return true;
			} else {
				System.out.println(MessageUtil.get("error.login.invalid"));
				attempts++;
			}
		}
		System.out.println("접속을 종료합니다.");
		return false;
	}

	private static void afterLoginMenu() {
		while (true) {
			System.out.println("----------------");
			System.out.println("0. 자기정보보기 및 수정");
			System.out.println("1. 회원 탈퇴");
			System.out.println("2. 회원 검색");
			System.out.println("3. 로그아웃");
			System.out.println("----------------");
			System.out.print("입력 > ");

			int choice = getNumberInput();

			switch (choice) {
			case 0 -> viewAndUpdateProfile();
			case 1 -> {
				deleteUser();
				loggedInUser = null;
				return;
			}
			case 2 -> searchUser();
			case 3 -> {
				loggedInUser = null;
				return;
			}
			default-> System.out.println("잘못된 입력입니다.");
			}
		}
	}

	private static void viewAndUpdateProfile() {
		printUserProfile(loggedInUser);
		System.out.println("비밀번호를 변경하시겠습니까? (y/n)");
		String choice = sc.nextLine();
		if (choice.equalsIgnoreCase("y")) { // 대소문자 관계 없음
			System.out.print("새 비밀번호: ");
			String newPassword = sc.nextLine();
			try {
				userService.updatePassword(loggedInUser.getUsername(), newPassword);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				// 요즘은 사실 AOP 어드바이스로 바깥에 찍는 편
			}
		}
	}

	private static void deleteUser() {
		System.out.print("정말로 탈퇴하시겠습니까? (y/n) ");
		String choice = sc.nextLine();
		if (choice.equalsIgnoreCase("y")) {
			if (userService.deleteUser(loggedInUser.getUsername())) {
				System.out.println("회원 탈퇴가 완료되었습니다.");
			} else {
				System.out.println(MessageUtil.get("error.user.delete"));
			}
		}
	}

	private static void searchUser() {
		System.out.print("검색할 아이디: ");
		String username = sc.nextLine();
		User user2 = new User();
		user2 = userService.searchUser(username);
		if (user2 != null) {
			printUserProfile(user2);
		} else {
			System.out.println(MessageUtil.get("error.user.search"));
		}
	}
	
	// ======== 범용 메서드 ========
	
	// 입력 값이 숫자인지 판단하는 메서드
	private static int getNumberInput() {
		do {
			System.out.print("> ");
			try {
				return Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능합니다.");
			}
		} while (true);
	}
	
	// 유저의 정보를 출력하는 메서드
	private static void printUserProfile(User loggedInUser) {
		System.out.println("아이디: " + loggedInUser.getUsername());
		System.out.println("이름: " + loggedInUser.getName());
		System.out.println("이메일: " + loggedInUser.getEmail());
		System.out.println("생년: " + loggedInUser.getBirthYear());
	}
}