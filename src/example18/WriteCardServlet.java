package example18;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/example18/write")
public class WriteCardServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/example18/write.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		Card card = new Card(name, tel);
		
		List<Card> cardList = null;
		HttpSession session = request.getSession();
		if(session.getAttribute("cardList")==null) {
			cardList = new ArrayList<>();
		} else
			cardList = (List<Card>)session.getAttribute("cardList");
		cardList.add(card);
		
		response.sendRedirect("/icia_servlet/example18/list");
	}
}
