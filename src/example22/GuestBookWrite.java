package example22;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/guest_book/write")
public class GuestBookWrite extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("viewname", "write.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("/example22/main.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String nickname = request.getParameter("nickname");
		String content = request.getParameter("content");
		String password = request.getParameter("password");
		int gno = MockGuestBookDao.max()+1;
		GuestBook guestBook = GuestBook.builder().nickname(nickname).content(content)
				.password(password).gno(gno).build();
		MockGuestBookDao.write(guestBook);
		response.sendRedirect("/icia_servlet/guest_book/main");
	}
}
