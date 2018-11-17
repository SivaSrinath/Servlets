package com.filte;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class CheckInputFilter
 */
@WebFilter("/AddServlet")
public class CheckInputFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public CheckInputFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		int t1 = 0;
		int t2 = 0;
		try {
			// place your code here
			t1 = Integer.parseInt(request.getParameter("t1"));
			t2 = Integer.parseInt(request.getParameter("t2"));
		} catch (Exception e) {

			e.printStackTrace();
		}

		if (t1 <= 0 || t2 <= 0) {

			response.getWriter().append("<h1 color=red> vales should be positice only</h1>");
		} else {
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
