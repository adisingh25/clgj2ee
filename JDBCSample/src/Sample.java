import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class Sample {

	public Sample() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "msrit");
		System.out.println(c.toString());
		Statement s;
		if(c!=null) {
			System.out.println("Connnection Successful");
			s =(Statement)c.createStatement();
			ResultSet rs = s.executeQuery("Select * from person");
			while(rs.next()) {
				int a = rs.getInt("id");
				String b = rs.getString("name");
				String d = rs.getString("place");
				System.out.println(a + " " + b + " " + d);
			}
			s.close();
			c.close();
		}
	}

}
