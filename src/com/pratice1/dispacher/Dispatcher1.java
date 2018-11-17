package com.pratice1.dispacher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DispatcherOne
 */
@WebServlet("/DispatcherOne")
public class Dispatcher1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd= req.getRequestDispatcher("/Dispatcher2");
		
		//rd.forward(req, res);
		rd.include(req, res);
		
		HttpSession ses= req.getSession();
		String sum = ses.getAttribute("SUM").toString();
		
		PrintWriter pw= res.getWriter();
		pw.write("<h1> From first dispatcher <h1/>");
		pw.write("sum of two number :"+sum);
		
	}
}
