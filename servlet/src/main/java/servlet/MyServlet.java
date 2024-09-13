package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MyServlet", urlPatterns = {"/my"})
public class MyServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//서블릿에서 연산한 결과를 result로 출력하고 싶음
		//출력하고 싶은 결과는 hello World
		//request 객체에 값을 넣음
		req.setAttribute("result", "Hello World");
		
		// request로 값을 해당 jsp 파일에 넘겨줌
		req.getRequestDispatcher("/WEB-INF/views/myViews.jsp").forward(req, resp);
	
	}
	
}
