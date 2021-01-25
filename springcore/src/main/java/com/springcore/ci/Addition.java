package com.springcore.ci;

public class Addition {

	private int a;
	private int b;
	
	public Addition(int a, int b) {
		
		this.a = a;
		this.b = b;
		System.out.println(a+" const is int "+b);
	}
	
	public Addition(double a, double b) {
	
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("const is double");
	}
	
	public Addition(String a, String b) {
		
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("const is string");
	}
	
	public void doSum() {
		
		System.out.println(this.a + this.b);
		
	}
}
