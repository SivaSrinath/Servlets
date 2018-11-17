package com.pratice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CountryServlet
 */
@WebServlet("/CountryServlet")
public class CountryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String statesIndia[] = {"AP", "TS", "MH"};
		String statesCanada[] = {"PA", "CT", "UT"};
		String statesAus[] = {"", "TS", "MH"};
		
		String countryName=req.getParameter("country");
		PrintWriter pw= res.getWriter();
		res.setContentType("text/html");
		
		if(countryName.equals("India")) {
			pw.println("states= "+ Arrays.asList(statesIndia));
		}else if(countryName.equals("CA")) {
			pw.println("states= "+ statesCanada.toString());
		}else {
			pw.println("states="+ statesAus.toString());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
