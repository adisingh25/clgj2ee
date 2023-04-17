

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cancelHall
 */
@WebServlet("/cancelHall")
public class cancelHall extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cancelHall() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 int id = Integer.parseInt(request.getParameter("Id"));
		 PrintWriter out = response.getWriter();
		 
		  out.print("<html><body><p>" + "---------------Here is Your Cancel Booking Details-------------<br><br>Booking Id : " + id + 
				  "<br>Your booking will be cancelled. Have a great day!" + "</body></html>");
		
	}

	

}
