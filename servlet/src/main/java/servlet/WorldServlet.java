package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WorldServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//클래스를 변경할 시 컴파일을 한 후 재배포를 하게됨
		resp.setHeader("Content-Type", "text/html; charset=utf-8");
		
		PrintWriter writer = resp.getWriter();
		
		writer.println("<!DOCTYPE html>");
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>제목입니다</title>");
		writer.println("</head>");
		writer.println("<body>텍스트</body>");
		writer.println("</html>");
	}
	
}
