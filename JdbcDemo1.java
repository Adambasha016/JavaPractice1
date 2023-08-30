package org.demo.jdbc.practice;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class JdbcDemo1 {
public static void main(String[] args) {
	Connection con=null;
	Statement stmt=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver class oaded and registerd");
		con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&pasword=root");
        System.out.println("establised connection");
         stmt = con.createStatement();
         System.out.println("piatform created");
	
	
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		if(stmt!=null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
}
