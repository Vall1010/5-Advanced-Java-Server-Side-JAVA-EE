import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ExamServletP extends HttpServlet{
	
	public void doPost(HttpServletRequest req , HttpServletResponse res) {
		
		res.setContentType("text/html");
		
		String productName= req.getParameter("productName");
		String productSize= req.getParameter("productSize");
		String sku= req.getParameter("sku");
		String productD= req.getParameter("productD");

		req.setAttribute("productName",productName);
		req.setAttribute("productSize",productSize);
		req.setAttribute("sku",sku);
		req.setAttribute("productD",productD);
		
		try {
			
			PrintWriter pWObj = res.getWriter();
			
			pWObj.write("<html>");
			pWObj.write("<head> <title>Display Page </title> <link rel=\"stylesheet\" href=\"style.css\"> </head>" );
			pWObj.write("<body>");
			pWObj.write("<div class=\"content\">");
			pWObj.write("<h1> Servlet POST</h1>");
			pWObj.write("<h3> The product details are as follows:</h3>");
			pWObj.write("<p> PRODUCT NAME IS: " + productName + "</p>");
			pWObj.write("<p> PRODUCT SIZE IS: " + productSize + "</p>");
			pWObj.write("<p> PRODUCT SKU IS: " + sku + "</p>");
			pWObj.write("<p> PRODUCT DESCRIPTION IS: " + productD + "</p>");
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
