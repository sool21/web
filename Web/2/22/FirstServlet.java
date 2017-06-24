package com;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FirstServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		double a, b, c, d, d1, x1, x2;
		String var1 = req.getParameter("var1");
		a = Double.parseDouble(var1);
		String var2 = req.getParameter("var2");
		b = Double.parseDouble(var2);
		String var3 = req.getParameter("var3");
		c = Double.parseDouble(var3);
		d = b * b - 4 * a * c;
		if (d < 0) {
			resp.getWriter().println("Error");
		} else {
			if (d == 0) {
				x1 = 0 - b / 2 * a;
				resp.getWriter().println(x1);
			} else {
				d1 = Math.sqrt(d);
				x1 = 0 - (b - d1) / 2 * a;
				x2 = 0 - (b + d1) / 2 * a;
				resp.getWriter().println(x1+" "+x2);
			}
		}
	}

}