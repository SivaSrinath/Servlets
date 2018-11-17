

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw=response.getWriter();
		pw.print("character encoding "+ req.getCharacterEncoding());
		//null or gzip
		pw.println("<br> content type"+ req.getContentType());
		//null or text/html kind
		pw.println("<br> content length"+ req.getContentLength());
		pw.println("<br> browser host name"+ req.getRemoteHost());
		
		pw.println("<br> browser host address"+ req.getRemoteAddr());
		
		pw.println("<br> browser port no"+ req.getRemoteAddr());
		
		pw.println("<br> protocol"+ req.getProtocol());
		
		pw.println("<br> schema"+ req.getScheme());
		
		pw.println("<br> server"+ req.getServerName());
		
		pw.println("<br> server port no"+ req.getServerPort());
		
		pw.println("<br> request method"+ req.getMethod());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
