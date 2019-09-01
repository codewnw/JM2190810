package com.jm2100810.jdbc.annotation.predefined.suppresswarnings;

public class Rider {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Bike bike = new Bike();
		/**
		 * No compile-time warning will be shown because warning has been suppressed by
		 * the annotations @SuppressWarnings
		 */
		bike.kickStart();
		bike.move();
		bike.stop();
	}

}
