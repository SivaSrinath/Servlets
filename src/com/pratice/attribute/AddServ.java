package com.pratice.attribute;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServ
 */
@WebServlet("/AddServ")
public class AddServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		int sum = Integer.parseInt(req.getParameter("x1"))+ Integer.parseInt(req.getParameter("x2"));
		
		req.setAttribute("SUM", sum);
		
		
		RequestDispatcher rd= req.getRequestDispatcher("/AddDisServ");
		rd.include(req, res);
		
	}
}