package example003;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/example3/test1")
public class TestServlet1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		System.out.println(name);
		
		String ip = request.getRemoteAddr();
		System.out.println("ip주소 : " + ip);
		
		String url = request.getRequestURL().toString();
		System.out.println("요청 주소 : " + url);
	}


}
