package userInfo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/userinfo/logout")
public class LogoutServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//갖고 있던 세션 부분 삭제
		HttpSession session = req.getSession();
		session.invalidate();
		
		//getSession
		//값이 없으면 새로 만들고, 값이 있으면 있는 걸 가져옴
		session = req.getSession();
		
		session.setAttribute("message", "로그아웃되었습니다");
		resp.sendRedirect(req.getContextPath() + "/index");
		
	}
}
