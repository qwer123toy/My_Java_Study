package web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import lombok.extern.slf4j.Slf4j;
import web.AppContextListener;
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
		
		Coffee coffee = Coffee.builder().coffeeName(coffeeName).coffeePrice(parsedPrice).build();
		
		log.info(coffee.toString());
		
		try(SqlSession sqlSession = AppContextListener.getSqlSession()) {
			CoffeeDynamicMapper mapper = sqlSession.getMapper(CoffeeDynamicMapper.class);
			mapper.insert(coffee);
			
			sqlSession.commit();
		} 
		
		resp.sendRedirect(req.getContextPath() + "/listCoffee");
	}
	
	

}
