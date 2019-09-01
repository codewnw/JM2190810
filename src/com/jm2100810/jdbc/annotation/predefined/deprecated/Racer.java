package com.jm2100810.jdbc.annotation.predefined.deprecated;

public class Racer {

	public static void main(String[] args) {
		Bike bike = new Bike();
		// no compile-time warning
		bike.selfStart();
		bike.move();
		bike.stop();
	}

}
