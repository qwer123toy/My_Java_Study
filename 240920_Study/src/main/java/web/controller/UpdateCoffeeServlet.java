package web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;

import userInfo.AppContextListener;
import web.coffee.Coffee;
import web.coffee.CoffeeDynamicMapper;

@WebServlet("/updateCoffee")
public class UpdateCoffeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String coffeeId = req.getParameter("coffeeId");
		int parseId = Integer.parseInt(coffeeId);
		
		try (SqlSession sqlSession = AppContextListener.getSqlSession()) {
			CoffeeDynamicMapper mapper = sqlSession.getMapper(CoffeeDynamicMapper.class);
			Coffee coffee = mapper.selectByPk(parseId);
			
			req.setAttribute("coffee", coffee);
		}
		req.getRequestDispatcher("/WEB-INF/views/updateCoffeeForm.jsp")
			.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		String coffeeId = req.getParameter("coffeeId");
		String coffeeName = req.getParameter("coffeeName");
		String coffeePrice = req.getParameter("coffeePrice");
		
		HttpSession session = req.getSession(false);
		String userId = (String) session.getAttribute("userId");
		
		int parsedId = Integer.parseInt(coffeeId);
		int parsedPrice = Integer.parseInt(coffeePrice);
		
		try(SqlSession sqlSession = AppContextListener.getSqlSession()){
			CoffeeDynamicMapper mapper = sqlSession.getMapper(CoffeeDynamicMapper.class);
			
			mapper.update(new Coffee(parsedId,coffeeName, parsedPrice, userId));
			
			sqlSession.commit();
		}
		
		resp.sendRedirect(req.getContextPath() + "/listCoffee");
	}
}



