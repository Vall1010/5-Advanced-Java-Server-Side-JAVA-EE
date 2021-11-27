import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class CountriesServlet extends HttpServlet{

public void doPost(HttpServletRequest req , HttpServletResponse res) {
	res.setContentType("text/html");
	String c1 = req.getParameter("country1");
	String c2 = req.getParameter("country2");
	String c3 = req.getParameter("country3");
	String c4 = req.getParameter("country4");
	String c5 = req.getParameter("country5");
	String c6 = req.getParameter("country6");
	String c7 = req.getParameter("country7");
	String c8 = req.getParameter("country8");
	String c9 = req.getParameter("country9");

	String one = req.getParameter("c1");
	String two = req.getParameter("c2");
	String three= req.getParameter("c3");
	String four= req.getParameter("c4");
	String five= req.getParameter("c5");
	String six= req.getParameter("c6");
	String seven= req.getParameter("c7");
	String eight= req.getParameter("c8");
	String nine= req.getParameter("c9");
	
	
	req.setAttribute("c1",one);
	req.setAttribute("c2",two);
	req.setAttribute("c3",three);
	req.setAttribute("c4",four);
	req.setAttribute("c5",five);
	req.setAttribute("c6",six);
	req.setAttribute("c7",seven);
	req.setAttribute("c8",eight);
	req.setAttribute("c9",nine);
	
	try {
		req.getRequestDispatcher("index.jsp").forward(req, res);
	} catch (ServletException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

}




