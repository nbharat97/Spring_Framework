package com.springcore.ci;

import java.util.List;

public class Person {

	@Override
	public String toString() {
		
		return this.personId + ":" + this.name + "{ " +this.cert.name +" }" + "and Address is " +this.address ;
	}

	private int personId;
	private String name;
	private Cert cert;
	private List<String> address;
	
	public Person(int personId, String name, Cert cert, List<String> address) {
		
		this.personId = personId;
		this.name = name;
		this.cert = cert;
		this.address = address;
		
	}
} 
