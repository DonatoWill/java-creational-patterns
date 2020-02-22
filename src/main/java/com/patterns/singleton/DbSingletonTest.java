package com.patterns.singleton;

public class DbSingletonTest {

	public static void main(String[] args) {
		 
		testSingletonLazyLoade();
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
	
}
