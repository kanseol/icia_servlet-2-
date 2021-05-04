package example22;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/guest_book/main")
public class GuestBookMain extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(MockGuestBookDao.list());
		request.setAttribute("list", MockGuestBookDao.list());
		request.setAttribute("viewname", "list.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("/example22/main.jsp");
		rd.forward(request, response);
	}
}
