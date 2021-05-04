package example16;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/example16/calc")
public class TestServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/example16/input.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int val1 = Integer.parseInt(request.getParameter("val1"));
		int val2 = Integer.parseInt(request.getParameter("val2"));
		int num = Integer.parseInt(request.getParameter("num"));
		
		int cnt = 0;
		for(int i=val1; i<=val2; i++) {
			if(i%num==0)
				cnt++;
		}
		
		request.setAttribute("val1", val1);
		request.setAttribute("val2", val2);
		request.setAttribute("num", num);
		request.setAttribute("cnt", cnt);
		
		RequestDispatcher rd = request.getRequestDispatcher("/example16/result.jsp");
		rd.forward(request, response);
	}
}
