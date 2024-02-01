package edu.kh.array.practice; 

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);
	
	
	
	
	public void practice1() {
		
		int sum = 0;
		
		int[] arr = new int [9];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = i+1;		
			System.out.print(arr[i]);			
		}
		System.out.println();
		for (int i = 0; i< arr.length; i += 2) {
			sum += arr[i];
		}
		System.out.print("짝수 번째 인덱스 합 : " + sum);
	}
	
	
	
	
	public void practice2() {
		int[] arr = new int [9];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 9 - i;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i =1; i<arr.length; i += 2) {
			sum += arr[i];
		}
		System.out.println("홀수 번째 인덱스 합 : " + sum);
	}
	
	
	
	
	public void practice3() {
		System.out.print("양의 정수 : ");
		int i = sc.nextInt();
		
		for(int j=0 ; j < i; j++) {
			System.out.print((j+1) + " ");
		}
		
	}

// 실습 3번 다른 방식 과 추가 설명
	
//public void practice3() {
//		
//		System.out.print("양의 정수 : ");
//		int len = sc.nextInt();
//		
//		 1)      3)  2)
//		int[] arr  =   new int[len];
//		
//		 1) Stack 영역에 int[]을 참조하기 위한 참조형 변수 arr 선언
//		
//		 2) Heap 영역에 입력받은 len 만큼의 길이를 가지는 int[] 생성
//		    -> 주소가 할당됨
//		
//		 3) 생성된 배열의 주소를 arr 변수에 대입해서 
//		    참조할 수 있는 형태로 만듦
//		
//		 len == arr.length
//		for(int i=0 ; i<arr.length ; i++) {
//			arr[i] = i + 1;
//			System.out.print(arr[i] + " ");
//		}

	
	
	

	
	
	
	public void practice4() {
		int[] arr = new int [5];
		
		for(int i=0; i< arr.length; i++) {
			System.out.printf("입력 %d : " , i);
			arr[i]= sc.nextInt();
		}

		System.out.print("검색할 값 : ");
		int sum =sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == sum) {
				System.out.print(" 인덱스 : " + i);
			  return;
				
			}
		}
		// 검색할 값이 배열 내에 존재하지 않는다
		// == for 문 수행 중 return 구문이 수행되지 않음
		// -> for문 다음 코드가 수행됨
		System.out.println("일치하는 값이 존재하지 않습니다");
	}
	
	
	
	public void practice5() {
		System.out.print("정수 : ");
	  int len = sc.nextInt();
		
		int[] arr = new int[len];
		
		for(int i=0 ; i<arr.length; i++) { //배열 요소 순차 접근
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : " , i);
			arr[i] = sc.nextInt()	;
		}
		
		int sum = 0; // 합계 누적용 변수
		
		// 배열 요소 하나씩 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i]; // sum = sum + arr[i];
		}
		
		System.out.print("\n총 합 : " + sum);
		
	}
	
	
	public void practice6() {	
		
		// 주민등록 번호를 저장할 char 배열 생성
		char[] arr = new char[14];
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
		// 문자열.length() : 문자열의 길이를 반환하는 메서드		
		// 배열.length : 배열길이 반환하는 필드 
		// int len  = input.length();
		
		for(int i=0 , len = input.length(); i < len ; i++) {
			
			// 성별 부분 전 까지는 그대로 배열에 대입
			if(i <= 7)  arr[i] = input.charAt(i);
			
			// 성별 부분 이후에는 모두 * 대입
			else				arr[i] = '*' ;
			
			// 안에 이렇게 작성해도 상관없다
			// System.out.print(arr[i]);
		}
	   
		// 배열에 담긴 내용 모두 출력
		for(int i= 0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
	
	
	
	public void practice7() {
		
		//while문으로 조건에 맞는 수가 입력 될 때 까지 반복
		// + break
		
		// 배열 요소에 대입되는 숫자는 count 값을 ++, --를 이용해 제어
		
		int len = 0;
		
		while(true) { // 무한 루프
									// 3 이상의 홀수가 입력될 때 까지 무한 반복
			
			System.out.print("정수 : ");
			len = sc.nextInt();
			
			if(len >= 3 && len % 2 == 1) {
				break;
			}
			
			// if문 수행 X == 3 이상이 아니거나 짝수인 경우
			System.out.println("다시 입력하세요.");
		}
		
		// 입력 받은 정수 크기 만큼의 배열 선언, 할당
		int[] arr = new int[len];
		
		
		int count = 0; // arr 배열 요소에 대입될 수
		
		for(int i=0; i<len ; i++) {
			
			// 배열 길이 절반 이하인 경우 증가, 이후인 경우 감소
			if(i <= len / 2) count++;
			else             count--;
			
			arr[i] = count; // count 값 배열 요소에 대입
		}
		
		// Arrays.toString(배열명)
		// - 배열 내 요소를 [1,2,3] 형식의 문자열로 만들어 반환
		System.out.println(Arrays.toString(arr));
	}
	
	
	public void practice8() {
		int [] randoms = new int[10];
		
		String str = ""; // 빈 문자열
		
		for(int i=0 ; i < randoms.length; i++) {	
			randoms[i] = (int)(Math.random() * 10 + 1);
			str += randoms[i] + " ";
		}
		System.out.print("발생한 난수 : " + str);
	}
	
	
	
	public void practice9() {
		int [] randoms = new int[10];
		
		String str = ""; // 빈 문자열
		
		int max = 0; // 최대값 저장용 변수
		int min = 0; // 최소값 저장용 변수
		
		for(int i=0 ; i < randoms.length; i++) {	
			// Math.random 의 범위는 0.0 ~ 0.9 이다 
			// 그래서 1을 뽑기위해 * 10 + 1 을 넣어 1 ~ 11 까지의 값을 뽑아낸다.
			randoms[i] = (int)(Math.random() * 10 + 1);
			str += randoms[i] + " ";
			
			if(i == 0) { // 첫 반복인 경우 -> 첫 번째 난수를 비교 기준으로 삼음
				max = randoms[i];
				min = randoms[i];
				continue; // 다음 반복으로 이동
			}
			
			// 첫 반복이 아닌 경우
			if(randoms[i] > max) max = randoms[i];
			if(randoms[i] < min) min = randoms[i];
			
			
		}
		System.out.println("발생한 난수 : " + str);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	
	
	
public void practice10() {
		
		int[] randoms = new int[10];
		
		String str = ""; // 빈 문자열
		
		// 난수 생성용 for문 + 중복 제거
		for(int i=0 ; i<randoms.length ; i++) {
			
			randoms[i] = (int)(Math.random() * 10 + 1);
			
			// * 중복 검사 방법 *
			// 현재 인덱스에 대입된 난수와 같은ㅇ 값이
			// 앞쪽 인덱스에 존재하면 
			// 다시 현재 인덱스에 새로운 난수를 생성해서 대입
			// (중복이 없을 때 까지 반복)
			
			// 현재 인덱스 앞쪽 까지만 순차 접근하는 for문 작성
			for(int x = 0 ; x < i ; x++) {
				
				// 현재 인덱스에 저장된 값과(지금 발생한 난수와)
				// 앞쪽 인덱스에 저장된 값이(이전에 발생한 난수가)
				// 같을 경우 "중복"으로 판단!
				if(randoms[i] == randoms[x]) {
					i--; // 바깥쪽 for문의 i 값 증가를 막아서
							 // 현재 인덱스 번째 요소에 다시 새로운 난수를 대입하게함
					
					break; // 중복을 발견 했으니 추가적인 검사가 필요 없음
				}
			}
		}
		
		
		// 출력 구문 만들기용 for문
		for(int i=0 ; i<randoms.length ; i++) {
			str += randoms[i] + " ";
		}
		
		System.out.println("발생한 난수 : " + str);
		
	}
	
	
	
	
	public void practice11() {
		
		// 1. 크기가 6인 정수형 배열 생성
		int[] lotto = new int[6];
		
		// 2. 1 ~ 45 사이 중복 없는 난수로 lotto 배열 요소 초기화
		for(int i=0; i<lotto.length ; i++) {
			
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int x=0 ; x < i; x++) {
				if(lotto[i] == lotto[x]) {
					i--;
					break;
				}
			}
		}
		
		// 3. 오름차순 정렬
		for(int i=0;  i < lotto.length-1 ; i++) { // 칸 지정(비교 주체)
			
			for(int x=i+1; x < lotto.length ; x++) { // 비교대상
				
				// 주체 > 대상 -> 오름 차순
				// 주체 < 대상 -> 내림 차순
				
				if(lotto[i] > lotto[x]) { // 주체가 대상보다 크면 교체(swap)				
				  int temp = lotto[i];
				  lotto[i] = lotto[x];				  
				  lotto[x] = temp;
					
				}
				
			}
			
		}
		
		Arrays.sort(lotto); // 자바에서 만들어서 제공해주는
												// 배열 오름차순 정렬
		
		// 결과 출력
		System.out.println(Arrays.toString(lotto));
	}
	
	
}
