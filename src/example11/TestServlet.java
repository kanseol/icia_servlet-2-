package example11;

import java.io.*;
import java.time.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import org.mindrot.jbcrypt.*;


@WebServlet("/example11/test")
public class TestServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		Level level = Level.valueOf(request.getParameter("level"));

		String birthdayStr = request.getParameter("birthday");
		String[] str = birthdayStr.split("-");
		int year = Integer.parseInt(str[0]);
		int month = Integer.parseInt(str[1]);
		int day = Integer.parseInt(str[2]);
		LocalDate birthday = LocalDate.of(year, month, day);

		String encodedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
		
		User user = new User(username, name, encodedPassword, email, birthday, level);
		request.setAttribute("user", user);
		
		RequestDispatcher rd = request.getRequestDispatcher("/example11/result.jsp");
		rd.forward(request, response);
	}
}
