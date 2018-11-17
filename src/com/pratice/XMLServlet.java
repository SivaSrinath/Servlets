package com.pratice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet; 
//@WebServlet("/hii")
public class XMLServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		res.setContentType("text/xml");
		PrintWriter pw=res.getWriter();
		pw.write("<h1>");
		pw.write(new Date().toString());
		pw.write("</h1>");
		
		pw.print("<h1> DateServletHashCode: "+this.hashCode()+"</h1>");
		pw.print("<h1> req:"+req.hashCode()+"</h1>");
		pw.print("<h1> res:"+res.hashCode()+"</h1>");
		pw.print("<h1> ThreadName:"+Thread.currentThread().getName()+"</h1>");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
