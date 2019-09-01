package com.jm2100810.jdbc.annotation.custom;

@ClassInfo(author = "James", version = 2, createdOn = "2020", reviewedBy = { "Smith", "Sachin" }, updatedOn = "2021")
public class Scooter {
	public void start() {
		System.out.println("Scooter is started.");
	}

	public void move() {
		System.out.println("Scooter is moving.");
	}

	//The annotation @ClassInfo is disallowed for this location
	//compile-time error
	//@ClassInfo
	public void stop() {
		System.out.println("Scooter has been stopped.");
	}
}
