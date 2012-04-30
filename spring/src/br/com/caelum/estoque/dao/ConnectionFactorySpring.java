package br.com.caelum.estoque.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.FactoryBean;

public class ConnectionFactorySpring implements FactoryBean<Connection> {

	public Connection getObject() throws Exception {
		
		return DriverManager.getConnection("jdbc:mysql://localhost/fj27", "root", "");
	}

	public Class<?> getObjectType() {
		
		return Connection.class;
	}

	public boolean isSingleton() {
		
		return false;
	}
}
