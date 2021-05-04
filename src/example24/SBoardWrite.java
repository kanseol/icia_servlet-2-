package example24;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/sboard/write")
public class SBoardWrite extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("username")==null) {
			response.sendRedirect("/servlet/sboard/login");
		} else {
			request.setAttribute("viewname", "write.jsp");
			RequestDispatcher rd = request.getRequestDispatcher("/sboard/main.jsp");
			rd.forward(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		if(session.getAttribute("username")==null) {
			response.sendRedirect("/servlet/sboard/login");
		} else {
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			String writer = (String)session.getAttribute("username");
			int pno = MockPostDao.max() + 1;
			Post post = Post.builder().pno(pno).title(title).content(content).writer(writer).build();
			MockPostDao.write(post);
			response.sendRedirect("/icia_servlet/sboard/list");
		}
	}
}
