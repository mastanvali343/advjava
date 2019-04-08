package basics;

import javax.servlet.annotation.WebServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.*;
import javax.servlet.ServletConfig;

//@WebServlet("demo1")
public class Demo implements Servlet {
	
	public void init(ServletConfig config) {
		
	}
	
	
	public void service(ServletRequest req, ServletResponse res) throws IOException{
		
		String name = req.getParameter("name");
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("<h1>Welcome To Demo Class "+name);
	}

	public void destroy() {
		
	}
	
	public ServletConfig getServletConfig() {
		return null;
	}
	
	public String getServletInfo() {
		return null;
	}
	
}