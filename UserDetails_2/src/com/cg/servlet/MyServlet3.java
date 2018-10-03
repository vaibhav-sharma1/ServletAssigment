package com.cg.servlet;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
/*		String city = request.getParameter("city");
		String country = request.getParameter("country");
		request.setAttribute("city", city);
		request.setAttribute("country", country);*/
		
		ServletContext servletContext = request.getServletContext();
		
		String firstName = (String) servletContext.getAttribute("firstName");
		String lastName = (String) servletContext.getAttribute("lastName");
		String gmail = (String) servletContext.getAttribute("gmail");
		String phone = (String) servletContext.getAttribute("phone");
		
		String city = request.getParameter("city");
		String country = request.getParameter("country");
		
		servletContext.setAttribute("city", city);
		servletContext.setAttribute("country", country);
		
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
