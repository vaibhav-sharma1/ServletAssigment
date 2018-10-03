package com.cg.servlet;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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

/*		// With ServletContext Object
		ServletContext servletContext = request.getServletContext();
		
		String firstName = (String) servletContext.getAttribute("firstName");
		String lastName = (String) servletContext.getAttribute("lastName");
		String gmail = request.getParameter("gmail");
		String phone = request.getParameter("phone");
		
		servletContext.setAttribute("gmail", gmail);
		servletContext.setAttribute("phone", phone);
		
		request.setAttribute("firstName", firstName);
		request.setAttribute("lastName", lastName );
		request.setAttribute("gmail", gmail);
		request.setAttribute("phone", phone);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("page3.jsp");
		requestDispatcher.forward(request, response);
		*/
		
	HttpSession httpSession = request.getSession();
	
	String firstName = (String) httpSession.getAttribute("firstName");
	String lastName = (String) httpSession.getAttribute("lastName");
	String gmail = request.getParameter("gmail");
	String phone = request.getParameter("phone");
	
	httpSession.setAttribute("gmail", gmail);
	httpSession.setAttribute("phone", phone);
	
	request.setAttribute("firstName", firstName);
	request.setAttribute("lastName", lastName );
	request.setAttribute("gmail", gmail);
	request.setAttribute("phone", phone);
	
	RequestDispatcher requestDispatcher = request.getRequestDispatcher("page3.jsp");
	requestDispatcher.forward(request, response);
		
	}
		
	

}
