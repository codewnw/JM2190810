package com.jm2100810.jdbc.annotation.predefined.deprecated;

public class Rider {

	public static void main(String[] args) {
		Bike bike = new Bike();

		/**
		 * kickStart method in Bike class is deprecated, means this method may not be
		 * supported or improved in future release so better stop using the method and
		 * switch to alternative one like selfStart
		 * 
		 * if you continuously keep using kickStart you will be getting compile-time
		 * warning
		 */
		bike.kickStart();

		bike.move();
		bike.stop();
	}

}
