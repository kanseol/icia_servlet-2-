package example23;

import java.io.*;
import java.time.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/sboard/join")
public class SBoardJoin extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("viewname", "join.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("/sboard/main.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String irum = request.getParameter("irum");

		User user = User.builder().username(username).email(email).password(password).irum(irum)
				.joinday(LocalDate.now()).build();
		MockUserDao.insert(user);
		response.sendRedirect("/icia_servlet/sboard/login");
	}
}