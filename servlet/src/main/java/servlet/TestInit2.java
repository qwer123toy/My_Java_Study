package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/init2", loadOnStartup = 1)
public class TestInit2 extends HttpServlet{
	
	
	public TestInit2() {
		System.out.println("인스턴스화 확인!");
	}

	
	
	
}
