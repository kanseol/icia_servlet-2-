package example003;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/example3/test3")
public class TestServlet3 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("=============================================");
		System.out.println("문자 집합 : " + response.getCharacterEncoding());
		System.out.println("응답 데이터의 종류 : " + response.getContentType());
		System.out.println(response.getWriter());
	}
}
