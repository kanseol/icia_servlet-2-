package example19;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/example19/login")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/example19/login.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals("spring") && password.equals("1234")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			response.sendRedirect("/icia_servlet/example19/index");
		} else
			response.sendRedirect("/icia_servlet/example19/login?error");
	}
}
