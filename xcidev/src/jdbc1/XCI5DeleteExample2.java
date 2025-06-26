package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner; 

public class XCI5DeleteExample2 { 
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	private static final String USER = "ace";
	private static final String PASSWORD = "ace";

    public static void main(String[] args) { 
        String deleteSQL = "DELETE emp_temp WHERE last_name = ?"; 
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); 
             PreparedStatement pstmt = conn.prepareStatement(deleteSQL);
        	 Scanner sc = new Scanner(System.in);) { 
        	System.out.println("삭제할 사원의 이름을 입력해 주세요 > ");
        	String deleteName = sc.nextLine();
            pstmt.setString(1, deleteName); 
 
            int rowsDeleted = pstmt.executeUpdate(); 
            if (rowsDeleted > 0) { 
                System.out.println("삭제 되었습니다!"); 
            } else { 
             System.out.println("삭제된 행이 없습니다."); 
            } 
        } catch (SQLException e) { 
            e.printStackTrace(); 
        } 
    } 
}