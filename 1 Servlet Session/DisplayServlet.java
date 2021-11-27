import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayServlet extends HttpServlet{

		public void doGet(HttpServletRequest req,HttpServletResponse res) {
			
		res.setContentType("text/html");
			
		try {
			
			PrintWriter pwriter = res.getWriter();
						
			HttpSession session =req.getSession(false);
				
		
			String firstName =(String)session.getAttribute("fn");
			String lastName =(String)session.getAttribute("ln");
			String phoneNumber =(String)session.getAttribute("pn");
			String email=(String)session.getAttribute("em");			
			
			pwriter.print("<html>");
			pwriter.write("<head> <title>Welcome Page </title> <link rel=\"stylesheet\" href=\"style.css\"> </head>" );
			pwriter.print("<body>");
			pwriter.print("<div class=\"content\">");
			pwriter.print("<h1>Display page: </h1>");
			pwriter.print("Hi "+firstName+ " !! <br/> <p>The information you provided are as follows: </p>");
			
			pwriter.print("<br/>FIRST NAME: "+firstName);
			pwriter.print("<br/>LAST NAME: "+ lastName);
			pwriter.print("<br/>PHONE NUMBER: "+ phoneNumber);
			pwriter.print("<br/>EMAIL: "+email);
			
			pwriter.print("</div>");
			pwriter.print("</body>");
			pwriter.print("</html>");
			
			
			
		}catch(IOException e){
			
			e.printStackTrace();
			
		}
		}
		
		public void destroy() {
			System.out.println("HTTP SERVER DESTROYED !!!");
		}
	}


