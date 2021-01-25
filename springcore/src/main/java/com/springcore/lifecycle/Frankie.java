package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Frankie {

	@Override
	public String toString() {
		return "Frankie [price=" + price + "]";
	}

	public Frankie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	private int price;
	
	@PostConstruct
	public void init() {
		
		System.out.println("inside init annotation");
	}
	
	@PreDestroy
	public void destroy() {
		
		System.out.println("inside destroy annotation");
	}
	
}
