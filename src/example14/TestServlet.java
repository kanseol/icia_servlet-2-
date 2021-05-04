package example14;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/example14/calc")
public class TestServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/example14/calc.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int val1 = Integer.parseInt(request.getParameter("val1"));
		int val2 = Integer.parseInt(request.getParameter("val2"));
		String operator = request.getParameter("operator");
		
		int result = 0;
		if(operator.equals("+")) {
			request.setAttribute("operator", "덧셈");
			result = val1 + val2;
		}
		else if(operator.equals("-")) {
			request.setAttribute("operator", "뺄셈");
			result = val1 - val2;
		}
		else if(operator.equals("*")) {
			request.setAttribute("operator", "곱셈");
			result = val1 * val2;
		}
				
		request.setAttribute("result", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("/example14/result.jsp");
		rd.forward(request, response);
	}
}
