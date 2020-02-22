package com.patterns.singleton;

public class DbSingletonLazyLoad {

	private static DbSingletonLazyLoad instance = null;
	
	private DbSingletonLazyLoad() {}
	
	/**
	 * 
	 * Just changing this to be lazily loaded can improve the performance
	 */
	public static DbSingletonLazyLoad getInstance() {
		if(instance == null) {
			instance = new DbSingletonLazyLoad();
		}
		return instance;
	}
}
