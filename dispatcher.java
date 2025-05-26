package com.cyber;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class dispatcher extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
	int k = (int)request.getAttribute("k");	
	k*=k;
		PrintWriter out = response.getWriter();
		out.println("<center>Welcome to Programming</br> the answer is " + k + "</center");
		
	}

}
