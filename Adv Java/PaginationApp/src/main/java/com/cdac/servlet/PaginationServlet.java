package com.cdac.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pagination.Product;
import com.pagination.ProductDataLoader;

/**
 * Servlet implementation class PaginationServlet
 */
@WebServlet("/pagination.cdac")
public class PaginationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	int offset = 0;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String move = request.getParameter("move");
	if(move != null)
	{
		if(move.equals("next"))
			offset += 5;
		else if(move.equals("prev")) {
			offset -= 5;
			  if (offset < 0) offset = 0;
		
		}
	}
	 ProductDataLoader loader = new ProductDataLoader();
	 List<Product> list = loader.loadProducts(offset);
	 
	 HttpSession session = request.getSession();
	 session.setAttribute("listOfProducts",list);
	 
	 
	 
	 response.sendRedirect("pagination.jsp");
	}

	

}
