package com.nt.beans;

public class DTDC implements Courier {

	public DTDC()
	{
		System.out.println("DTDC:0-param constructor");
	}
	
	public String deliver(int orderid) {
		// TODO Auto-generated method stub
		return "DTDC is redy to deliver product of"+orderid;
	}

}
