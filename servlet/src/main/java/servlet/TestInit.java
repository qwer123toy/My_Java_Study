package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/init")
public class TestInit extends HttpServlet {
	
	private int state;
	// 하나의 서블릿 인스턴스는 여러 사용자 요청을 동시에 처리하므로
	// 상태값이 여러 요청 간에 공유될 수 있음
	// 만약 사용자별로 상태값을 저장하고 싶다면, 세션을 사용하는 것이 더 적절함
	// 예: HttpSession을 사용하여 사용자별로 데이터를 유지할 수 있음

	// 서블릿 생성자
	// 서블릿이 처음 생성될 때 호출되며, 이때 콘솔에 메시지를 출력
	// 서블릿은 일반적으로 서버 시작 시 한번만 생성되며, 이후에는 요청에 대해 재사용됨
	public TestInit() {
		System.out.println("서블릿이 생성될 때, 콘솔 기록을 남겨봅니다.");
	}

	// doGet 메서드: GET 요청을 처리
	// 사용자가 '/init' URL로 GET 요청을 보내면 이 메서드가 실행됨
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// state 값을 증가시킴 (상태 변화)
		// 이 값은 서블릿의 인스턴스 필드이기 때문에, 모든 사용자 요청 간에 공유됨
		state++;

		// 클라이언트에게 현재 state 값을 출력 (HTTP 응답)
		resp.getWriter().print(state);
	}

}
