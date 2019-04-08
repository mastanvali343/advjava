package basics;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;

public class Registration extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String[] quali = req.getParameterValues("quali");
		String gen = req.getParameter("g");
		String bra = req.getParameter("branch");
		String add = req.getParameter("addr");
		
		String qual = "";
		for(int j=0;j<quali.length;j++) {
			qual = qual + quali[j]+"<br/>";
		}
		out.println("<html>");
		out.println("<body>");
		out.println("id "+id);
		out.println("name "+name);
		out.println("qualification "+qual);
		out.println("gender "+gen);
		out.println("branch "+bra);
		out.println("address "+add);
		out.println("</html>");
		out.println("</body>");
	}
		
	

}
