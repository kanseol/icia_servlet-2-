package example18;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/example18/list")
public class ListServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("cardList")==null) {
			List<Card> cardList = new ArrayList<>();
			session.setAttribute("cardList", cardList);
		}
		RequestDispatcher rd = request.getRequestDispatcher("/example18/list.jsp");
		rd.forward(request, response);
	}
}
