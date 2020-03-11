package com.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {

	public static void main(String[] args) {
		
		String sql = "select * from movies where title = ?";
		
		List<String> parameters = new ArrayList<>();
		
		parameters.add("Star wars");
		
		Record record = new Record();
		
		Statement firstStatement = new Statement(sql, parameters, record);
		
		System.out.println(firstStatement);
		System.out.println(firstStatement.getSql());
		System.out.println(firstStatement.getParameters());
		System.out.println(firstStatement.getRecord());
		
		System.out.println("");
		
		Statement secondStatement = firstStatement.clone();
		secondStatement.setSql("select teste");
		System.out.println(secondStatement);
		System.out.println(secondStatement.getSql());
		System.out.println(secondStatement.getParameters());
		System.out.println(secondStatement.getRecord());
		
		System.out.println("");
		
		System.out.println(firstStatement);
		System.out.println(firstStatement.getSql());
		System.out.println(firstStatement.getParameters());
		System.out.println(firstStatement.getRecord());
		
	}
}
