package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pizza implements InitializingBean, DisposableBean {
	
	@Override
	public String toString() {
		return "Pizza [price=" + price + "]";
	}

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private double price;

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//init
		System.out.println("init method");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy method");
		
	}
	

}
