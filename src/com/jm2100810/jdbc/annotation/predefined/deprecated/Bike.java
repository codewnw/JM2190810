package com.jm2100810.jdbc.annotation.predefined.deprecated;

public class Bike {

	/**
	 * This method may not be supported or improved in future release so avoid using
	 * this method
	 */
	@Deprecated
	public void kickStart() {
		System.out.println("Bike is started uing kick.");
	}

	//for moving
	public void move() {
		System.out.println("Bike is moving.");
	}

	/*for stopping*/
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
