package com.hand.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.hand.Dao.UserDao;
import com.hand.Dao.imp.UserDaoImp;
import com.hand.entity.User;
import com.hand.util.ConnectionFactory;

public class CheckUserService {
	private UserDao userDao = new UserDaoImp();

	public boolean check(User user) throws SQLException, ClassNotFoundException {
		Connection conn = ConnectionFactory.getInstance().makeConnextion();
		System.out.println("CheckUserService 1");
		try {
			
			System.out.println(conn.getAutoCommit());
			System.out.println("CheckUserService 2");
			
			while(userDao.get(conn, user).next()){
				return true;
			};

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}
	
	public JsonArray getCous() throws SQLException{
		Connection conn = ConnectionFactory.getInstance().makeConnextion();
		JsonArray array = new JsonArray();
		try {
			ResultSet res = userDao.show(conn);
			
			
			while(res.next()){
			JsonObject lan1 = new JsonObject();
			lan1.addProperty("customer_id", res.getString(1));
			lan1.addProperty("store_id", res.getString(2));
			lan1.addProperty("first_name", res.getString(3));
			lan1.addProperty("last_name", res.getString(4));
			lan1.addProperty("email", res.getString(5));
			lan1.addProperty("last_update", res.getString(6));
			array.add(lan1);
			
			}
			
			return array;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			conn.close();
		}
		
		return null;
	}

}
