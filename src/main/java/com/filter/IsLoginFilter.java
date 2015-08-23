package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

public class IsLoginFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public IsLoginFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("----------");
		  HttpServletRequest req = (HttpServletRequest) request;  
		  HttpServletResponse res = (HttpServletResponse) response;  
		  HttpSession session = req.getSession(true); 
		 if( session.getAttribute("islogin")==null){
			 RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			 rd.forward(request, response);
		 };

		System.out.println("结束验证");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("初始化");
	}

}
