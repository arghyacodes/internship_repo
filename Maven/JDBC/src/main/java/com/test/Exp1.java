package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class Dataloader{
	int mId;
	String mName;
	int mPrice;
	
}

public class Exp1 {
	public static void main(String[] args) {
		try {
//			Load the driver Class
			Class.forName("com.mysql.jdbc.Driver");
			
//			Create Connection Object
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Maven", "root", "root@39");
			
//			Create Statement Object
			Statement stmt = con.createStatement();
			
//			SQL Query
			String sql = "create table movies(id INT PRIMARY KEY, m_name VARCHAR(50), m_price INT)";
			
//			Execute Query
			stmt.execute(sql);
			
//			Close the connection Object
			con.close();
			
			System.out.println("Done");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
