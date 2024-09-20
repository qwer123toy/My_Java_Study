package web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;

import lombok.extern.slf4j.Slf4j;
import userInfo.AppContextListener;
import web.coffee.Coffee;
import web.coffee.CoffeeDynamicMapper;

@WebServlet("/insertCoffee")
@Slf4j //로그 객체 사용 가능
public class InsertCoffeeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/insertCoffeeForm.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		String coffeeName = req.getParameter("coffeeName");
		String coffeePrice = req.getParameter("coffeePrice");
		int parsedPrice = Integer.parseInt(coffeePrice);
		
		HttpSession session = req.getSession(false);
		String userId = (String) session.getAttribute("userId");
		
		Coffee coffee = Coffee.builder().coffeeName(coffeeName).coffeePrice(parsedPrice).userId(userId).build();
		
		log.info(coffee.toString());
		
		try(SqlSession sqlSession = AppContextListener.getSqlSession()) {
			CoffeeDynamicMapper mapper = sqlSession.getMapper(CoffeeDynamicMapper.class);
			mapper.insert(coffee);
			
			sqlSession.commit();
		} 
//		String a="a";
//		Integer c = null;
//		int b = 0;
//		c= b;
		
		resp.sendRedirect(req.getContextPath() + "/listCoffee");
	}
	
	

}
