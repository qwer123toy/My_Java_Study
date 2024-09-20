package userInfo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;

import lombok.extern.slf4j.Slf4j;

@WebServlet("/userinfo/signup")
@Slf4j
public class SignupServlet extends HttpServlet {
	private UserinfoValidator validator = new UserinfoValidator();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/userinfo/signup.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userId = req.getParameter("userId");
		String userPw = req.getParameter("userPw");
		String userPwConfirm = req.getParameter("userPwConfirm");
		String userName = req.getParameter("userName");

		Userinfo userinfo = new Userinfo(userId, userPw, userName);
		log.info(userinfo.toString());

		Map<String, String> error = validator.validate(userinfo, userPwConfirm);

		log.info(error.toString());

		if (error.size() > 0) {
			errorForwarding(req, resp, userinfo, error);
			return;
		}

		try (SqlSession sqlSession = AppContextListener.getSqlSession()) {
			UserinfoMapper mapper = sqlSession.getMapper(UserinfoMapper.class);

			Userinfo select = mapper.selectByPk(userId);

			// 같은 아이디가 존재할 경우 아래의 insert 구문이 실행되지 않음
			if (select != null) {
				Map<String, String> duplicateError = new HashMap<>();
				duplicateError.put("아이디", "이미 존재하는 아이디입니다");
				errorForwarding(req, resp, userinfo, duplicateError);
				return;
			}

			mapper.insert(userinfo);
			sqlSession.commit();
		}
		HttpSession session = req.getSession();
		session.setAttribute("message", "회원가입이 완료되었습니다.");
		resp.sendRedirect(req.getContextPath() + "/index");
	}

	private void errorForwarding(HttpServletRequest req, HttpServletResponse resp, Userinfo userinfo,
			Map<String, String> error) throws ServletException, IOException {
		resp.setStatus(400);
		req.setAttribute("error", error);
		req.setAttribute("userinfo", userinfo);
		req.getRequestDispatcher("/WEB-INF/views/userinfo/signup.jsp").forward(req, resp);
	}

}
