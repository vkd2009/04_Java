package edu.kh.poly.pack1.model.service;
 

import edu.kh.poly.pack1.model.dto.Galaxy;
import edu.kh.poly.pack1.model.dto.Iphone;
import edu.kh.poly.pack1.model.dto.SmartPhone;

public class PolyService {

	/* 다형성 : 다양한 형태를 지니는 성질
	 * 
	 *  1. 상속 관계의 자식 객체의 모습이 여러 모습으로 보임
	 *  	-> 자식 객체, 부모 객체, Object 객체 등으로 변하는 것 처럼 보임
	 * 		
	 * 	2. 오버 로딩
	 * 	-> 같은 클래스에서 같은 이름의 메서드를 여러 번 작성하는 기술
	 * 	-> 조건 : 메서드명 동일, 매개 변수가 개수, 타입, 순서 하나라도 다름
	 * 
	 * 	-> 목적 : 전달 받은 매개 변수에 따른 상황별 처리 방법을 구현
	 * 
	 * sum(a,b)    -> 두 수 더하기
	 * sum(a,b,c,) -> 세 수 더하기
	 * sum(배열)   -> 배열 내 요소 모두 더하기
	 * sum(배열, 배열) -> 두 배열 요소 모두 더하기
	 * 
	 * 
	 * 		--> 이름은 sum 하나 인데 상황에 따라 처리하는 코드가
	 * 				변하는 것 처럼 보임 (이것도 다형성!)
	 */
	
	/**
	 *  다형성 확인 1
	 *  부모 타입 참조변수 = 자식 객체;
	 *   -> 자식 객체 => 부모 객체 (Up casting, 업캐스팅)
	 *   
	 *   + 메모리 구조 꼭 같이 확인!!!
	 */
	public void method1() {
		
			// SmartPhone = Iphone / Galaxy
		  // -> 원래는 컴퓨터 값 처리 원칙 위배 (자동 형변환 대상 X)
		
			// -> 자식 객체 내부에 존재하는
			//    부모 타입(SmartPhone)의 객체만 참조하게 된다!
		
			// -> 자식 객체의 모습이 부모 객체로 변한 것 처럼 보인다!!
			//    (자식 객체가 부모 객체의 모습도 가지고 있음 == 다형성)
		
			SmartPhone s1 = new Iphone();
			SmartPhone s2 = new Galaxy();
			
			
			// 상속 받은 부모 기능 호출 - > 가능 O/X
			s1.setDispaly("레티나 디스플레이");
			s2.setDispaly("AMOLED");
			
			System.out.println("s1.dispaly : " + s1.getDispaly());
			System.out.println("s2.dispaly : " + s2.getDispaly());
			
			
			// 자식 기능 호출 -> 가능 O/X
//			s1.setIosVersion(17);  // 오류
//			s2.setAndroidVersion(15); // 오류
			
			// The method setIosVersion(int) is undefined for the type SmartPhone
			// the type SarmtPhone
			// -> SmartPhone에 setIosVersion( )이 정의되지 않음(==없다)
			
			
	}
	
	
	
	/**
	 * 다형성 확인 2
	 * 
	 * (자식 타입) 부모 타입 참조 변수  -> Down Cating, 다운 캐스팅
	 * 
	 *  - 업 캐스팅된 객체(자식 -> 부모)를 참조하던
	 *  부모 타입 참조 변수를
	 *   자식 타입으로 강제 형변환 하여
	 *   다시 자식 객체를 참조하도록 변경(부모 -> 자식)
	 */
	public void method2() {
		
		// 업캐스팅 상태 : 확인법은 앞에 부모 뒤가 자식일때
		SmartPhone s1 = new Iphone();
		SmartPhone s2 = new Galaxy();
		
		// 다운 캐스팅 전 -> 자식의 기능 접근 불가
		// (참조 변수가 부모 타입이라 부모 객체의 기능 만 접근 가능
//		int v1 = s1.getIosVersion();
//		int v2 = s2.getAndroidVersion();
		
		
			// 다운 캐스팅 후
		
			int v1 = ((Iphone)s1).getIosVersion();
			int v2 = ((Galaxy)s2).getAndroidVersion();
			
			// 다운 캐스팅 + 얕은 복사(주소만 복사)
			Iphone i1 = (Iphone)s1; // s1을 Iphone으로 강제 형변환 휴
																												// 주소를 i1 대입
			
			Galaxy g1 = (Galaxy)s2;
			
			// 자식 객체 메서드 참조 코드 작성 간편해짐
			i1.setIosVesion(20);
			g1.setAndroidVersion(30);
			
			System.out.println("i1.iosVersion : " + i1.getIosVersion());
			System.out.println("g1.AndroidVersion : " + g1.getAndroidVersion());

	}
	
	
	
