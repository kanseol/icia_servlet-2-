package example22;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/guest_book/delete")
public class GuestBookDelete extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("gno", request.getParameter("gno"));
		request.setAttribute("viewname", "delete.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("/example22/main.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password = request.getParameter("password");
		int gno = Integer.parseInt(request.getParameter("gno"));
		GuestBook guestBook = MockGuestBookDao.findById(gno);
		if(guestBook.getPassword().equals(password))
			MockGuestBookDao.delete(gno);
		response.sendRedirect("/icia_servlet/guest_book/main");
	}
}
