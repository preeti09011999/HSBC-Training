package com.hsbc.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hsbc.exception.UserAlreadyExistsException;
import com.hsbc.util.DBUtil;

import om.hsbc.dao.UserDao;

public class UserDaoImpl implements UserDao{
	@Override
	public boolean checkIfUserNameExists(String username) throws UserAlreadyExistsException  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DBUtil.getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM tbl_userdetails WHERE username = ?");
			stmt.setString(1, username);
			ResultSet resultset = stmt.executeQuery();
			if(resultset.next()) {
				throw new UserAlreadyExistsException(username);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	
}
