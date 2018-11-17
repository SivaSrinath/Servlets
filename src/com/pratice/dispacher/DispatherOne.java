package com.pratice.dispacher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/one")
public class DispatherOne extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		
	//	res.sendRedirect("https://github.com/");
		RequestDispatcher rd = req.getRequestDispatcher("/two");
		
		//rd.forward(req, res);
		rd.include(req, res);
		PrintWriter pw=res.getWriter();
		pw.write("<h1>This from servlet one</h1>");
	}
}
