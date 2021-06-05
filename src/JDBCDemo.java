import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
		
		try {
			Connection conn = DriverManager.getConnection(url, "root", "root");
			
			Statement stat = conn.createStatement(); 
			
			//ResultSet resultSet = stat.executeQuery("select * from employees_tbl");
			stat.executeUpdate("insert into employees_tbl (name,dept,salary) values('Aditi', 'Infra', 90000);");
			System.out.println("Updated table");		
//		    while(resultSet.next()) {
//		    	System.out.println(resultSet.getString("name"));
//		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
