package com.dips.SpringPractice;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	int id;
	String name;
	String msg;
	
	public void msg()
	{
		System.out.println("This is Demo Class Method");
	}
	public void setMsg(String msg)
	{
		this.msg = msg;
	}
	public void getMsg()
	{
		System.out.println(msg);
	}
	
	public Demo() {}

	public Demo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + "]";
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("Init method");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroy method");
	}
	
	
}
