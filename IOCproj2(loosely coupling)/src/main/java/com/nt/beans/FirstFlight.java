package com.nt.beans;

public class FirstFlight implements Courier {

	public String deliver(int orderid) {
		return "items are ready to deliver throguh Firstflight   "+orderid;
	}

}
