package edu.kh.variable.ex;

// import : 다른 패키지에 존재하는 클래스 가져오기
import java.util.Scanner;

public class ScannerEx1 {
	public static void main (String[] args) {
		
		/* Scanner 클래스
		 * 
		 * - 사용자로부터 입력을 받기위해 Java에서 제공하는 클래스
		 * 
		 * - java.util 패키지에 존재
		 *   -> import 구문 작성 필요
		 *   
		 * - Scanner.next()  : 단어(String) 1개 입력, 
		 *                     공백 문자 입력 종료
		 * 
		 * - Scanner.nextLine() : 문자열(String) 1개를 입력
		 * 												엔터(개행 문자) 입력 시 종료
		 * 
		 * - Scanner.nextInt() : int정수 1개 입력
		 * - Scanner.nextLong() : long정수 1개 입력
		 * - Scanner.nextDouble() : 실수 1개 입력
		 * 
		 * 
		 */
		
		
		// Scanner 
		
		// 1. 클래스 위에 import 하는 구문 작성
		
		// 2. import한 Scanner 클래스를 이용해서
		// 		Scanner 객체 생성
		
		//  * System.in : (이클립스) 키보드
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수 입력 1 : ");
		int num1 = sc.nextInt(); // 다음 입력된 정수를 얻어와 num1에 대입
		
		System.out.print("정수 입력 2 : ");
		int num2 = sc.nextInt(); // 다음 입력된 정수를 얻어와 num2에 대입
		
	  System.out.print("실수 입력 : ");
	  double num3 = sc.nextDouble();
	  
	  System.out.print("단어 입력(2개) : "); // 사과 바나나(엔터)
	  String word1 = sc.next();
	  String word2 = sc.next();
	  
	  // ************************************************
	  // - next() / nextInt() / nextDouble() 등을 작성한 이 후에
	  
	  // 	 nextLine() 을 작성해야되는 상황이 오면
	  //   nextLine() 구문을 미리 한 번 작성하기
	  
	  sc.nextLine();
	  
	  // Scanner 사용 시
	  // 입력되는 값이 Scanner의 입력 버퍼라는 곳에 저장된 후
	  // nextInt() 면 버퍼에 저장된 값 중 정수만 추출
	  // -> 이 때, 정수와 같이 입력된 엔터가 버퍼에 남아있게됨
	  
	  // 이 후 nextLine() 해석 시
	  // 버퍼에서 다음 엔터까지 읽어오는 작업이 수행되는데
	  // 버퍼에 남아있던 엔터를 읽어오기 때문에 아무것도 입력 못함
	  
	  // [해결 방법]
	  // nextLine()을 한번 호출 해서 남아있던 엔터를 빼버림(제거)
	  
	  // ************************************************
	  
	  
	  System.out.print("문장 입력 : ");
	  String str = sc.nextLine();
	  		
	  System.out.printf("%d, %d, %f, %s, %s, %s \n", num1, num2, num3, word1, word2, str);
	  
	  
		
		
		
		
		
		
	}
}
