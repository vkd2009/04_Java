package edu.kh.exception.pack1.model.service;

import java.util.Scanner;

public class ExceptionHandlingService1 {

	private Scanner sc = new Scanner(System.in);
	
	
	
	/* Exception(예외) : 코드로 처리 가능한 에러
	 * 
	 * Exception Handling(예외 처리)  : Exception 발생 시 처리하는 구문
	 */
	
	/**
	 * 예외를 발생시키는 코드 
	 */
	public void method1() {
		int[] arr = {10,20,30,40}; // 마지막 인덱스 ==3
		
		for(int i=0 ; i <= arr.length; i++)	{ // i == 0 ~ 4
			System.out.println(arr[i]);
		}
		// 10
		// 20
		// 30
		// 40 
		// 예외 발생(배열 인덱스 범위 초과)
		
		// java.lang.ArrayIndexOutOfBoundsException: 
		// Index 4 out of bounds for length 4
		
		
		/* 예외 발생 원리*/
		// 실행 중 예외 상황이 발생하는 경우
		// 예외 상황에 맞는 코드가 수행되며
		// 지정된 예외 클래스를 찾아 객체로 만들어서 던짐	!!!
    // new ArrayIndexOutOfBoundsException();
	}
	
	
	
	
	/**
	 * 예외 발생 구문을 try-catch로 처리 (예외 처리)
	 * 
	 * - try{} : 예외가 발생할 것 같은(가능성이 있는) 코드를
	 * 					 시도하는 구문
	 * 
	 *  - catch(예외){} :
	 *  	try 구문 시도 중 예외가 발생되어 던져진 경우
	 *    catch(예외)에 작성된 예외와 던져진 예외가 같으면
	 *    잡아서 {} 내 구문을 수행
	 *     -> 발생된 예외를 잡아서 처리했기 때문에
	 *     		프로그램이 멈추지 않고 정상 수행
	 */
	public void method2() {
		int[] arr = {10,20,30,40}; // 마지막 인덱스 ==3
		
		try { // 예외 발생할 것 같은 구문 시도
			
			for(int i=0 ; i <= arr.length; i++)	{ // i == 0 ~ 4
				System.out.println(arr[i]);
			}
			
		} catch(ArrayIndexOutOfBoundsException e) {
			// try에서 던져진
			// ArrayIndexOutOfBoundsException 객체를 잡아서 처리
			
			System.out.println("[예외 잡아서 처리함]");
		}
		
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
	}
	
	
	/**
	 * 예외 처리 구문 활용 예시 1
	 * 
	 * - 보통 정상 수행 되는데 가끔 예외 발생
	 *  + if문으로 처리하지 못하거나 애매할 때
	 */
	public void method3() {
		
		System.out.println("[두 수를 입력 받아 나눈 몫 구하기]");
		
		System.out.print("정수 입력 1 : ");
		int input1 = sc.nextInt();
		System.out.print("정수 입력 2 : ");
		int input2 = sc.nextInt();
		
		// 0으로 나누는 경우
		// java.lang.ArithmeticException: / by zero
		// -> 산술적 예외 : 0으로 나눌 수 없음
		
		try {
			System.out.println("결과 : " + input1/input2);
		} catch(ArithmeticException e) {
			// try에서 던져지는 ArithmeticException 객체를
			// 매개 변수를 이용해서 잡음
			
			if(input1 >= 0) System.out.println(Double.POSITIVE_INFINITY); //  INFINITY
			else            System.out.println(Double.NEGATIVE_INFINITY); // -INFINITY
		}
	}
	
	
	/**
	 * catch 구문 여러 개 작성하기 1 
	 */
	public void method4() {
		System.out.println("[두 수를 입력 받아 나눈 몫 구하기]");
		
		System.out.print("정수 입력 1 : ");
		int input1 = sc.nextInt();
		System.out.print("정수 입력 2 : ");
		int input2 = sc.nextInt();
		
		try {
			System.out.println("결과 : " + input1/input2);
		} catch(ArithmeticException e) {
			
			if(input1 >= 0) System.out.println(Double.POSITIVE_INFINITY); //  INFINITY
			else            System.out.println(Double.NEGATIVE_INFINITY); // -INFINITY
		}
	}
	
	
	
}
