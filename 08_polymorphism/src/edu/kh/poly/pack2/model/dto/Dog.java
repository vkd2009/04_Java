package edu.kh.poly.pack2.model.dto;

public class Dog extends Animal{
		
	// The type Dog must implement 
	//the inherited abstract method Animal.sleep()
	// -> Dog 유형은 상속된 추상 메서드 Animal.sleep()을 구현해야 합니다
	
	// 추상 클래스를 상속 받은 경우!!
	// -> 부모 클래스에 작성된 추상 메서드를
	//    반드시! 모두 오버라이딩 해야 한다! (오버라이딩 강제화)
	
	// 필드
	private boolean harness; // 가슴줄
	
	
	// 생성자
	public Dog() {
		super();
	}
	
	
	// 매개 변수 생성자
	public Dog(String type, boolean harness) {
		super(type);
		this.harness = harness;
	}
	
			
	
	@Override
	public void eat() {
			System.out.println("강아지는 엎드려 입을 이용해서 밥을 먹는다");
	}
	


	@Override
	public void sleep() {
			System.out.println("강아지는 몸을 웅크려서 잔다");
	}
	
	
	// getter - setter \ boolean은 get을 is로 표현한다.
	public boolean isHarness() {
		return harness;
	}
	
	
	public void setHarness(boolean harness) {
		this.harness = harness;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString()	+ " / 가슴줄 유무 : " + harness;
	}
	




	
	
	
	
}
