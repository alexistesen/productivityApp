package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import arrays.ArrayCategory;
import classmains.Category;

@WebServlet(name = "cat", urlPatterns = { "/cat" })
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ArrayCategory list = new ArrayCategory();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Entre al metodo GET");
		
		
		request.setAttribute("list", list.getCategoryList());
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("Entre al metodo POST");
		String cat_description = request.getParameter("cat_description");
		
		list.addCategory(new Category(list.generateIdCategory(),cat_description));
		list.saveCategorys();
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		doGet(request, response);
		
	}

}
