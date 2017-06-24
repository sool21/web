package com;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FirstServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		   int[][] twoD = new int[8][5]; // объ€вили двухмерный массив
		   int i, j, k=-99;
		   for (i = 0; i < 8; i++)
		   {
		   	for (j = 0; j < 5; j++) 
		   		{
		   		twoD[i][j] =((int)(Math.random()*198))-99;
		   		if (twoD[i][j]>k) {k=twoD[i][j];}
		   		resp.getWriter().println(twoD[i][j] + " ");
		   		}
		   	resp.getWriter().println(" <br/> ");
		   }
		   resp.getWriter().println("MAX: ");
		   	resp.getWriter().println(k);
	   }
	}