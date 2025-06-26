package jdbc2;

// action과 관련되게 이름을 지으면 좋음
public class UserService {
	private static final UserDAO userDAO = UserDAO.getInstance();
	private static UserService instance; 

	private UserService() {} // 1. 생성자를 private으로 만들고
	
	// 3. instance 생성(자기 자신을 참조하는 인스턴스)
	public static UserService getInstance() {
		if (instance == null) {
			instance = new UserService();
		}
		return instance;
	}

	public boolean signUp(User user) {
		try {
			userDAO.signUp(user);	//정상 실행시 true 반환됨
			return true;
		} catch (Exception e) {
			System.out.println("$$$회원가입 실패 " + e.getMessage());
			return false;
		}
		
	}

	public User login(String username, String password) {
		try {
			return userDAO.getUser(username, password);
		}catch (Exception e) {
			System.out.println("$$$로그인 실패 " + e.getMessage());
			return null;
		}
	}

	public void updatePassword(String username, String newPassword) throws Exception {
		try {
			if(newPassword.length() < 3) throw new RuntimeException(MessageUtil.get("error.user.password"));
			int result = userDAO.updatePassword(username, newPassword);
			if(result > 0) {
				return;
			}else throw new RuntimeException(MessageUtil.get("error.user.password2"));
		} catch (Exception e) {
			System.out.println("$$$패스워드 수정 실패 : " + e.getMessage());
			throw e; // 에러 메세지 보고싶다... 처리 하고 싶다...
			// 이렇게 넣으면 throws exception으로 넘어가고 exception 처리를 해줘야하게 됨
			// Membership~~~ 클래스에서 Exception을 잡음.
			// 거기서 유저에게 보여줄 메세지를 보여주면 됨
		}
		
	}

	public boolean deleteUser(String username) {
		try {
			if (userDAO.deleteUser(username) > 0) {
				System.out.println("$$$회원 탈퇴 성공");
			}
			return true;
		} catch (Exception e) {
			System.out.println("$$$회원 탈퇴 실패 : " + e.getMessage());
			return false;
		}
	}

	public User searchUser(String username) {
		try {
			if (userDAO.findByUsername(username) != null) {
				System.out.println("$$$사용자 검색 성공");
				return userDAO.findByUsername(username);
			}
		} catch (Exception e) {
			System.out.println("$$$사용자 검색 중 오류 발생: " + e.getMessage());
		}
		return null;
	}
}