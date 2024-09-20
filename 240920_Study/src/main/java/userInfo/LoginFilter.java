package userInfo;

import java.io.IOException;

import javax.servlet.Filter; // 서블릿 요청 전후에 실행되는 필터 인터페이스
import javax.servlet.FilterChain; // 필터에서 다음 필터 또는 서블릿으로 요청을 전달하기 위한 객체
import javax.servlet.ServletException; // 서블릿 예외 처리 클래스
import javax.servlet.ServletRequest; // 클라이언트의 요청 정보를 포함하는 객체
import javax.servlet.ServletResponse; // 서버의 응답 정보를 포함하는 객체
import javax.servlet.annotation.WebFilter; // 필터를 서블릿과 연결하는 어노테이션
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lombok.extern.slf4j.Slf4j;

// 특정 서블릿들에 대해 필터를 적용하는 WebFilter 설정
@WebFilter(filterName = "LoginFilter",
urlPatterns= {"/deleteCoffee","/insertCoffee","/listCoffee","/searchCoffee","/updateCoffee"})

// Slf4j 로깅 라이브러리를 사용하여 로그를 기록하는 클래스
@Slf4j
public class LoginFilter implements Filter {
    // 필터의 핵심 동작을 정의하는 메서드. 요청 전후에 필터링 작업을 수행함.
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        // 서블릿이 요청을 처리하기 전에 로그 기록을 남김
//        log.info("서블릿이 동작 전에 기록을 남겨봅니다.");

    	//다운캐스팅하여 사용
    	//안그러면 getSession과 sendRedirect 메서드가 없음
    	HttpServletRequest req = (HttpServletRequest) request;
    	HttpServletResponse resp = (HttpServletResponse) response;
    	
		HttpSession session = req.getSession(false);
		if (session == null || session.getAttribute("userId") == null) {
			resp.sendRedirect(req.getContextPath() + "/userinfo/login");
			return;
		}
		
    	
        // 필터 체인을 통해 다음 필터 또는 서블릿으로 요청을 전달
        chain.doFilter(request, response);

        // 서블릿이 요청을 처리한 후에 로그 기록을 남김
//        log.info("서블릿이 동작 후에 기록을 남겨봅니다.");
    }
}
