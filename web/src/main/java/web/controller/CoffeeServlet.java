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

@WebServlet("/listCoffee")
public class CoffeeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Coffee> listCoffee = null;
		
		try (SqlSession sqlSession = AppContextListener.getSqlSession()){
//			CoffeeMapper coffeeMapper = sqlSession.getMapper(CoffeeMapper.class);
//			listCoffee = coffeeMapper.selectAll();
			
			CoffeeDynamicMapper coffeeMapper = sqlSession.getMapper(CoffeeDynamicMapper.class);
			listCoffee = coffeeMapper.getAllOrByPrice(null,null);
			
			int count = coffeeMapper.count(null, null);
			req.setAttribute("count", count);
			
//			int count = coffeeMapper.countAll();
//			req.setAttribute("count", count);
		} 
		req.setAttribute("listCoffee", listCoffee);
		
		req.getRequestDispatcher("/WEB-INF/views/listCoffee.jsp").forward(req, resp);
	}
	
}
