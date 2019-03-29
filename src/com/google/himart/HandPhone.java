package com.google.himart;

public class HandPhone extends Product{ //extends Product 

	//얘만 가지고 있는거
	private int inch;
	private String name;
	
	public HandPhone() {
		this.inch = 10;
		this.name = "S10";
		this.setBrand("samsung");
		this.setColor("pink");
		this.setPrice(100);
		this.setPoint(10);
		
	}
	
	
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}
