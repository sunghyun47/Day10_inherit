package com.google.himart;

public class HimartView {

	// 각 제품의 정보를 출력 메서드
	public void view(Product p) {
		System.out.println("brand " + p.getBrand());
		System.out.println("price " + p.getPrice());
		System.out.println("point " + p.getPoint());
		System.out.println("color " + p.getColor());
		//System.out.println("inch " + p.getInch());

		if(p instanceof Tv) { //tv클래스 객체입니까?라는 변수
			Tv t = (Tv)p;
			System.out.println(t.getInch());
		}
		else if(p instanceof Computer) {
			Computer c = (Computer)p;
		}
		else {
			HandPhone h = (HandPhone)p;
		}
		
		
	}
	

}
