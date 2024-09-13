package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class TestInit3 extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		String p1 = config.getInitParameter("paramName");
		String p2 = config.getInitParameter("testName");
		
		System.out.println("값 확인1 : " + p1);
		System.out.println("값 확인2 : " + p2);
	}
}
