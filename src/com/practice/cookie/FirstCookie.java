package com.practice.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//tax.html
/**
 * Servlet implementation class FirstCookie
 */
@WebServlet("/FirstCookie")
public class FirstCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("Name");
		String fatherName=req.getParameter("fname");
		
		Cookie nameCookie= new Cookie("cName",name);
		Cookie fatherCookie = new Cookie("fName", fatherName);
		
		res.addCookie(nameCookie);
		res.addCookie(fatherCookie);
		
		PrintWriter pw= res.getWriter();
		res.setContentType("text/html");
		
		pw.println("age of name cookie"+nameCookie.getMaxAge()+"domain name is :"+nameCookie.getDomain());
		pw.println("age of father cookie"+fatherCookie.getMaxAge()+"domain name is :"+ fatherCookie.getDomain());
		
		HttpSession ses=req.getSession();  // HTTP session with cookies
		//pw.println("session id:"+ses.getId());
		
		pw.println("<form action=\"http://localhost:8888/ServletPratice/SecondCookie\" action=\"Get\">");
		pw.println("Income of this year: <input type='text' name='incomeYear'/>");
		pw.println("Tax: <input type='text' name='taxValue'/>");
		pw.println("Submit: <input type='submit' value='sub'");
		pw.println("<form/>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
