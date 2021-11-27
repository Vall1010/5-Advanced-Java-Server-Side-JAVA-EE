import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class ColorList extends HttpServlet{

public void doPost(HttpServletRequest req , HttpServletResponse res) {

List<String>colorList = new ArrayList();
colorList.add("Blue");
colorList.add("Red");
colorList.add("Yellow");
colorList.add("White");
colorList.add("Gray");

req.setAttribute("colorList",colorList );


try {

req.getRequestDispatcher("/index.jsp").forward(req,res);



} catch (ServletException | IOException e) {

e.printStackTrace();
}




}

public void destroy() {
	System.out.println("HTTP SERVER DESTROYED !!!");
}

}
