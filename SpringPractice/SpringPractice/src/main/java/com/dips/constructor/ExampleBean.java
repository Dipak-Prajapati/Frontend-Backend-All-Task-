package com.dips.constructor;

public class ExampleBean {

	int id;
	String name;
	
	public ExampleBean(int id , String name)
	{
		System.out.println("In ExampleBean Constructor");
		this.id = id;
		this.name = name;
		System.out.println(id +" "+ name);
	}

	@Override
	public String toString() {
		return "ExampleBean [id=" + id + ", name=" + name + "]";
	}
	
	
}
