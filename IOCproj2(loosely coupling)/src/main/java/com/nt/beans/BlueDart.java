package com.nt.beans;

public class BlueDart implements Courier {

	public BlueDart()
	{
		System.out.println("BlueDart:0-param constructor");
	}
	

	public String deliver(int orderid) {
		// TODO Auto-generated method stub
		return "BlueDart is redy to deliver product of   "+orderid;
	}
	
	

}
