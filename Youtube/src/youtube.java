

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class youtube
 */
@WebServlet("/youtube")
public class youtube extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<String> subscriber = new ArrayList<String>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public youtube() {
        super();
        // TODO Auto-generated constructor stub
        subscriber.add("Aditya");
        subscriber.add("Ananjay Gurjar");
        subscriber.add("Arya");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   int id = Integer.parseInt(request.getParameter("Id"));
		    String playList =  request.getParameter("playlist");
		    String title = request.getParameter("title");
	        String name = request.getParameter("name");
	        int length = Integer.parseInt(request.getParameter("length"));
	        String song = request.getParameter("song");
	        String ageLimit = request.getParameter("AgeLimit");
	        String description = request.getParameter("description");
	        PrintWriter out = response.getWriter();
	       
	        update(title,name);
	        
	        
	        
	        out.print("<html><body><p>" + "---------------Here is an Update on your new Video-------------<br><br>Channel Id : " + id + 
	        		"<br></p><p>PlayList Selected : " + playList + "</p>");
	        out.print("<p>Title of the Video : " + title + "</p><p>Creator Name : " + name + "</p><p>Length of the Video : "+ length +
	        		"</p><p>Background Song : "+ song
	              + "</p><p>Age Limit  : "+ ageLimit +"</p><br>Description : " + description + "<br></body></html>");
	        
	        try{
	        	String insertIntoTable = String.format("insert into Youtube (channelId, playlist, title, name, length, song, ageLimit, description)"
	        			+ " values (%d, '%s','%s','%s','%d','%s','%s', '%s')", 
	        			id, playList,title, name, length, song, ageLimit, description);
	        	Statement s = (Statement)DatabaseInstance.getInstance().createStatement();
	        	
	        	int rs = s.executeUpdate(insertIntoTable);
		        
	        	System.out.println("uploaded sucessfully");
	        	
	        	
	        	String getAllVideos = String.format("select * from Youtube");
				 
				 ResultSet fetchQueryResult = s.executeQuery(getAllVideos);
				 
				 System.out.println("Videos so far are:  ");
				 
				 while(fetchQueryResult.next()){
			            //Display values
			            System.out.print("ID: " + fetchQueryResult.getInt("channelId"));
			            System.out.print(", Playlist:  " + fetchQueryResult.getString("playlist"));
			            System.out.print(", Title: " + fetchQueryResult.getString("title"));
			            System.out.print(", Name: " + fetchQueryResult.getString("name"));
			            System.out.print(", Length: " + fetchQueryResult.getInt("length"));
			            System.out.print(", Song: " + fetchQueryResult.getString("song"));
			            System.out.print(", Age Limit: " + fetchQueryResult.getString("ageLimit"));
			            System.out.println(", Description: " + fetchQueryResult.getString("description"));
			         }
	        	
	        }catch(Exception e){
	        	System.out.println("Error inserting " + e.getLocalizedMessage());
	        	
	        }
	        
	        
	        
		
	}
	
	private void update(String title, String channelName) {
		for(String s : subscriber) {
			System.out.println("----------Notification-------");
			System.out.println("Hey, " + s + " " + channelName + " just uploaded a video on " + title +".\n" );
			
		}
	}

	
}
