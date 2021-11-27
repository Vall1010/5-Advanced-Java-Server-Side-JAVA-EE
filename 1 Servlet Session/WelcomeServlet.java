import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeServlet extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		
	res.setContentType("text/html");
		
	try {
		
		PrintWriter pwriter = res.getWriter();

		
		String firstName =req.getParameter("firstName");
		String lastName =req.getParameter("lastName");
		String phoneNumber =req.getParameter("phoneNumber");
		String email=req.getParameter("email");
		
		
		
		pwriter.write("<html>");
		pwriter.write("<head> <title>Welcome Page </title> <link rel=\"stylesheet\" href=\"style.css\"> </head>" );
		pwriter.write("<body>");
		pwriter.print("<div class=\"content\">");
		pwriter.write("<br> <h1> Welcome </h1>"+ "Hi  "+firstName + " !! ");
		pwriter.write("<br/><br/> <a href='display'>Click here to view Display Page</a>" );
		pwriter.print("</div\">");
		pwriter.write("</body>");
		pwriter.write("</html>");
		
		
		HttpSession session = req.getSession();
		
		
		session.setAttribute("fn",firstName);
		session.setAttribute("ln",lastName);
		session.setAttribute("pn",phoneNumber);
		session.setAttribute("em",email);
		
		
		
		
	}catch(IOException e){
		
		e.printStackTrace();
		
	}
	}
	
	public void destroy() {
		System.out.println("HTTP SERVER DESTROYED !!!");
	}
}

	
	

