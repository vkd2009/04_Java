package edu.kh.array.practice; 

import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		int sum = 0;
		
		int[] arr = new int [9];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = i+1;		
			System.out.print(arr[i] + " ");			
		}
		System.out.println();
		for (int i = 0; i< arr.length; i += 2) {
			sum += arr[i];
		}
		System.out.print("짝수 번째 인덱스 합 : " + sum);
	}
	
	public void practice2() {
		int[] arr = new int [9];
		
		for(int i = 9; i < 0 ; i--) {
			
			System.out.print(i );
		}
		
	}
	
}
