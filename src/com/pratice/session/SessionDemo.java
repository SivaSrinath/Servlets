package com.pratice.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionDemo
 */
@WebServlet("/SessionDemo")
public class SessionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int sum = Integer.parseInt(request.getParameter("t1")) + Integer.parseInt(request.getParameter("t2"));
		
		HttpSession session=request.getSession();
		session.setAttribute("SUM",sum);
		
		
		response.getWriter().append("<a href='http://localhost:8888/ServletPratice/SessionDemo2' >Get Sum</a>")
		.append("/br").append(session.getId());
		
	}
}