	/**
	 * 다형성 확인 -> 정적 바인딩 
	 * 
	 * - 프로그램 실행되기 전 컴파일 단계에서
	 * 	 호출되는 메서드가
	 *   어떤 클래스의 메서드와 연결되는지 결정하는 것 
	 */
	public void method3() {
		
			SmartPhone s1 = new SmartPhone();  

			// SmartPhone의 setAp() 메서드와 연결된다
			// void edu.kh.poly.pack1.model.dto.SmartPhone.setAp(String ap)
			s1.setAp("M1");
			
			Galaxy g1 = new Galaxy();
			
			// Galaxy 클래스의 setAndroidVersion() 메서드와 연결
			g1.setAndroidVersion(20);
			// void edu.kh.poly.pack1.model.dto.Galaxy.setAndroidVersion(int androidVersion)
			
			
			
			 
	}
	
	
	/** 
	 * 다형성 확인 4 - 동적 바인딩
	 * 
	 * 	- 프로그램 실행 "중"
	 * 		호출되는 메서드를
	 * 		참조하는 객체의 "오버라이딩"된 메서드로 연결
	 * 
	 * 		부모 타입 참조 변수 = 자식 객체 (업캐스팅)
	 * 
	 * 		-> 부모 타입이 참조하는 객체는 실제로는 자식 타입 객체!!
	 * 		
	 * 
	 * 		-> 오버라이딩된 메서드 호출 시
	 * 			(부모, 자식이 서로 같은 이름의 메서드를 가지고 있음)
	 * 
	 * 			실제 참조 하고 있는 자식 타입 객체의
	 * 			메서드가 우선권을 갖는다!!
	 * 
	 */
	public void method4() {
		
		// 업캐스팅
		SmartPhone s1 = new Galaxy("AMOLED","KT", "스냅드래곤", 17 ); 
			
		// s1.toString() 작성 시 
		// SmartPhone의 toString()	호출된다고 표시됨 == 정적 바인딩
		// (참조 변수가 부모 타입이니깐 부모 부분의 메서드 호출)
		
		// 하지만 실행을 해보니 .....
		// SmartPhone.toString()이 아닌
		// Galaxy.toString() 메서드가 호출됨 == 동적 바인딩
		
		System.out.println(s1.toString());		
	
	
	}
	
	
	
	/**
	 * 객체 배열 + 다형성(업캐스팅) + 다형성(동적 바인딩) 
	 */
	public void method5() {
		
		// 부모 타입 참조 변수로 이루어진 객체 배열 생성
		SmartPhone[] arr = new SmartPhone[3];
		
		// 배열 각 요소(SmartPhone 참조 변수)에
		// SmartPhone(부모) , Iphone(자식), Galaxy(자식)
		// 객체를 생성해서 주소 대입
		
		// 부모 참조 변수 = 부모 객체
		arr[0] = new SmartPhone("LCD", "KT", "엑시노스");
		
		// 부모 참조 변수 = 자식 객체 (업캐스팅)
		arr[1] = new Iphone("Retina Display", "SK", "M2 Chip", 15);
		
		// 부모 참조 변수 = 자식 객체 (업캐스팅)
		arr[2] = new Galaxy("AMOLED", "LG", "스탭드래곤3", 14);
				
		
		// 객체 배열에 다형성을 적용함으로써
		// 배열 하나로 다양한 자료형을 묶음으로 다룰 수 있게됨
		// -> 변수 생성 코드 감소 + 반복문으로 한 번에 제어 가능
		//   --> 전반적으로 코드 길이 감소
		
		// 반복문으로 객체 배열 순차 접근하기
		// (향상된 for문 + 업캐스팅 + 동적 바인딩)
		
		for(SmartPhone s : arr) { // [1], [2] 인덱스에서 업캐스팅 적용
				// 매 반복 시 마다 arr의 요소를 하나씩 꺼내 s에 저장
				
				System.out.println( s.toString() );
				
				// [0] : SmartPhone.toString() 호출
				// [1] : Iphone.toString() 호출 (동적 바인딩)
				// [2] : Galaxy.toString() 호출 (동적 바인딩)
			
		}
	}
	
	
	
	/**
	 * 매개 변수에 다형성 적용 (오버로딩과 관련됨) 
	 */
	public void method6() {
		
		// 다형성 적용 안된 상태
		SmartPhone smartPhone	 = new SmartPhone("LCD", "KT", "엑시노스");				
		Iphone iphone = new Iphone("Retina Display", "SK", "M2 Chip", 15);					
		Galaxy galaxy = new Galaxy("AMOLED", "LG", "스탭드래곤3", 14);
		
		printToString(smartPhone);
		printToString(iphone);
		printToString(galaxy);
		
	}
	
