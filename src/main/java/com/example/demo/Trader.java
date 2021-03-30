package com.example.demo;

import org.springframework.stereotype.Component;

@Component("trd")
public class Trader {
	
	private int id;
	private String name;
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
	
	public void view() {
		System.out.println("Just show it");
	}

}
