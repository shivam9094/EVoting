package com.info.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.info.model.Employee;
import com.info.service.EmployeeService;

/**
 * Servlet implementation class FirstPage
 */
@WebServlet("/login-form")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String username = request.getParameter("username");
		String aadhar = request.getParameter("aadhar");
		String password = request.getParameter("password");
		
		Employee emp = new Employee( password,aadhar);
		boolean flag = EmployeeService.verify(emp);
		
		if(flag)
		{
			HttpSession session = request.getSession();
			session.setAttribute("name", aadhar);
			
				RequestDispatcher rd = request.getRequestDispatcher("user-page");
				rd.forward(request, response);
			
		}
		else{
			request.setAttribute("loginFlag", "false");
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			rd.include(request, response);
		   /* System.out.println("okkk");*/}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
