package edu.kh.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
		// [보충 수업 문제]
		
		// 과일 바구니 만들기
		// 과일이르을 5개 담을 수 있는 배열을 생성하고
		// 과일 이름이 5개가 배열에 저장될 때 까지 반복 입력
		// 단, 중복되는 과일이 존재하는 경우 추가 x
		
		// 배열의 시작 인덱스 == 0
		// 끝 인덱스 == 4(배열길이 -1)
		
		String[] fruits = new String[5]; // 5칸 짜리 과일이름 저장 배열 생성
		Scanner sc = new Scanner(System.in);
		
		int index = 0; // 과일 이름이 대입 될 인덱스를 지정하는 변수 
		
		
		while(true) { // 무한반복
			System.out.print("과일 이름 입력 >>> ");
			String name = sc.next(); // 문자열 입력 받아 name에 저장
			
			// ***********************************************************
			// [중복 검사]
			
			// flag == true : 같은 과일이 존재하지 않음
			// flag == false : 같은 과일이 존재함
			boolean flag = true;
												
			// 0번 인덱스 부터 index가 가르키는 곳 전까지
			// 입력받은 name을 들고가서 fruits[i] 과 비교
			for(int i = 0; i < index ; i++) {
					
				// 입력 받은 name 과 fruits[i]번째의 값이 같은 경우
				// == 중복되는게 존재한다!
				if(fruits[i].equals(name) ) {					
					flag = false; // 존재한다는 신호로 변경
					break; //추가 검사가 불필요
				}
			
			}
			
			// ***********************************************************
			
			// 중복 검사 결과
			// 중복되는 과일이 없다면 (flag == true)
			if(flag)	{
				 // fruits의 index번 인덱스에 name 저장
			   fruits[index] = name;
				
			   // index 1 증가
			   index++;
			}  
		  //  index가 5가 되었을 때
		  // == 배열의 인덱스를 초과햇을 떄
		  
		  if(index == 5) {
		  	break;
		  }
	
		  
		}
	  //결과출력
	  System.out.println(Arrays.toString(fruits));
		
		
	}
}
