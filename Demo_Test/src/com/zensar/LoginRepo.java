


package com.zensar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import javax.xml.ws.Response;

import com.zensar.utility.DBUtil;
import com.zensar.bean.Login;

public class LoginRepo {


	public String Login(String username, String password) throws SQLException {
		Connection	con = DBUtil.getCon();
		String sql = "select * from login where user_id=? and password=?";
		ResultSet rs = null;
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, username);
			pst.setInt(2, Integer.parseInt(password));
			rs = pst.executeQuery();
		} catch (SQLException e) {
			System.out.println("Error from Login Repository: "+e);
			e.printStackTrace();
		}
		return ""+rs.next()+":"+username;
//		return rs.next();
	}
}
