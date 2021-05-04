package example23;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/sboard/info")
public class SBoardInfo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("username")==null) {
			response.sendRedirect("/servlet/sboard/login");
		} else if(session.getAttribute("passwordCheck")==null) {
			response.sendRedirect("/icia_servlet/sboard/password_check");
		} else {
			String username = (String)session.getAttribute("username");
			User user = MockUserDao.findById(username);
			request.setAttribute("user", user);
			request.setAttribute("viewname", "info.jsp");
			RequestDispatcher rd = request.getRequestDispatcher("/sboard/main.jsp");
			rd.forward(request, response);
		}
	}
}
