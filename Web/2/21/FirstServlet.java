package com;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FirstServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
	       double result, x1, x2, x11=0, x22=0;
	       String var1 = req.getParameter("var1");
	       x1 = Double.parseDouble(var1);
	       String var2 = req.getParameter("var2");
	       x2 = Double.parseDouble(var2);
		   x11-=10;
		   Math.abs(x11);
		   x22-=10;	
		   Math.abs(x22);
	       if( x11 < x22 )
	         {
	    	   result=x1;
	         }
	       		result=x2;
	    		resp.getWriter().println(result);
	         }
			
	   }