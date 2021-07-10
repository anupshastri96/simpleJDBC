import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBConnectionPractice {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
		
		
		Connection con = DriverManager.getConnection(url,"root","root");
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from employees_tbl");
		System.out.println("Emp ID   Name  Department  Salary");
		while(rs.next()) {
			int empId = rs.getInt(1);
			String name = rs.getString(2);
			String dept = rs.getString(3);
			int salary = rs.getInt(4);
			
			System.out.println(empId+"  "+name+"  "+dept+"  "+ salary);
		}

	}

}
