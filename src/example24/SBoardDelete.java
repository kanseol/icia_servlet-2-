package example24;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import org.apache.commons.lang3.math.*;


@WebServlet("/sboard/delete")
public class SBoardDelete extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("username")==null) {
			response.sendRedirect("/icia_servlet/sboard/login");
		} else {
			int pno = NumberUtils.toInt(request.getParameter("pno"), 0);
			MockPostDao.delete(pno);
			response.sendRedirect("/icia_servlet/sboard/list");
		}
	}
}
