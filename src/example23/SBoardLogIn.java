package example23;

import java.io.*;
import java.time.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/sboard/login")
public class SBoardLogIn extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("viewname", "login.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("/sboard/main.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	

		if(MockUserDao.findByIdAndPassword(username, password)!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			response.sendRedirect("/icia_servlet/sboard/main");
		} else {
			response.sendRedirect("/icia_servlet/sboard/login?error");
		}
	}
}