package com.springcore.ci;

public class Cert {

	@Override
	public String toString() {
		
		return this.name;
	}

	public Cert(String name) {
		super();
		this.name = name;
	}

	String name;
	
}
