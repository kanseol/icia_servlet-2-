package example18;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/example18/update")
public class UpdateCardServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		
		HttpSession session = request.getSession();
		List<Card> cardList = (List<Card>)session.getAttribute("cardList");
		
		for(Card card:cardList) {
			if(card.getName().equals(name))
				request.setAttribute("card", card);
		}
		RequestDispatcher rd = request.getRequestDispatcher("/example18/update.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		Card card = new Card(name, tel);
		
		HttpSession session = request.getSession();
		List<Card> cardList = (List<Card>)session.getAttribute("cardList");
		for(int i=0; i<cardList.size(); i++) {
			if(cardList.get(i).getName().equals(name)) 
				cardList.remove(i);
		}
		cardList.add(card);
		
		response.sendRedirect("/icia_servlet/example18/list");
	}
}
