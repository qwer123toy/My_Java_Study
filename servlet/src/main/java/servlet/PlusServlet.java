package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @WebServlet 어노테이션을 사용하여 이 서블릿이 "/plus" 경로로 매핑되도록 설정
@WebServlet({"/plus","/plus2"})
public class PlusServlet extends HttpServlet {

    // GET 방식으로 요청이 들어올 경우 실행되는 메서드
    // 예를 들어, 사용자가 브라우저에서 "/plus" URL로 접근했을 때 호출됨
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // "plusForm.jsp"로 요청을 전달하며, 사용자에게 입력 폼을 제공
        req.getRequestDispatcher("/WEB-INF/views/plusForm.jsp").forward(req, resp);
    }

    // POST 방식으로 요청이 들어올 경우 실행되는 메서드
    // 예를 들어, 사용자가 입력 폼을 제출했을 때 호출됨
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 사용자가 입력한 'left'와 'right'라는 파라미터를 가져옴
        String left = req.getParameter("left");
        String right = req.getParameter("right");

        // 'left' 또는 'right'가 null이거나 빈 문자열일 경우 GET 방식으로 다시 입력 폼을 보여줌
        if (left == null || right == null || left.isEmpty() || right.isEmpty()) {
            doGet(req, resp);
            return;
        }

        // 입력된 문자열을 Integer로 변환하여 두 수를 더함
        Integer l = Integer.valueOf(left);
        Integer r = Integer.valueOf(right);

        // 더한 결과를 "sum"이라는 이름으로 요청에 저장 (Request Scope에 데이터 저장)
        Integer sum = l + r;
        req.setAttribute("sum", sum);

        // 결과 페이지 "plusResult.jsp"로 요청을 전달하여 결과를 출력
        req.getRequestDispatcher("/WEB-INF/views/plusResult.jsp").forward(req, resp);
    }

    // 아래는 'service' 메서드로, GET/POST 요청에 관계없이 모든 요청을 처리할 수 있는 메서드
    // 이 경우에는 특별한 처리를 위해 주석 처리된 상태
    // 서비스 메서드 오버라이딩으로 요청 방식을 구분하여 처리할 수도 있음
    // 주석을 해제하면 모든 요청이 이 메서드를 거치며, 요청 방식을 확인해 별도의 로직을 실행 가능
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String method = req.getMethod();
//        if (method.equalsIgnoreCase("GET")) {
//            req.getRequestDispatcher("/WEB-INF/views/plusForm.jsp").forward(req, resp);
//        } else if (method.equalsIgnoreCase("POST")) {
//            System.out.println("사용자가 양식을 제출함");
//        }
//    }
}
