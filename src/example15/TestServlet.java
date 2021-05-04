package example15;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/example15/calc")
public class TestServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/example15/input.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int val1 = Integer.parseInt(request.getParameter("val1"));
		int val2 = Integer.parseInt(request.getParameter("val2"));
			
		int sum = 0;
		for(int i=val1; i<=val2; i++)
			sum+=i;
		
		request.setAttribute("val1", val1);
		request.setAttribute("val2", val2);
		request.setAttribute("sum", sum);
		
		RequestDispatcher rd = request.getRequestDispatcher("/example15/result.jsp");
		rd.forward(request, response);
	}
}
