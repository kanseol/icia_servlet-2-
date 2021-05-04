package example17;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/example17/cart")
public class CartServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/example17/cart_list.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> cart = null;
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		if(session.getAttribute("cart")==null) {
			cart = new ArrayList<>();
		} else {
			cart = (List<String>)session.getAttribute("cart");
		}
		String product = request.getParameter("product");
		cart.add(product);
		session.setAttribute("cart", cart);
		
		response.sendRedirect("/icia_servlet/example17/cart");
	}
}
