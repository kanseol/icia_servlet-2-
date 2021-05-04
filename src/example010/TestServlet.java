package example010;

import java.io.*;
import java.time.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/example10/test")
public class TestServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");

		String birthdayStr = request.getParameter("birthday");
		String[] str = birthdayStr.split("-");
		int year = Integer.parseInt(str[0]);
		int month = Integer.parseInt(str[1]);
		int day = Integer.parseInt(str[2]);
		
		LocalDate birthday = LocalDate.of(year, month, day);
		request.setAttribute("username", username);
		request.setAttribute("name", name);
		request.setAttribute("password", password);
		request.setAttribute("email", email);
		request.setAttribute("birthday", birthday);
		
		RequestDispatcher rd = request.getRequestDispatcher("/example10/result.jsp");
		rd.forward(request, response);
	}
}
