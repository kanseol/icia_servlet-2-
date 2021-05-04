package example005;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/example5/test1")
public class TestServlet1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><head></head><body>");
		out.print("<div style='border:1px solid red;'>");
		out.print("<p>당신의 이름 : " + name + "</p>");
		out.print("</div></html>");
		out.close();
	}
}
