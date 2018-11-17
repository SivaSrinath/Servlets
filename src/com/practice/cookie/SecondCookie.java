package com.practice.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondCookie
 */
@WebServlet("/SecondCookie")
public class SecondCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String incYer =req.getParameter("incomeYear");
		String tVal = req.getParameter("taxValue");
		
		Cookie[] data =req.getCookies();
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		String name="";
		String fname="";
		for(Cookie ck:data) {
		
			if(ck.getName().equals("cName")) {
				name=ck.getValue();
			}
			if(ck.getName().equals("fName")) {
				fname=ck.getValue();
			}
		}
		
		pw.println("Form1 data:"+name +"........."+ fname);
		pw.println("Form2 data:"+incYer+"......."+tVal);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
