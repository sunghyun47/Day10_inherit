package com.google.himart;

public class Computer extends Product{ //extends Product 상속받기

	//얘만 가지고 있는거
	private int size;
	private String cpu;
	
	public Computer() {
		this.size = 256;
		this.cpu = "i7";
		this.setBrand("apple");
		this.setColor("black");
		this.setPrice(200);
		this.setPoint(20);
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	
	
}
