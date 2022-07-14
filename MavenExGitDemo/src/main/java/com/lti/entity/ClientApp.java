package com.lti.entity;

public class ClientApp {

	public void runClient() {
		System.out.println("Welcome Client!");
		
		Calculator c = new Calculator();
		System.out.println(c.add(50, 50));
	}

}
