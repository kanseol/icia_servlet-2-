package example18;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/example18/delete")
public class DeleteCardServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		HttpSession session = request.getSession();
		List<Card> cardList = (List<Card>)session.getAttribute("cardList");
		

		for(int i=0; i<cardList.size(); i++) {
			if(cardList.get(i).getName().equals(name)) 
				cardList.remove(i);
		}
		session.setAttribute("cardList", cardList);
		
		response.sendRedirect("/icia_servlet/example18/list");
	}
}
