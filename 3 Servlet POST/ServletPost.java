import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletPost extends HttpServlet{
	
	public void doPost(HttpServletRequest req , HttpServletResponse res) {
		
		res.setContentType("text/html");
		
		String nam = req.getParameter("name");
		String em = req.getParameter("email");

		req.setAttribute("name", nam);
		req.setAttribute("email", em);
		try {
			
			PrintWriter pWObj = res.getWriter();
			
			pWObj.write("<html>");
			pWObj.write("<head> <title>Welcome Page </title> <link rel=\"stylesheet\" href=\"style.css\"> </head>" );
			pWObj.write("<body>");
			pWObj.write("<div class=\"content\">");
			pWObj.write("<h1> Servlet POST</h1>");
			pWObj.write("<h3> Your details are as follows:</h3>");
			pWObj.write("<p> User Name is: "+ nam + "</p>");
			pWObj.write("<p> Email is: " + em + "</p>");
			pWObj.write("</div>");
			pWObj.write("</body>");
			pWObj.write("</html>");
			
		}catch(IOException e){
			
			e.printStackTrace();
			
		}
		}
	
		public void destroy() {
		
			System.out.println("HTTP SERVER DESTROYED !!!");
	}
		
	}
