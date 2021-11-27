import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayServlet extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		
	res.setContentType("text/html");
		

		
		String taskName=req.getParameter("taskName");
		String taskDesc=req.getParameter("taskDesc");
		String assign=req.getParameter("assign");
		String taskD=req.getParameter("taskD");
		
		
	
		
		HttpSession session = req.getSession();
		
		
		session.setAttribute("tn",taskName);
		session.setAttribute("tDsc",taskDesc);
		session.setAttribute("assign",assign);
		session.setAttribute("tD",taskD);
	
	
	
	try {
		//this is commented to demonstrate request dispatcher using another jsp page
		//req.getRequestDispatcher("/index.jsp").forward(req,res);


		req.getRequestDispatcher("/display.jsp").forward(req,res);

		} catch (ServletException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}



		}

		
		
	public void destroy() {
		System.out.println("HTTP SERVER DESTROYED !!!");
	}
}

	
	

