package example24;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import org.apache.commons.lang3.math.*;

@WebServlet("/sboard/read")
public class SBoardRead extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pno = NumberUtils.toInt(request.getParameter("pno"), 1);
		Post post = MockPostDao.read(pno);
		request.setAttribute("post", post);
		request.setAttribute("viewname", "read.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("/sboard/main.jsp");
		rd.forward(request, response);
	}
}
