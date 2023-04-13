

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ITreturns
 */
@WebServlet("/ITreturns")
public class ITreturns extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ITreturns() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String salary = request.getParameter("salary");
		String tax = request.getParameter("tax");
		int salaryAfterTax = Integer.parseInt(salary) - Integer.parseInt(salary)*Integer.parseInt(tax)/100;
		PrintWriter out = response.getWriter();
		out.print("<html><body><p>" + name + "</p><p>" + gender + "</p>");
		out.print("<p>" + salary + "</p><p>" + tax + "</p><p>"+ salaryAfterTax  + "</body></html>");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		File file = new File("/home/6a/Desktop/output_tax/file.txt");
		file.createNewFile();
		FileOutputStream fs = new FileOutputStream(file);
		System.out.println(fs.toString());
		fs.write(("hello" + name + " " + gender + " your salary is " + salary + " and tax deduction % is "  
		+ tax + " So, salary after deduction " + salaryAfterTax).getBytes());
		fs.close();
		
	}


}