	// 업캐스팅이 적용되어 iphone,galaxy가 들어와도 아무런 문제가 없다
	public void printToString(SmartPhone s) {
			// 매개 변수가 부모 타입(업캐스팅 적용)
		
			System.out.println("[전달 받은 객체의 toString() 출력]");
			
			// 실제 참조하는 객체가 자식 객체면
			// 자식 객체의 오버라이딩된 toString() 호출 (동적 바인딩)
			System.out.println(s.toString());
			
	}
	
	// printToString() 오버로딩
//	public void printToString(Iphone i) {
//		System.out.println("[전달 받은 객체의 toString() 출력]");
//		System.out.println(i.toString());
//	}
	
	// printToString() 오버로딩
//	public void printToString(Galaxy g) {
//		System.out.println("[전달 받은 객체의 toString() 출력]");
//		System.out.println(g.toString());
//	}
	
	
	
	/**
	 * 다형성 확인 7 -> 반환형에 다형성(업캐스팅) 적용 
	 */
	public void method7() {
		
		printToString(createPhone(1)); // new SmartPhone()으로 생성된 객체 주소
		printToString(createPhone(2)); // new Iphone()으로 생성된 객체 주소
		printToString(createPhone(3)); // new Galaxy()으로 생성된 객체 주소
		
	}
	
	// 매개 변수 값에 따라 phone 객체 생성 후 반환
	// 1. SmartPhone / 2 : Iphone  / 3 : Galaxy
	public SmartPhone createPhone(int num) {
		
			if(num == 1) {
					return new SmartPhone();
			}
			
			if(num == 2) {
					return new Iphone(); // 오류 x -> 반환형에 업캐스팅 적용
			}
			
			return new Galaxy(); // 오류 x -> 반환형에 업캐스팅 적용
			
	}
	
	
	/**
	 * instanceof 연산자
	 * 
	 * - 참조변수 instanceof 클래스명
	 * 
	 * -> "참조 변수" 참조하는 객체(instance)가
	 * 		지정된 "클래스"로 만들어진 객체가 맞아?
	 * 
	 * 		맞으면 true, 아니면 false 반환
	 * 
	 * + 상속 검사 용도로 사용 
	 * 
	 */
	public void method8() {
		
		// instanceof 연산자 연습
		SmartPhone s1 = new SmartPhone();
		
		
		System.out.print("s1 instanceof SmartPhone : ");
		System.out.println(s1 instanceof SmartPhone); // true
		
		System.out.println("s1 instanceof PolyService : error ");
		// System.out.println(s1 instanceof PolyService);
		// -> 상속 관계가 아니라서 instanceof 검사 자체를 진행 못함
		
		System.out.print("s1 instanceof Iphone : ");
		System.out.println(s1 instanceof Iphone); // false
		// -> SmartPhone 과 Iphone은 상속 관계가 맞으나
		// s1이 참조하는 객체가 Iphone 클래스로 만들어진 객체인지
		// 물어보는 것이기 때문에 결과로 false가 반환
		
		
		System.out.println("-------------------------------------------");
		
		SmartPhone s2 = new Iphone();
		
		System.out.print("s2 instanceof SmartPhone : ");
		System.out.println(s2 instanceof SmartPhone); // true
		
		System.out.print("s2 instanceof Iphone : ");
		System.out.println(s2 instanceof Iphone); // true		
							
		
	}
	
	
	/**
	 * 객체 배열 + 업 캐스팅 + 다운 캐스팅 + instanceof
	 */
	public void method9() {
		
		// 부모 타입 객체 배열 생성
		// -> SmartPhone 참조 변수 3칸짜리 배열 생성
		SmartPhone[] arr = new SmartPhone[3];
		
		
		// 부모 타입 객체 배열 = 요소 별로 부모/자식 객체 초기화
		//																			(업캐스팅)
		// + 메서드 반환형에 다형성(업캐스팅) 적용
		
		for(int i=0 ; i<arr.length ; i++) { // 순차 접근
			arr[i] = createPhone(i + 1);
			
			// arr[0] = createPhone(1) == new SmartPhone();
			// arr[1] = createPhone(2) == new Iphone();
			// arr[2] = createPhone(3) == new Galaxy();
			
		}
		
		
		// 향상된 for문 + instanceof + 다운 캐스팅 
		for(SmartPhone s : arr)	{
			
				// s가 참조하고 있는 객체가 Iphone 객체가 맞아 ?
				if(s instanceof Iphone) {				
					((Iphone)s).setIosVesion(999);	
				}
				
				// s가 참조하고 있는 객체가 Galaxy 객체가 맞아 ?
				else if (s instanceof Galaxy) {
					((Galaxy)s).setAndroidVersion(333);
					
				}
				
				else { // Iphone도 Galaxy도 아닌 경우 == SmartPhone
					s.setDispaly("부모 화면");
				}
			
		}
		
		// 향상된 for문 + 매개 변수 다형성(업캐스팅) + 동적 바인딩
		for(SmartPhone s: arr) {
			printToString(s);
		}
		
		
		
		
	}
	
	
	
	
	
	
	
}