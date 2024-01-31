package edu.kh.loop.ex;

import java.util.Scanner;

public class LoopEx3 {

	// 필드
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 문자열 한 글자씩 출력하기
	 */
	public void method1() {
		
		// 문자열.charAt(인덱스) : 인덱스번째 문자 하나를 얻어와 반환
		
		// 문자열.legnth() : 문자열의 길이(메서드)
		
		String str = "Hello Wrold!!!";
		
	  //int length = str.length(); // 미리 문자열의 길이를 카운트하여 저장
		                     // -> str.length() 구문을 재 호출할 필요가 없어짐
		
		// 초기식은 여러 개 선언 가능
		for(int i=0 , length = str.length() ; i< length ; i++) {			
	  	System.out.println(str.charAt(i));
		}		
	}
	
	// while(조건식) : 끝이 확실하지 않은 반복에 사용
	
	/**
	 * -1이 입력될 때 까지 정수를 꼐속 입력 받아
	 * 입력 받은 수의 합계를 구하기
	 */
	public void method2() {
		
		int sum = 0; // 합계
		
		int input = 0; // 입력 값을 저장할 변수
		
		while(input != -1) { // 입력 값이 -1이 아니면 반복
			                   // -> -1이면 멈춤
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			if(input != -1) sum += input; // -1 입력한 경우 제외
			
		}
		
		System.out.println("합계 : " + sum);
		
	}
	
	// do ~ while 문 
	// - 조건식이 뒤에 작성된 while문
	// - 최소 1회 이상의 반복을 보장

	/**
	 * 0이 입력될 때 까지 정수를 계속 입력 받고
	 * 0 입력 시 누적된 합계 출력 
	 */
	public void method3() {
		
		int sum = 0;   // 합계 누적용 변수
		int input = 0; // 입력한 값 저장용 변수
		
		 do{ // 입력한 값이 0이 아닐 때 반복
			
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			sum += input;
		}while(input != 0);
		
		System.out.println("합계 : " + sum);
	}
	
	
	/**
	 * 0이 입력될 때 까지 정수를 계속 입력 받고
	 * 0 입력 시 누적된 합계 출력 
	 */
	public void method4() {
		
		int sum = 0;
		int input = 0;
		
		while(true) { // 무한 반복
			
			System.out.println("정수 입력 : ");
			input = sc.nextInt();
			
			if(input == 0) break; // 반복 종료하는 분기문(break)  
			
			sum += input;
		}
		
		// Unreachable code : 도달할 수 없는 코드
		// == dead code(죽은 코드)		
		System.out.println("합계 : " + sum);
		
	}
	
	
	
	
}
