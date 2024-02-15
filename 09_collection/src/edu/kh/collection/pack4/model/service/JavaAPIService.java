package edu.kh.collection.pack4.model.service;

import java.util.ArrayList;
import java.util.List;

public class JavaAPIService {

	/* Wrapper Class
	 * 
	 * - wrap : 감싸다, 포장하다
	 * 
	 * - 기본 자료형을 객체로 감싸는 클래스
	 * 	 -> 기본 자로형의 객제화 
	 * 
	 * 	 -> 왜? 컬렉션 처럼 객체(속성, 기능)로 취급하는 상황에서
	 * 			기본 자료형도 취급 가능한 형태로 바꾸기 위해서
	 * 
	 * 
	 * 						 --> Boxing
	 * 	Unboxing	<--	
	 * 
	 * 	boolean		<--> Boolean
	 * 	byte			<-->	Byte
	 *  short			<--> Short
	 *  int				<--> Integer
	 *  long			<--> Long
	 *  float			<--> Float
	 *  double		<--> Double
	 *  char			<--> Character 
	 *  
	 * * Boxing, Unboxing을 자동으로 수행되도록 구현되어 있다
	 *  -> Auto Boxing, Auto Unboxing
	 *  
	 *  +	Wrapper Class를 이용해 객체화 되었을 때
	 *  추가적인 필드, 기능을 제공함
	 */
	
	/**
	 * Auto Boxing, Auto Unboxing 확인
	 */
	public void method1() {
		int num1 = 100; // int
		
		// 삭제 예정인 방법(쓰지마 ㅠㅠ)
		// Integer wrap1 = new Integer(num1); 
		
		Integer wrap1 = num1; // 컴파일러가 Auto Boxing 수행 코드 추가
													// (int) num1 -> (Integer) num1
		
		int num2 = wrap1.intValue(); // 정수 값 반환(추천 x)
		
		int num3 = wrap1; // 컴파일러가 Auto UnBoxing 수행 코드 추가
										// (Integer) wrap1 -> (int) wrap1에 저장된 값
		
		long num4 = 10_000_000_000L; // 100억
		Long wrap2 = num4; // Auto Boxing
		long num5 = wrap2; // Auto Unboxing
		
		// Integer 객체만 저장하는 List
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1000); // (int) 1000 -> (Integer) 1000 / Auto Boxing
		list.add(2000);
		list.add(3000);
		
