package com.pratice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WishServlet
 */
@WebServlet("/WishServlet")
public class WishServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Calendar calender = Calendar.getInstance();
		int hours= calender.get(calender.HOUR_OF_DAY);
		
		response.setContentType("text/html");
		
		PrintWriter pw =response.getWriter();
		
		if(hours<12) {
			pw.write("<h1> Good Morning </h1>");
		}else if (hours>15) {
			pw.write("<h1> Good afternoon </h1>");
		}else {
			pw.write("<h1> good night </h1>");
		}
		
		pw.write("<a href=\"http://localhost:8888/ServletPratice/page.html\"> welcome </a>");
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
}