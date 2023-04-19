

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Telephone
 */
@WebServlet("/Telephone")
public class Telephone extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Connection c;
	static Statement s;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Telephone() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String phn = request.getParameter("number");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String company = request.getParameter("company");
		String pincode = request.getParameter("pincode");
		
		PrintWriter out = response.getWriter();
		out.print("<html><body><p>" + phn + "</p><p>" + name + "</p>");
		out.print("<p>" + address + "</p><p>" + company + "</p><p>"+ pincode  +  "</p></body></html>");
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "msrit");
			System.out.println(c.toString());
			s = (Statement) c.createStatement();
			
			
			String queryToExecute = String.format(
					"insert into me  (phn, name, address, company,pincode) values ('%s', '%s', '%s', '%s', '%s')",
					phn, name, address, company, pincode);

			 int update = s.executeUpdate(queryToExecute);
			 
			 
			 String r2 = String.format("select * from me");
			 
			 ResultSet rs = s.executeQuery(r2);
			 
			 while(rs.next()){
		            //Display values
		            System.out.print("PhoneNumber: " + rs.getString("phn"));
		            System.out.print(", Name: " + rs.getString("name"));
		            System.out.print(", Address: " + rs.getString("address"));
		            System.out.print(", CreditLimit: " + rs.getString("company"));
		            System.out.println(", pincode: " + rs.getString("pincode"));
		         }

			s.close();
			c.close();

		} catch (Exception err) {
			System.out.println(err);
		}

	}

	
}
