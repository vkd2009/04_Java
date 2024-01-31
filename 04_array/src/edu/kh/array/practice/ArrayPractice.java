package edu.kh.array.practice; 

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
	
	public void parctice3() {
		System.out.print("양의 정수 : ");
		int i = sc.nextInt();
		
		for(int j=0 ; j < i; j++) {
			System.out.print((j+1) + " ");
		}
		
	}
	
	public void parctice4() {
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
			  
				System.out.println("일치하는 값이 존재하지 않습니다");
			}
		}
	}
	
	
}
