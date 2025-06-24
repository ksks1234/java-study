package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class XCI1SelectExample2 {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	private static final String USER = "ace";
	private static final String PASSWORD = "ace";

	public static void main(String[] args) {
//        String selectSQL = "SELECT USERNAME, PASSWORD, NAME, EMAIL, BIRTH, JOIN_DATE "
//        				 + "FROM XCI_MEMBERS"; 
		String selectSQL = """
				SELECT
					NAME,
					KOREAN,
					ENGLISH,
					MATHEMATICS,
					PHILOSOPHY
				FROM
					XCI_SCORE
				"""; // 쿼리 안에 세미콜론 절때 넣으면 안됨
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(selectSQL)) {
			System.out.println("이름\t국어\t영어\t수학\t철학\t총점\t평균");
			while (rs.next()) {
				String name = rs.getString("NAME");
				int korean = rs.getInt("KOREAN");
				int english = rs.getInt("ENGLISH");
				int mathematics = rs.getInt("MATHEMATICS");
				int philosophy = rs.getInt("PHILOSOPHY");
				int sum = korean + english + mathematics + philosophy;
				double avg = (double)sum / 4;
				System.out.printf("%s\t%3d\t%3d\t%3d\t%3d\t%3d\t%.1f\n", 
									name, korean, english, mathematics, philosophy, sum, avg);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}