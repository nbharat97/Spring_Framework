package com.springcore.lifecycle;

public class Burger {

	public Burger() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Burger [price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private double price;
	
	public void init() {
		
		System.out.println("inside init method");
	}
	
	public void destroy() {
		
		System.out.println("inside destroy method");
	}
	
}
