package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/* 10회만 반복하며 List에 과일 이름을 추가하고, 
 * 반복이 종료되면 List에 저장된 모든 과일을 출력하는 코드를 작성하였으나 오류 발생 및 정상 수행되지 않았다.
 * 요구사항과 소스 코드를 분석하여 원인(문제점 + 발생 원인), 조치 내용(해결 방법)을 작성하시오.
 *
 * 요구 사항
 * 1. 같은 이름의 과일이 List에 존재하지 않을 때만 추가
 * 2. 같은 이름의 과일이 존재하면 "OOO - 삭제" List에서 제거
 * 3. 10회가 반복되지 않았어도 "END" 입력 시 "입력 종료"가 출력 되면서 반복 종료
 * 
 */
public class Supplement1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> fruitsList = new ArrayList<String>();
		// for 문이 10바뀌 돌수 있게 바꾸어준다 i의 값을 바꾸어도되는데 그럼 출력할떄 0번쨰가 바뀜으로 i<=10으로 교정해준다
		for(int i=1 ; i<=10 ; i++) {
				
			
			System.out.print(i+"번째 과일 입력 : ");
			String input = sc.next();
			
			// 문자열 입력은.equals()를 사용해야한다
			if(input.equals("END")) {
				System.out.println("입력 종료");  // 추가 되기 전에 종료를 할 수 있게 해준다. 
				break;
			}
			
			// 29번쨰 줄이 오류가 난다 fruitsList의 값이 비어있다 || 
			if(!fruitsList.contains(input)) { // contains :  포함하다.
				fruitsList.add(input);      // 30번쨰와 31번쨰 줄이 바뀌여야한다 contunue 가 있으면 아래 31번쨰 줄이 실행될수 없다. 
				continue;    
			}
		
			
			int index = fruitsList.indexOf(input); // indexOf : 인덱스값 반환
			fruitsList.remove(index);
			System.out.println(input + " - 삭제");
		}
		
		// list는 길이의 비교가 length가 아닌 size()로 해야한다. fruitsList는 컬렉션이다.
		System.out.println("-----------------------");
		for(int i=0 ; i<fruitsList.size() ; i++) {
			System.out.println(fruitsList.get(i));
		}
		
	}
}
