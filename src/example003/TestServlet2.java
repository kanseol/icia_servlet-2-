package example003;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/example3/test2")
public class TestServlet2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> list = Collections.list(request.getHeaderNames());
		System.out.println("=============== 요청 헤더 ==================");
	    for(String headerName:list) {
	    	System.out.println(headerName + " : " + request.getHeader(headerName));
	    }
	}
}