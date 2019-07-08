package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Flipkart;

public class LCTestApp {

	public static void main(String[] args) {
		
		//create Bean Factory object to create IOC conntianer
		
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		
		
		//Get bean ID		
		Flipkart bean=factory.getBean("flipkart",Flipkart.class);
	String billmsg=bean.purchase(new String[] {"Shirt","mobile","books"});
		System.out.println(billmsg);
		
		


	}

}