		// print 구문 내에서
		// Wrapper 클래스로 마든 객체를 참조할 때
		// .toStirng() 호출하는 것이 아닌
		// Auto Unboxing을 진행해서 기본 자료형으로 변경한다!
		System.out.println(list.get(0) + list.get(1) + list.get(2));
	}	
	
	
	
	/** 
	 * Wrapper Class가 제공하는 필드, 메서드
	 * -> 대부분이 static!!!
	 * 	 -> 클래스명.필드명 / 클래스명.메서드명() 사용
	 */
	public void method2() {
		
			// 정수형, 실수형 공통으로 사용 가능
			System.out.println("byte의 용량 : " + Byte.BYTES + "바이트");
			System.out.println("byte의 용량 : " + Byte.SIZE  + "비트");
			System.out.println("byte의 최대값 : " + Byte.MAX_VALUE);
			System.out.println("byte의 최소값 : " + Byte.MIN_VALUE);
			
			// 실수형만 사용 가능 
			System.out.println(Double.NaN);
			System.out.println(Double.NEGATIVE_INFINITY);
			System.out.println(Double.POSITIVE_INFINITY);
			
			// Boolean(논리형)은 true/false 밖에 없음
			System.out.println(Boolean.FALSE);
			System.out.println(Boolean.TRUE);
			
			// -----------------------------------------------------------
			
			// String -> 기본 자료형 변환
			System.out.println("-------------------------------------------");

			
			// HTML 연결 시(요청 데이터 처리) 많이 사용
			// ->  HTML에 관련된 모든 값은 String
			// 단, char(Character)는 별도로 존재하지 않음
			
			byte b = Byte.parseByte("1");
			short s = Short.parseShort("2");
			int i = Integer.parseInt("3"); // 중요
			long l = Long.parseLong("4"); // 중요
			float f = Float.parseFloat("0.1");
			double d = Double.parseDouble("0.2"); // 중요
			boolean bool = Boolean.parseBoolean("true");

			System.out.println("변환 확인");
			
			
			System.out.println("------------------------------------");
			System.out.println("[기본 자료형 -> String 변환]");
			
			// Wraooer Class를 이용하는 방법
			// -> 코드는 길지만 효율이 좋음
			int test1 = 400;
			String change1 = Integer.valueOf(test1).toString();
			
			double test2 = 4.321;
			String change2 = Double.valueOf(test2).toString();
			
			// String 이어쓰기를 이용한 방법
			// -> 코드는 짧으나 효율이 좋지 않음(속도 down, 메모리 소모 up)
			long test3 = 12345678910L;
			String change3 = test3 + ""; // long + String 
			                             // -> String + String
					
	}
	
	
	
	/**
	 * String의 불변성(변하지 않는 성질 == 상수) 
	 */
	public void method3() {
		
		// System.identityHashCode(str)
		// -> 주소값을 이용해서 만든 해시코드(식별 번호)
		// -> 같은 객체에 저장된 값이 변했다면 주소는 일정해야 된다!
		//  -> identityHashCode도 일정 해야된다!! 
		
		String str = "hello";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
		str = "world";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
		str += "!!!";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
		// -> identityHashCode가 다 다른값
		// --> str이 참조하고 있는 객체가 변하고 있다! 
		
	}
	
	
	/**
	 * StringBuilder / StringBuffer 클래스
	 * - String의 불변성 문제를 해결한 클래스
	 *  -> 가변성(mutable)
	 * 
	 * - 기본 16글자 저장할 크기로 생성
	 *   저장되는 문자열의 길이에 따라 크기가 증가/감소
	 *   -> 마음대로 문자열 수정, 삭제 가능!
	 *   -> 수정, 삭제를 해도 추가적인 객체 생성이 없어 효율이 좋음!
	 *   
	 *  
	 * - StringBuilder : Thread Safe 미제공 (비동기, 추천)
	 * - StringBuffer  : Thread Safe  제공 (동기)
	 */
	public void method6() {
		
		// StringBuilder 객체 생성
		StringBuilder sb = new StringBuilder();
		
		
		// StringBuilder 媛앹껜�뿉 臾몄옄�뿴�쓣 �뙎�븘 �굹媛��뒗 諛⑹떇�쑝濡� �궗�슜
		// -> �뮘�뿉 異붽�(append), �븵�뿉 異붽�
		sb.append("�삤�뒛 �젏�떖�� "); // "�삤�뒛 �젏�떖�� "
		System.out.println(System.identityHashCode(sb));
		
		sb.append("臾댁뾿�쓣 癒뱀쓣源뚯슂?"); // "�삤�뒛 �젏�떖�� 臾댁뾿�쓣 癒뱀쓣源뚯슂?"
		System.out.println(System.identityHashCode(sb));
		
		sb.insert(0, "2�썡 14�씪 "); // 0踰� �씤�뜳�뒪�뿉 �궫�엯 == �젣�씪 �븵�뿉 異붽�
		System.out.println(System.identityHashCode(sb));
		
		// identityHashCode 媛믪씠 �씪�젙�븿 
		// == 李몄“�븯�뒗 媛앹껜媛� 蹂��븯吏� �븡�쓬
		// == 媛앹껜 �궡�뿉 媛믩쭔 �닔�젙�릺怨� �엳�떎 == 媛�蹂��꽦 
		
		System.out.println(sb);
		
		// StringBuilder -> String 蹂��솚
		String temp = sb.toString(); // 媛앹껜�뿉 ���옣�맂 �븘�뱶瑜� 臾몄옄�뿴濡� 諛섑솚
		
		
		// String[] 臾몄옄�뿴.split("援щ텇�옄")
		// - 臾몄옄�뿴�쓣 "援щ텇�옄"瑜� 湲곗��쑝濡� 履쇨컻�뼱 String[]濡� 諛섑솚
		String[] arr = temp.split(" ");
		
		for(String str : arr) {
			System.out.println(str);
		}
	}
	
	
}
