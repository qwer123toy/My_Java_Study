package servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/korean", 
	initParams = @WebInitParam(name ="encode", value= "UTF-8"))
public class KoreanNameServlet extends HttpServlet {
	private String encode;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//한글이름 입력을 제공하는 양식 제공
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding(encode);
		
		String name = req.getParameter("name");
		
		System.out.println("디코딩된 한글값 확인 : " + name);
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		encode = config.getInitParameter("encode");
	}
	
	
}
