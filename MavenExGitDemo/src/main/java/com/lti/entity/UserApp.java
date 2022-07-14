package com.lti.entity;

public class UserApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome User!");
		
		Calculator c = new Calculator();
		System.out.println(c.add(10, 20));
		
		ClientApp cl = new ClientApp();
		cl.runClient();

	}

}
