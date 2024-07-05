package com.springIoc.constructor;

public class Person2 {

	int id;
	String name;
		
	
	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void test()
	{
		System.out.println("id :"+id);
		System.out.println("name :"+name);
	}
	
}
