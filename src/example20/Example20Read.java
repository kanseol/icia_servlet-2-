package example20;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import org.apache.commons.lang3.math.*;

@WebServlet("/example20/read")
public class Example20Read extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pno = NumberUtils.toInt(request.getParameter("pno"), 1);
		Post post = MockPostDao.read(pno);
		request.setAttribute("post", post);
		RequestDispatcher rd = request.getRequestDispatcher("/example20/read.jsp");
		rd.forward(request, response);
	}
}
