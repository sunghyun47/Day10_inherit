package com.google.zoo;

import com.google.himart.AirPlane;

public class Main {

	public static void main(String[] args) {

		Eagle e = new Eagle(); //객체 생성
		
		Animal a= e;
		Birds b = e;
		Flyable f = e;
		
		AirPlane air = new AirPlane();
		
		Flyable f2 = air;
		
		
		
		
		
	}

}
