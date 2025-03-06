package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Exp1 {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/Maven";
		String username = "root";
		String password = "root@39";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();
			String sql1 = "insert into student values(10, 'Leo Messi','messi@afa.com')";
			String sql2 = "insert into student values(11, 'ADM','adm@afa.com')";
			String sql3 = "insert into student values(19, 'Spidy','spidy@afa.com')";
			
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			stmt.executeBatch();
			
			String sql11 = "insert into student values(?, ?, ?)";
			
			PreparedStatement pst = con.prepareStatement(sql11);
			
			pst.setInt(1, 20);
			pst.setString(2, "Dybala");
			pst.setString(3, "dybala@afa.com");
			
			pst.addBatch();
			pst.executeBatch();
			
			String sql211 = "insert into student values(?, ?, ?)";
			
			PreparedStatement pst2 = con.prepareStatement(sql211);
			
			pst2.setInt(1, 7);
			pst2.setString(2, "DePaul");
			pst2.setString(3, "r.depaul@afa.com");
			
			pst2.addBatch();
			pst2.executeBatch();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
