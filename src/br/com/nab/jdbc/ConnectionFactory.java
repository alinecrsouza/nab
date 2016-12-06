package br.com.nab.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	
	public Connection getConnection() {
	  
	try {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost/nab", "root", "123456");
	} catch (SQLException e) {
		throw new RuntimeException(e);
	}
	catch(ClassNotFoundException e){
		throw new RuntimeException(e);
	}
	
}
}
