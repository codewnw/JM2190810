package com.jm2100810.jdbc.annotation.predefined.override;

public class Triangle extends Shape {

	/**
	 * there is not method with name dipslay in super class(Shape) so this is not
	 * overriding any method in super class hence compile-time error
	 */
//	@Override
//	public void dipslay() {
//		System.out.println("Displaying triangle.");
//	}

	@Override
	public void display() {
		System.out.println("Displaying triangle.");
	}
}
