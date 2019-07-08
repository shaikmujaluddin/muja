package com.nt.beans;

import java.util.Random;

public class Flipkart {
	
	private Courier courier;
	
  public Flipkart()
  {
	  System.out.println("lipkart:0-param constructor");
  }
  
  
  //setter method for setter injection 
  
  public void setCourier(Courier courier )
  {
	  //System.out.print("FlipKart:setCourier(-)");
	  
	  this.courier=courier;
  }
  
  public String purchase(String items[])
  {
	  //generate order id 
	  
	  Random rad=new Random();
	  int orderid=rad.nextInt(500000);
	  //deliver order
	  String status=courier.deliver(orderid);
	 return status+"bill amt for oder id  "+orderid+"   is 7000"	; 
  }
  
}
