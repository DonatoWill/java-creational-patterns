package com.patterns.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbSingletonConnection {

	private static volatile DbSingletonConnection instance = null;
	private static volatile Connection conn = null;

	private DbSingletonConnection() {
		
		// Prevent reflection
		if (conn != null) {
			throw new RuntimeException("Use getConnection() method to create");
		}

		// Prevent reflection
		if (instance != null) {
			throw new RuntimeException("Use getInstance() method to create");
		}
	}

	/**
	 * 
	 * Just changing this to be lazily loaded can improve the performance, we not
	 * sync the hole method because it downs performance
	 */
	public static DbSingletonConnection getInstance() {
		if (instance == null) {
			synchronized (DbSingletonConnection.class) {
				if (instance == null) {
					instance = new DbSingletonConnection();
				}
			}

		}
		return instance;
	}

	public Connection getConnection() {
		
		if (conn == null) {
			synchronized (DbSingletonConnection.class) {
				if (conn== null) {
					try {
						String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
						conn = DriverManager.getConnection(dbUrl);
					}catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}

		}
		return conn;
		
	}
}
