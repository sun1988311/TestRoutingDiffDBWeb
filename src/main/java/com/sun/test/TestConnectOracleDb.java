package com.sun.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnectOracleDb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:ORCL", "costrecorddb", "zaq12wsx");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from crt_user");
			while(rs.next())
			{
				System.out.println(rs.getString(2));
			}
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
