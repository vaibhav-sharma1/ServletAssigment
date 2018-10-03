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
 * Servlet implementation class MyServlet3
 */
@WebServlet("/MyServlet3")
public class MyServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet3() {
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
		String gmail = null;
		String phone = null;
		
		Cookie [] cookie_array = request.getCookies();
		
		for (Cookie cookie : cookie_array) {
			
			if(cookie.getName().equalsIgnoreCase("firstName")) {
				firstName = cookie.getValue();
			}
			
			if(cookie.getName().equalsIgnoreCase("lastName")) {
				lastName = cookie.getValue();
			}
			
			if(cookie.getName().equalsIgnoreCase("gmail")) {
				gmail = cookie.getValue();
			}
			
			if(cookie.getName().equalsIgnoreCase("phone")) {
				phone = cookie.getValue();
			}
		}
		
		String city = request.getParameter("city");
		String country = request.getParameter("country");
		
		
		request.setAttribute("firstName", firstName);
		request.setAttribute("lastName", lastName );
		request.setAttribute("gmail", gmail);
		request.setAttribute("phone", phone);
		request.setAttribute("city", city);
		request.setAttribute("country", country);
		
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("page4.jsp");
		requestDispatcher.forward(request, response);
		
		
	}

}
