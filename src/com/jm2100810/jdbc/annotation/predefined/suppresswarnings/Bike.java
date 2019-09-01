package com.jm2100810.jdbc.annotation.predefined.suppresswarnings;

public class Bike {

	/**
	 * This method may not be supported or improved in future release so avoid using
	 * this method
	 */
	@Deprecated
	public void kickStart() {
		System.out.println("Bike is started uing kick.");
	}

	public void move() {
		System.out.println("Bike is moving.");
	}

	public void stop() {
		System.out.println("Bike is stopped.");
	}

	/**
	 * New and improved method and an alternative to kickStart
	 */
	public void selfStart() {
		System.out.println("Bike is started uing self.");
	}
}
