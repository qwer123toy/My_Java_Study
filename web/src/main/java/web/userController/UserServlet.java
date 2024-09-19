package web.userController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import web.AppContextListener;
import web.coffee.CoffeeDynamicMapper;
import web.user.User;
import web.user.UserDynamicMapper;

@WebServlet("/listUser")
public class UserServlet extends HttpServlet{
	//회원가입하기 insert문
	//회원 아이디는 최대 20자 input 테이블에서 받아올 때 length를 제한하거나 잘라서 넣어버리거나 등등 방법은 많다
	//회원 아이디는 중복 X select문
	//비밀번호와 비밀번호 체크가 일치해야됨 input 체크와 비밀번호를 비교
	//가입 완료시 완료되었다고, 혹은 실패 시 실패되었다고 메시지 출력// 가입창을 따로 만들고 메인창에서
	// 가입성공 or 가입실패를 띄워주거나, alert 메시지를 띄워주거나(<script>) 등등 방법은 다양
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<User> listUser = null;
		
		try (SqlSession sqlSession = AppContextListener.getSqlSession()){
			
			UserDynamicMapper mapper = sqlSession.getMapper(UserDynamicMapper.class);
			listUser = mapper.userAll();
			


		} 
		req.setAttribute("listUser", listUser);
		
		req.getRequestDispatcher("/WEB-INF/views/listUser.jsp").forward(req, resp);
	}
	
}
