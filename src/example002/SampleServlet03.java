package example002;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

// 확장자 매핑
@WebServlet({"/sample3.do", "/sample3.action"})
public class SampleServlet03 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getRequestURL());
	}
}
