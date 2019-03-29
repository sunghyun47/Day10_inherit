package com.google.zoo;

public class Tazo extends Birds {


//	public static void main(String[] args) {
//		Tazo tazo = new Tazo(); //객체생성
//		tazo.setAge(2);
//		System.out.println(tazo.getAge());
// }
	
	private int egg;
	
	public Tazo() {
		super(); //부모클래스(숨어있음), 부모의 생성자 호출
		
		
	}	
		
	public Tazo(int egg) {
		this.egg = egg;
		this.getAge(); // 부모한테 상속받은 Age
		super.getAge();
	}
		
//	@Override
////		public void fly() {
////			// TODO Auto-generated method stub
////			
////		}
//	
//	@Override
//		public void eat() {
//			// TODO Auto-generated method stub
//			super.eat();
//		}
//		
		
	
	
	
}
