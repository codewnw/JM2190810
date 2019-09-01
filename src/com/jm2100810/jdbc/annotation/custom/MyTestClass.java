package com.jm2100810.jdbc.annotation.custom;

@Test
public class MyTestClass {

	// The annotation @Test is disallowed for this location
	// compile-time error
	// @Test
	public MyTestClass() {
	}

	@Test
	private String test;

	@Test(enabled = true)
	public void test1() {
		System.out.println("test1");
	}

	@Test(enabled = false)
	public void test2() {
		System.out.println("test2");
	}

	@Test
	public void test3() {
		System.out.println("test3");
	}

	public void test4() {
		System.out.println("test4");
	}
}
