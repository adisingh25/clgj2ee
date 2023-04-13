package Q7;

//VERY VERY IMPORTANT
import java.sql.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hospital
 */
@WebServlet("/hospital")
public class hospital extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hospital() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // TODO Auto-generated method stub


        int id = Integer.parseInt(request.getParameter("Id"));

        String name = request.getParameter("name");

        int age = Integer.parseInt((request.getParameter("age")));

        String doa = request.getParameter("doa");

        String coa = request.getParameter("coa");

        String doctor = request.getParameter("doctor");

        String treatment = request.getParameter("treatment");

        PrintWriter out = response.getWriter();

        out.print("<html><body><p>" + id + "</p><p>" + name + "</p>");

        out.print("<p>" + age + "</p><p>" + doa + "</p><p>"+ coa + "</p><p>"+ doctor 

              + "</p><p>"+ treatment +"</p></body></html>");


        String insertQuery = String.format(

              "insert into patient (id, name, age, doa,coa, doctor, treatment) values (%d, '%s', %d, '%s', '%s', '%s', '%s')",

              id, name, age, doa, coa, doctor, treatment);


        String retrieveQuery = String.format("select * from patient");

        try{

           Class.forName("com.mysql.cj.jdbc.Driver");

           Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "msrit");

            Statement s = (Statement) c.createStatement();


            int update = s.executeUpdate(insertQuery);

            System.out.println("Inserted Successfully!!!" + update);


            ResultSet rs = s.executeQuery(retrieveQuery);


           while(rs.next()){

                   //Display values

                   System.out.print("ID: " + rs.getInt("id"));

                   System.out.print(", Name: " + rs.getString("name"));

                   System.out.print(", age: " + rs.getInt("age"));

                   System.out.print(", doa: " + rs.getString("doa"));

                   System.out.print(", coa: " + rs.getString("coa"));

                   System.out.print(", doctor: " + rs.getString("doctor"));

                   System.out.print(", treatment: " + rs.getString("treatment"));

                }


           s.close();

           c.close();


        }catch(Exception err){

           System.out.println("Error while storing in db " + err);

        }




     }



}
