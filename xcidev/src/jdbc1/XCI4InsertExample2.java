package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class XCI4InsertExample2 {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	private static final String USER = "ace";
	private static final String PASSWORD = "ace";

	public static void main(String[] args) {
		// 유저에게 scanner로 값을 입력 받는데, 부서 번호는 select로 값을 가져오기
		String insertSQL = "INSERT INTO emp_temp " 
						+ "(last_name," 
						+ " salary," 
						+ " job_id,"
						+ " commission_pct," 
						+ " department_id) " 
						+ " VALUES (?, ?, ?, ?, ?)";
		
		String selectSQL = "SELECT department_id, department_name "
						 + "FROM DEPARTMENTS";
		
		String whereSQL = "SELECT department_id "
						+ "FROM DEPARTMENTS "
						+ "WHERE department_id = ? ";

		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement pstmtInsert = conn.prepareStatement(insertSQL);
				PreparedStatement pstmtSelect = conn.prepareStatement(selectSQL);
				PreparedStatement pstmtWhere = conn.prepareStatement(whereSQL)) {
			System.out.println("새로운 사원을 등록합니다.");
			try (Scanner sc = new Scanner(System.in)) {
				System.out.print("이름을 입력하세요 > ");
				String inputName = sc.nextLine();
				System.out.print("급여를 입력하세요 > ");
				int inputSalary = sc.nextInt();
				sc.nextLine();
				System.out.print("직업명을 입력하세요 > ");
				String inputJob = sc.nextLine();
				System.out.print("인센티브를 입력하세요 > ");
				Double inputCommission = sc.nextDouble();
				System.out.println("부서 번호를 보고 알맞는 번호를 입력하세요");
				try (ResultSet rs = pstmtSelect.executeQuery()) {
					System.out.println("부서 번호 목록");
					System.out.println("department_id\tdepartment_name");
					while (rs.next()) {
						System.out.println(rs.getInt("department_id") + "\t" 
					                    + rs.getString("department_name"));
					}
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("부서 목록을 불러오던 중 문제가 발생하였습니다.");
				} // ResultSet end
				int inputDepartment;
				while (true) {
					System.out.print("부서 번호를 입력하세요 > ");
					inputDepartment = sc.nextInt();
					pstmtWhere.setInt(1, inputDepartment);
					try (ResultSet rs = pstmtWhere.executeQuery()) {
						if (rs.next()) {
							System.out.println("입력한 부서번호는 : " 
						                       + rs.getInt("department_id") + "입니다.");
							break;
						} else {
							System.out.println("잘못된 부서번호 입니다. 다시 입력하세요");
						}
					}
				} // while end
				pstmtInsert.setString(1, inputName);
				pstmtInsert.setInt(2, inputSalary);
				pstmtInsert.setString(3, inputJob);
				pstmtInsert.setDouble(4, inputCommission);
				pstmtInsert.setInt(5, inputDepartment);
			} // Scanner end
			int rowsInserted = pstmtInsert.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("사원이 정상적으로 등록되었습니다!");
			} else {
				System.out.println("사원 등록에 실패하였습니다...");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} // Connection & PreparedStatement end
	} // main end
}
