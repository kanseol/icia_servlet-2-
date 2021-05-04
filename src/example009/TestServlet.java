package example009;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/example9/test")
public class TestServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String irum = request.getParameter("irum");
		String gender = "여자";
		if(request.getParameter("gender").equals("male")==true)	
			gender = "남자";
		String[] hobby=request.getParameterValues("hobby");
		
		request.setAttribute("irum", irum);
		request.setAttribute("gender", gender);
		request.setAttribute("hobby", hobby);
		
		RequestDispatcher rd = request.getRequestDispatcher("/example09/result.jsp");
		rd.forward(request, response);
	}


}
