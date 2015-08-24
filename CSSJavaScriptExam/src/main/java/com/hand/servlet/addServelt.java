package com.hand.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.Dao.imp.UserDaoImp;
import com.hand.util.ConnectionFactory;
import com.mysql.fabric.xmlrpc.base.Data;

/**
 * Servlet implementation class UpdateServelt
 */
public class addServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDaoImp user = new UserDaoImp();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public addServelt() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = ConnectionFactory.getInstance().makeConnextion();
		String upSql = "INSERT INTO customer(first_name,last_name,email,store_id,address_id,create_date) VALUES(?,?,?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(upSql);
			ps.setString(1, request.getParameter("fn"));
			ps.setString(2, request.getParameter("ln"));
			ps.setString(3, request.getParameter("em"));
			ps.setInt(4, 1);
			ps.setInt(5, 1);
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
			String str = sdf.format(date);
			ps.setString(6,str);
			System.out.println(ps);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
