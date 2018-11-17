package com.prac.listen;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

/**
 * Application Lifecycle Listener implementation class TimeProcessingListener
 *
 */
@WebListener
public class TimeProcessingListener implements ServletRequestListener {

    /**
     * Default constructor. 
     */
    public TimeProcessingListener() {
        // TODO Auto-generated constructor stub
    }

    private long start, end;
	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    	
    	end=System.currentTimeMillis();
    	ServletContext sc = sre.getServletContext();
    	sc.log(((HttpServletRequest)sre.getServletRequest()).getRequestURL()+ "has taken"+ (end-start));
    	System.out.println(((HttpServletRequest)sre.getServletRequest()).getRequestURL()+ "has taken"+ (end-start));
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    	start=System.currentTimeMillis();
    	
    }
	
}