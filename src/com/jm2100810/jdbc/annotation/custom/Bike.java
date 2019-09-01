package com.jm2100810.jdbc.annotation.custom;

@ClassInfo
public class Bike {

	public void start() {
		System.out.println("Bike is started.");
	}

	public void move() {
		System.out.println("Bike is moving.");
	}

	public void stop() {
		System.out.println("Bike has been stopped.");
	}
}
