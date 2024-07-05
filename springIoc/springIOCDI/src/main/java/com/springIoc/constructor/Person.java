package com.springIoc.constructor;

public class Person {

	int id;
	String name;
		
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void test()
	{
		System.out.println("id :"+id);
		System.out.println("name :"+name);
	}
	
}
