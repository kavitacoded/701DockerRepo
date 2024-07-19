package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/dateurl")
public class DateServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//get printwriter
		PrintWriter pw= resp.getWriter();
		//set response content type
		resp.setContentType("text/html");
		Date d=new Date();
		//writer the response
		pw.println("<h1 class='color:red'>Date and time ::" +d+ "</h1>");
		//add home hyperlink
		pw.println("<br> <a href='index.jsp'> home </a>");
		//close stram
		pw.close();
		super.doGet(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		super.doPost(req, resp);
	}
}
