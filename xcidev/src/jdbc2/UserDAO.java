package jdbc2;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/*
	1. Singleton & DB Connection - getInstance, getConnection
	2. create - signUp
	3. retrieve - userInfo, findById, ...
*/
// 보통 db는 변경될 가능성이 있어서
// interface 부터 만듬
// DAO는 싱글톤으로 만드는 것이 좋다.
public class UserDAO {
	private final String url;
	private final String dbUser;
	private final String dbPassword;

	// @1. Singleton & DB Connection
	// -----------------------------

	private static UserDAO instance; // 2. 자기 자신을 참조하는 변수를 만듬

	private UserDAO() {
		// properties 처리
		Properties props = new Properties();
		try (InputStream in = ClassLoader.getSystemResourceAsStream("jdbc2/db.properties")) {
			InputStreamReader reader = new InputStreamReader(in, StandardCharsets.UTF_8);
			props.load(reader);
			url = props.getProperty("db.url");
			dbUser = props.getProperty("db.user");
			dbPassword = props.getProperty("db.password");
		} catch (Exception e) {
			throw new RuntimeException("접속정보가 없거나 잘못됨...");
		}
	} // 1. 생성자를 private으로 만들고

	// 3. instance 생성(자기 자신을 참조하는 인스턴스)
	public static UserDAO getInstance() {
		if (instance == null) {
			instance = new UserDAO();
		}
		return instance;
	}

	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, dbUser, dbPassword);
	}

	// @2. create - signUp
	// -------------------
	public void signUp(User user) throws SQLException {
		String insertSQL = UserSQL.INSERT_USER;

		try (Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getEmail());
			pstmt.setInt(5, user.getBirthYear());

			pstmt.executeUpdate();

		}
	}

	// 3. retrieve
	// -----------------------
	public User getUser(String username, String password) throws SQLException {
		String loginSQL = UserSQL.GET_USER;
		try (Connection conn = getConnection(); 
			 PreparedStatement pstmt = conn.prepareStatement(loginSQL)) {

			pstmt.setString(1, username);
			pstmt.setString(2, password);

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				return new User(username, password, rs.getString("NAME"), rs.getString("EMAIL"), rs.getInt("BIRTH"));
			}
		}
		throw new RuntimeException("아이디 혹은 비밀번호가 틀립니다.");
//		return null;
		// 만약 에러를 무조건 추고 싶다면
		// throw RuntimeException 을 줄 수도 있음
	}

	public int updatePassword(String username, String newPassword) throws SQLException {
		String updateSQL = UserSQL.UPDATE_SQL;
		try (Connection conn = getConnection();
			 PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {

			pstmt.setString(1, newPassword);
			pstmt.setString(2, username);

			return pstmt.executeUpdate();
		}
	}
	// 4. delete
	// -----------------------
	public int deleteUser(String username) throws SQLException {
		String deleteSQL = UserSQL.DELETE_USER;
		try (Connection conn = getConnection();
	 		 PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {

			pstmt.setString(1, username);
			return pstmt.executeUpdate();
		}
		
	}

	// 5. search
	// -----------------------
	public User findByUsername(String username) throws SQLException {
		String searchSQL = UserSQL.FIND_BY_USER;

		try (Connection conn = getConnection();
			 PreparedStatement pstmt = conn.prepareStatement(searchSQL)) {

			pstmt.setString(1, username);

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				return new User(rs.getString("USERNAME"), 
							    rs.getString("NAME"), 
							    rs.getString("EMAIL"),
						        rs.getInt("BIRTH"));
			}
			return null;
		}
	}

}
