package com.google.zoo;

public class Lion extends Animal{ //Animal에서 정보가 있으니 클래스에서 상속받자 extends animal 추가
	
	//Lion만 가지고 있는거 출력
	private int tooth;
	
	
	
	public int getTooth() {
		return tooth;
	}



	public void setTooth(int tooth) {
		this.tooth = tooth;
	}


	public void eat() {
		//오버라이딩
		//super.eat(); //부모의  eat 호출
		//System.out.println("찹찹찹");
	}

	
	
	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.eat();
		
	}


}
