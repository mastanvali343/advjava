package basics;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.PrintWriter;
import java.io.IOException;

public class GenericDemo extends GenericServlet{
	
	public void service(ServletRequest req, ServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		out.println("<h1>Hello World</h1>");
		
	}

}
