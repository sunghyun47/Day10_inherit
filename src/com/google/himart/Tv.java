package com.google.himart;

public class Tv extends Product{ //extends Product 상속받기

	//얘만 가지고 있는거
	private int inch;
	
	public Tv() {
		this.inch = 65;
		this.setBrand("lg");
		this.setColor("blue");
		this.setPrice(400);
		this.setPoint(40);
	}
	

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	
	
	
	
}
