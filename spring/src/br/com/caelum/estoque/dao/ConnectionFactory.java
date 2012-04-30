package br.com.caelum.estoque.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static final Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection("jdbc:mysql://localhost/fj27", "root", "");
	}
}
