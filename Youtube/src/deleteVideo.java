

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class deleteVideo
 */
@WebServlet("/deleteVideo")
public class deleteVideo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteVideo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 int id = Integer.parseInt(request.getParameter("Id"));
		 String title = request.getParameter("title");
		 
		 PrintWriter out = response.getWriter();
		 
		 out.print("<html><body><p>" + "---------------Here is an Update on Deletion of your Video-------------<br><br>Channel Id : " + id);
	        out.print("<p>Title of the Video : " + title + "<br>Your video will be deleted. Have a great day!" +"<br></body></html>");
	      try{
	    	  
			  Statement s = (Statement)DatabaseInstance.getInstance().createStatement();
			  String deleteQuery = "delete from Youtube where title = '" + title + "'";
			  s.executeUpdate(deleteQuery);
			  System.out.println("Deleted successfully");
			  
		  }catch(Exception e){
			  System.out.println("Error while deleting " + e.getLocalizedMessage());
		  }
		 
	}

	

}
