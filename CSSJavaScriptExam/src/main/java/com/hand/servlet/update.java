package com.hand.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hand.util.ConnectionFactory;

/**
 * Servlet implementation class update
 */
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = ConnectionFactory.getInstance().makeConnextion();
		String upSql = "UPDATE customer SET first_name = ?,last_name=?,email=? WHERE customer_id=?";
		System.out.println(upSql);
		try {
			PreparedStatement ps = conn.prepareStatement(upSql);
			ps.setString(1, request.getParameter("fn"));
			ps.setString(2, request.getParameter("ln"));
			ps.setString(3, (request.getParameter("em")));
			ps.setString(4,  request.getParameter("id"));
			System.out.println(ps.toString());
			
			ps.execute();
			 HttpServletRequest req = (HttpServletRequest) request;  
			  HttpServletResponse res = (HttpServletResponse) response;  
			  HttpSession session = req.getSession(true); 
			  session.setAttribute("islogin", '1');
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			 rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
