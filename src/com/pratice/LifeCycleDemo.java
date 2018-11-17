package com.pratice;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleDemo
 */
@WebServlet(value = "/LifeCycleDemo", initParams = @WebInitParam(name = "email", value = "sivasrinath19@gmail.com"))
public class LifeCycleDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static {
		System.out.println("Static Block and class is loaded");
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LifeCycleDemo() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Constructor Block and class is loaded");
	}

	@Override
	public void init(ServletConfig sc) {
		System.out.println("Init method Called:");
		System.out.println("name :" + sc.getServletName());
		System.out.println("value :" + sc.getInitParameter("email"));
	}

	@Override
	public void destroy() {
		System.out.println("Desstryo method:");
	}

	/**
	 * @throws IOException
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException

	{
		ServletConfig sc = getServletConfig();
		// request.getServletContext().getSe
		System.out.println("Service");
		response.setHeader("dummy","dummyHeader");
		String requestHeader=request.getHeader("test");
		System.out.println(requestHeader);
		
		response.getWriter().append("<h1>Curent Date " + new Date().toString() + "</h1>");
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
