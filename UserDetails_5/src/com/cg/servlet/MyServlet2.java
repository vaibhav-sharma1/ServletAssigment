package com.cg.servlet;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet2
 */
@WebServlet("/MyServlet2")
public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub


	String firstName = null;
	String lastName = null;
	
	Cookie [] cokkie_Array = request.getCookies();
	
	for (Cookie cookie : cokkie_Array) {
		
		if(cookie.getName().equalsIgnoreCase("firstName")) {
			firstName = cookie.getValue();
		}
		
		if(cookie.getName().equalsIgnoreCase("lastName")) {
			lastName = cookie.getValue();
		}
		
	}
	
	
	String gmail = request.getParameter("gmail");
	String phone = request.getParameter("phone");

	Cookie cookie3 = new Cookie("gmail", gmail);
	Cookie cookie4 = new Cookie("phone", phone);
	
	response.addCookie(cookie3);
	response.addCookie(cookie4);
	
	request.setAttribute("firstName", firstName);
	request.setAttribute("lastName", lastName );
	request.setAttribute("gmail", gmail);
	request.setAttribute("phone", phone);
	
	RequestDispatcher requestDispatcher = request.getRequestDispatcher("page3.jsp");
	requestDispatcher.forward(request, response);
		
	}
		
	

}
