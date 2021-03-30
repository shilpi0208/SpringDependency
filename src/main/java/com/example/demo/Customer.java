package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value ="prototype")
public class Customer {
	
 private int id ;
 private String name;
 @Autowired
 @Qualifier("trd")
 private Trader trade;// here Trader is class whose dependency is added here . 
 
 
public Trader getTrade() {
	return trade;
}
public void setTrade(Trader trade) {
	this.trade = trade;
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
 public void show() {
	 System.out.println("Calling method");
	 trade.view();
 }

}
