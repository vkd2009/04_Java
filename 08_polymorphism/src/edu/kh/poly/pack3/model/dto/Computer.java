package edu.kh.poly.pack3.model.dto;

// 클래스, 추상 클래스 상속 키워드 : extends (확장하다)
// 인터페이스 상속 키워드는 : implements (구현하다)

public class Computer implements Machine{

	@Override
	public void powerOn() {
		System.out.println("컴퓨터의 power 버튼을 눌러서 킨다");
	}

	@Override
	public void powerOff() {
		System.out.println("컴퓨터의 시스템 종료 기능을 수행");
	}

}
