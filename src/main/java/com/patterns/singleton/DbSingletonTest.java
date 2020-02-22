package com.patterns.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonTest {

	public static void main(String[] args) {

		testDbConnection();
	}

	private static void testSingleton() {

		DbSingleton instance = DbSingleton.getInstance();

		System.out.println(instance);

		DbSingleton newInstance = DbSingleton.getInstance();

		System.out.println(newInstance);

	}

	private static void testSingletonLazyLoade() {

		DbSingletonLazyLoad instance = DbSingletonLazyLoad.getInstance();

		System.out.println(instance);

		DbSingletonLazyLoad newInstance = DbSingletonLazyLoad.getInstance();

		System.out.println(newInstance);

	}

	private static void testDbConnection() {

		DbSingletonConnection instance = DbSingletonConnection.getInstance();

		// Look at performance
		long timeBefore = 0;
		long timeAfter = 0;

		timeBefore = System.currentTimeMillis();
		Connection conn = instance.getConnection();
		timeAfter = System.currentTimeMillis();

		System.out.println(timeAfter - timeBefore);

		Statement sta;
		try {
			sta = conn.createStatement();
			int count = sta.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");
			System.out.println("Table created.");
			sta.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Look at performance
		timeBefore = 0;
		timeAfter = 0;

		timeBefore = System.currentTimeMillis();
		conn = instance.getConnection();
		timeAfter = System.currentTimeMillis();

		System.out.println(timeAfter - timeBefore);

	}

}
