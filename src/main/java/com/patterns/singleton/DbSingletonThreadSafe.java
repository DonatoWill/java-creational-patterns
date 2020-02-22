package com.patterns.singleton;

public class DbSingletonThreadSafe {

	private static volatile DbSingletonThreadSafe instance = null;
	
	private DbSingletonThreadSafe() {
		//Prevent reflection  
		if(instance != null) {
			throw new RuntimeException("Use getInstance() method to create");
		}
	}
	
	/**
	 * 
	 * Just changing this to be lazily loaded can improve the performance, we not sync the hole method because it downs performance
	 */
	public static DbSingletonThreadSafe getInstance() {
		if(instance == null) { 
			synchronized (DbSingletonThreadSafe.class) {
				if(instance == null) { 
					instance = new DbSingletonThreadSafe();
				}
			}
			
		}
		return instance;
	}
	
}
