package web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import web.AppContextListener;
import web.coffee.Coffee;
import web.coffee.CoffeeDynamicMapper;
import web.coffee.CoffeeMapper;

@WebServlet("/searchCoffee")
public class SearchCoffeeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String start = req.getParameter("start");
		String end = req.getParameter("end");

		// input에서 받아온 값이 없을 경우 기존 화면으로 돌아감
		if (start == null || start.isEmpty() || end == null || end.isEmpty()) {
//			req.getRequestDispatcher("/WEB-INF/views/searchCoffeeForm.jsp").forward(req, resp);
			resp.sendRedirect(req.getContextPath() + "/listCoffee");
			return;
		}

		int startValue = Integer.parseInt(start);
		int endValue = Integer.parseInt(end);

		try (SqlSession sqlSession = AppContextListener.getSqlSession()) {
			CoffeeDynamicMapper coffeeMapper = sqlSession.getMapper(CoffeeDynamicMapper.class);
			List<Coffee> listCoffee = coffeeMapper.getAllOrByPrice(startValue, endValue);
			
//			CoffeeMapper coffeeMapper = sqlSession.getMapper(CoffeeMapper.class);
//			List<Coffee> listCoffee = coffeeMapper.searchByPrice(startValue, endValue);
			req.setAttribute("listCoffee", listCoffee);

			int count = coffeeMapper.count(startValue, endValue);
			req.setAttribute("count", count);
			
			// 검색 개수를 구현해보자!
//			int count = coffeeMapper.countByPrice(startValue, endValue);
//			req.setAttribute("count", count);
		}

		req.getRequestDispatcher("/WEB-INF/views/listCoffee.jsp").forward(req, resp);

	}

}
