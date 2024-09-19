package web.userController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import lombok.extern.slf4j.Slf4j;
import web.AppContextListener;
import web.coffee.CoffeeDynamicMapper;
import web.user.User;
import web.user.UserDynamicMapper;

@WebServlet("/insertUser")
@Slf4j // 로그 객체 사용 가능
public class InsertUserServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/insertMemberForm.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");

		String userId = req.getParameter("userId");
		String userPw = req.getParameter("userPw");
		String userPwChk = req.getParameter("userPwChk");
		String userName = req.getParameter("userName");

		if (userPw.equals(userPwChk)) {
			User user = User.builder().userId(userId).userPw(userPw).userName(userName).build();

			try (SqlSession sqlSession = AppContextListener.getSqlSession()) {
				UserDynamicMapper mapper = sqlSession.getMapper(UserDynamicMapper.class);
				mapper.insert(user);

				sqlSession.commit();
			}

		} else {
			resp.setContentType("text/html; charset=UTF-8");
			resp.getWriter().write("<script>");
			resp.getWriter().write("alert('비밀번호가 일치하지 않습니다.');");
		}

		resp.sendRedirect(req.getContextPath() + "/listUser");

	}

}
