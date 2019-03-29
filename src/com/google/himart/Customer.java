package com.google.himart;

public class Customer {

	private int price;
	private int point;
	
	public Customer() {

		this.price = 1000;
		this.point = 0;
		
	}
	
	// 메서드명 buy, 매개변수 1개
	// 계산 후, 현재잔액, 현재 포인트 출력
	
	public void buy(Product p) {
		this.price = this.price - p.getPrice();
		this.point = this.point + p.getPoint();
		System.out.println("잔액 : " +this.price);
		System.out.println("포인트 : " +this.point);
		
	}
	
	public void buy(Computer t) {
		
		
	}
	
	public void buy(HandPhone p) {
		
		
	}
	
	
}
