package example20;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/example20/list")
public class Example20List extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Post> list = MockPostDao.list();
		request.setAttribute("list", list);
		RequestDispatcher rd = request.getRequestDispatcher("/example20/list.jsp");
		rd.forward(request, response);
	}
}
