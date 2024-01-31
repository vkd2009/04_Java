package edu.kh.loop.ex;

import java.util.Scanner;

/**
 * 중첩 반복문 
 */

public class LoopEx2 {
	
	Scanner sc = new Scanner(System.in);
	
	/** <pre>
	 * 다음 모양 출력하기
	 * 
	 * 1234
	 * 1234
	 * 1234
	 * 1234
	 * </pre>
	 */
	public void method1() {
		for(int j=1 ; j<=3 ; j++) { // 3번 반복
			for(int i=1 ; i<=4 ; i++) { // 1234 출력
				System.out.print(i);
			}
			System.out.println(); // 줄 바꿈
		}
	}
	
	
	/** <pre>
	 * 다음 모양 출력하기
	 * 
	 * 4321
	 * 4321
	 */
	public void method2() {
		
		for(int i=1 ; i<=2 ; i++) {
			for(int j=4 ; j>=1 ; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	
	/**
	 * <pre>
	 * 다음 모양 출력 하기
	 * 
	 * (0,0) (0,1) (0,2)
	 * (1,0) (1,1) (1,2)
	 * (2,0) (2,1) (2,2)
	 */
	public void method3() {
		
		for(int x=0 ; x<3 ; x++) { // (행)세로 0,1,2
		
			for( int i=0; i<3 ; i++ ) { // (열)가로 0,1,2
				System.out.printf("(%d,%d) ",x , i);
			}
			System.out.println();
		}
	}
	
	/**<pre>
	 * 다음 모양 출력 하기
	 * 
	 * (2,2) (2,1) (2,0)
	 * (1,2) (1,1) (1,0)
	 * (0,2) (0,1) (0,0)
	 * </pre>
	 */	
	public void method4() {
		
		for(int x=2 ; x>=0 ; x--) { // (행)세로 0,1,2
			
			for( int i=2; i>=0 ; i-- ) { // (열)가로 0,1,2
				System.out.printf("(%d,%d) ",x , i);
			}
			System.out.println();
		}
	}
	
	
	
	public void method5() {
		for(int y=2 ; y<=9 ; y++) {
			for(int x=1 ; x<=9 ; x++)
				System.out.printf("%dx%d= %d ", y, x , y*x);
		  	System.out.println();
	 }
		
	}						
	
	
	/** <pre>
	 * 입력 받은 단 부터 9단까지 구구단 출력하기
	 * 
	 * 단, 입력 값이 2~9 사이가 아니면 "잘못 입력" 출력
	 * 
	 * ex)
	 * 단 입력 (2~9사이) : 7
	 * 
	 * ==== 7단 ====
	 * 7 x 1 = 7 
	 * 7 x 2 = 14
	 * ...
	 * 7 x 9 = 63
	 * 
	 * ==== 8단 ====
	 * ...
	 * 
	 * 
	 * ==== 9단 ====
	 * ...
	 * </pre>
	 */
	public void method6() {
		
		System.out.print("단 입력(2~9) : ");
		int dan = sc.nextInt();
		
		// 입력 받은 단이 2 ~ 9 사이가 아닐 경우
		if(dan < 2 || dan > 9) {
			System.out.println("잘못입력");
			return;
		}
		
		for(int x=dan ; x<=9 ; x++) { // 행(==단, 2~9)
			
			System.out.printf("===== %d단 ===== \n", x);
			
			for(int num=1 ; num<=9 ; num++) { // 열(== 곱해지는 수, 1~9)
				System.out.printf("%d x %d = %2d  \n", x, num, x * num);
			}
			
			System.out.println();
			
			
		}
		
	}
	
	
	/**<pre>
	 * 1 2 3
	 * 4 5 6
	 * 7 8 9
	 * 
	 * </pre>
	 * 
	 */
	public void method7() {
		
		int count = 1;
		
		for(int row = 1 ; row <= 3 ; row++) { // 3행 반복
			
			for(int col = 0 ; col <3 ; col++) { // 3열 반복
				System.out.print(count++ + " ");
				
			}
			System.out.println(); // 줄바꿈
			
		}
	}
	
	
	/** <pre>
	 *   ####
	 *   ####
	 *   ####
	 *   ####
	 *   </pre>
	 */
	public void method8() {
		for(int row = 1; row <= 4; row++) {
			
			for(int col = 1; col<= 4; col ++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
	}
	
	
	/** <pre>
	 * 
	 *     *
	 *     **
	 *     ***
	 *     ****
	 *     
	 *  </pre>   
	 * 
	 */
	public void method9() {
		for(int i = 1; i<=4 ; i++) {
			
			for(int j = 1; j<=i ; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}			
	}
	

	/**   <pre>
	 * 		****
	 * 		***
	 * 		**
	 * 		*
	 * 		</pre>
	 */
	public void method10() {
		for(int i = 4; i>=1 ; i--) {
			
			for(int j = 1; j<=i ; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}			
	}
	
	
	
	
}
