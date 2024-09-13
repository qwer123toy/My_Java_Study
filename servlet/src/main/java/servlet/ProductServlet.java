package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product;
import model.ProductRepository;

@WebServlet("/product")
public class ProductServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProductRepository repo = new ProductRepository();
		
		List<Product> list = repo.findAll();
		
		req.setAttribute("list", list);
		
		req.getRequestDispatcher("/WEB-INF/views/products.jsp").forward(req, resp);
		
		
		
		
		
	}
	
}
