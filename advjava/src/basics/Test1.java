package basics;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import java.io.PrintWriter;


public class Test1 implements Servlet {

	public void init(ServletConfig config) {
		System.out.println("init");
		
	}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException {
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		out.println("<h1>Hello World</h1>");
		
	}
	
	public void destroy() {
		System.out.println("destroy");
		
	}
	
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig");
		return null;
		
	}
	
	public String getServletInfo() {
		System.out.println("getServletInfo");
		return null;
		
		
	}

	
	
	
	
}
