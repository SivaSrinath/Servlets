package com.session.management;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name= req.getParameter("pname");
		String age = req.getParameter("page");
		String mstatus=req.getParameter("ms");
		String hid=req.getParameter("hid");
		
		if(mstatus==null)
			mstatus="single";
		//get printwriter object
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("<h1>Thi is hidden field :"+hid+" : </h>");
		
		//generate second form dynamically
		if(mstatus.equals("married")) {
			pw.println("<form action=\"http://localhost:8888/ServletPratice/Servlet2\" method=\"post\">");
			pw.println("<b> Spouse Name </b><input type='text' name='st1'<br>");
			pw.println("<b> No, of children</b> <input type='text'name='st2'><br>");
			pw.println("<input type='submit' value='submit'>");
			pw.println("</form>");
		}else {
			pw.println("<form action=\"http://localhost:8888/ServletPratice/Servlet2\" method=\"post\"");
			pw.println("<b> when do you want marry</b> <input type='text' name='st1'><br>");
			pw.println("<b> why do you want marry</b><input type='text' name='st2'><br>");
			pw.println("<input type='submit' value='submit'");
			pw.println("</form>");
		}
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
