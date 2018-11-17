package com.pratice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//form.html
/**
 * Servlet implementation class ProcessServlet
 */
//@WebServlet("/ProcessServlet")
public class ProcessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	@Override
	public void init(ServletConfig sc) throws ServletException { 
		// TODO Auto-generated method stub
		System.out.println("name :"+ sc.getServletName());
		System.out.println("value :"+ sc.getInitParameter("email"));
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProcessServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		int val1 = Integer.parseInt((req.getParameter("t1")));
		int val2 = Integer.parseInt(req.getParameter("t2"));
		
		String comp = req.getParameter("s1");
		if(comp.equals("link1")) {
			pw.println("date and time"+ new Date().toString());
		}else if(comp.equals("link2")) {
			pw.println("system properties"+ System.getProperties().toString());
		}else if(comp.equals("add")) {
			pw.println("Addition "+(val1 + val2));
		}else if(comp.equals("sub")) {
			pw.println("Substraction"+(val1 - val2));
		}else {
			pw.println("Multiplication"+(val1*val2));
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}