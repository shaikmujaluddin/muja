package com.nt.beans;

import java.util.Date;

public class WishGenerator {
	private String name;
	private Date date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	//B.logic
	public String generatorWishMsg()
	{
		return "Good Moring    "+name+"--->"+date;
	}
	
	

}
