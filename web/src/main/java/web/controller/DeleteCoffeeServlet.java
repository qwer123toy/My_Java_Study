package web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import web.AppContextListener;
import web.coffee.CoffeeDynamicMapper;

@WebServlet("/deleteCoffee")
public class DeleteCoffeeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String coffeeId = req.getParameter("coffeeId");
		int parsedId = Integer.parseInt(coffeeId);

		try (SqlSession session = AppContextListener.getSqlSession()) {
			CoffeeDynamicMapper mapper = session.getMapper(CoffeeDynamicMapper.class);
			mapper.delete(parsedId);

			session.commit();

		}
		resp.sendRedirect(req.getContextPath() + "/listCoffee");
	}

}
