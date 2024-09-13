package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Q2Servlet", urlPatterns = { "/lotto" })
public class Q2Servlet extends HttpServlet {

	// GET 방식을 처리할거면 doGet, POST 방식이면 doPOST를 오버라이딩하여 진행
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/myLotto.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String num = req.getParameter("num");

		if (num == null || num.isEmpty()) {

			doGet(req, resp);
			return;
		}
		
		Integer lotto = null;
		try {
			lotto = Integer.valueOf(num);
			
			if (lotto > 5 || lotto < 1) {
				resp.sendRedirect(req.getContextPath() + "/lotto");
				return;
			}	
		}catch (NumberFormatException e) {
			e.printStackTrace();
			
			resp.sendRedirect(req.getContextPath() + "/lotto");
			return;
		}
		
		
		
		List<Set> lottoSetList = new ArrayList<Set>();
		for (int i = 0; i < lotto; i++) {
			Set<Integer> lottoList = new HashSet<>();
			while (lottoList.size() < 6) {
				lottoList.add((int) (Math.random()*45+1));
			}
			lottoSetList.add(lottoList);
		}
		
		
		req.setAttribute("lottoSet", lottoSetList);
		req.getRequestDispatcher("/WEB-INF/views/myLottoResult.jsp").forward(req, resp);
	}

}
