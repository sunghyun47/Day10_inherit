package com.google.zoo;

public interface Flyable {

	//상수(생성자X)
	//접근지정자는 public, static, final 들어가야됨
	//안쓰면 자동으로 생성됨
	public static final int num = 10;
	int number = 20;
	
	// 추상메서드(생성자X)
	// public, abstract
	//안쓰면 자동으로 생성됨
	public abstract void fly();
	
}
