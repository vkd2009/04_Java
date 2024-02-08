package edu.kh.poly.pack3.model.service;

import edu.kh.poly.pack3.model.dto.Computer;
import edu.kh.poly.pack3.model.dto.Machine;
import edu.kh.poly.pack3.model.dto.Washer;

public class MachineService {

	public void method1() {
		
		// 인터페이스(접점)도 부모 타입 참조 변수로 사용 가능
		// -> 다형성의 업캐스팅
		//   + 매개 변수의 다형성
		//   + 반환형의 다형성
		//   + 부모 타입 객체 배열
		//   + 동적 바인딩
		
		Machine[] arr = new Machine[2]; // 생성된 배열 주소를 arr에 대입
		// Machine[] arr : Machine[] 배열을 참조하는 주소를 저장할
		//								 참조형 변수 arr 선언
		
		// new Machine[2] :
		//  Heap 영역에 Machine 참조 변수 2칸 짜리 배열 생성
		
		arr[0] = new Computer(); // 업캐스팅 적용
		arr[1] = new Washer();   // 업캐스팅 적용
		
		
		for(Machine temp: arr) {
			temp.powerOn();
			temp.powerOff();
			System.out.println("---------------------------------------");
		}			
	}
	
	public void method2() {
		
	}
}
