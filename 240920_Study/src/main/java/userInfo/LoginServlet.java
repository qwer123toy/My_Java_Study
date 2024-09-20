package userInfo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;

@WebServlet("/userinfo/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/userinfo/login.jsp")
			.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userId = req.getParameter("userId");
		String userPw = req.getParameter("userPw");
		
		Userinfo userinfo = Userinfo.builder().userId(userId).userPw(userPw).build();
		
		//서버 요청 처리중 입력 유효 확인 부분 생략
		Userinfo result = null;
		try (SqlSession sqlSession = AppContextListener.getSqlSession()) {
			UserinfoMapper mapper = sqlSession.getMapper(UserinfoMapper.class);
			result = mapper.login(userinfo);
		}
		
		if(result == null) {
			req.setAttribute("result", "아이디, 비밀번호를 확인해주세요");
			req.getRequestDispatcher("/WEB-INF/views/userinfo/login.jsp").forward(req, resp);
			return;
		}
		
		HttpSession session = req.getSession();
		session.setAttribute("userId", userinfo.getUserId());
		session.setAttribute("userName", userinfo.getUserName());
		
		session.setAttribute("message", "로그인에 성공하였습니다.");
		resp.sendRedirect(req.getContextPath() + "/index");
	}
}



