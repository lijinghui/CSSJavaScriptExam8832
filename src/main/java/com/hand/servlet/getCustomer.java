package com.hand.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonArray;
import com.hand.entity.User;
import com.hand.service.CheckUserService;

/**
 * Servlet implementation class getCustomer
 */
public class getCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CheckUserService cs = new CheckUserService();
	User user = new User();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		JsonArray cusrry =  cs.getCous();
		response.getWriter().write(cusrry.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
