package com.google.quiz;

public class God {

	private static final God god = new God();
	
	private God() {

	}

	public void say() {
		System.out.println("today is friday");

	}

	public static God get() { 
//		God god = new God();
		return god;
	}

	


}
