package example002;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

// /board/sample2.jsp와 같이 작업하기 위해 경로를 맞춰주려면 아래와 같이 주소 지정
// /board는 실제 존재하는 경로가 아니다
@WebServlet("/board/sample2")
public class SampleServlet02 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getRequestURL());
	}
}
