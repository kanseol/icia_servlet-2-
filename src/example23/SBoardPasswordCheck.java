package example23;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/sboard/password_check")
public class SBoardPasswordCheck extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("viewname", "password_check.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("/sboard/main.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("username")==null) {
			response.sendRedirect("/icia_servlet/sboard/login");
		} else {
			String username = (String)session.getAttribute("username");
			String password = (String)request.getParameter("password");
			User user = MockUserDao.findById(username);
			session.setAttribute("passwordCheck", true);
			response.sendRedirect("/icia_servlet/sboard/info");
		}
	}
}
