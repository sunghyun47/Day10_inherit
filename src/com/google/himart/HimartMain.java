package com.google.himart;

public class HimartMain {

	public static void main(String[] args) {

		Computer computer = new Computer();
		Tv tv = new Tv();
		HandPhone handPhone = new HandPhone();
		
		Product [] products = new Product[3];
		products[0] = tv;
		products[1] = handPhone;
		products[2] = computer;
		
		HimartView hv = new HimartView();
		//hv.view(tv);
		
		Tv [] tvs = new Tv[3]; //tv담을수있는 공간
		tvs[0] = new Tv();
		tvs[1] = new Tv();
		tvs[2] = new Tv();
		
		Customer iu = new Customer();
		iu.buy(tv);
		
		Product p = tv;
		
		System.out.println(((Tv)p).getInch());
		
		p=new Product();
		System.out.println(((Tv)p).getInch());
		
		p = new Product();
		((Tv)p).getInch();
		
		System.out.println(p.getBrand());
		System.out.println(p.getPrice());
		
		
	}

}
