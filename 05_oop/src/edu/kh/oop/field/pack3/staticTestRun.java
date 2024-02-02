package edu.kh.oop.field.pack3;

public class staticTestRun {
	public static void main(String[] args) {
		
		// Korean 객체 생성
		Korean k1 = new Korean();
		Korean k2 = new Korean();
		
		System.out.println("k1의 nationalCode : " + k1.nationalCode);
		System.out.println("k2의 nationalCode : " + k2.nationalCode);
		
		
		// k1을 이용해서 nationalCode 변경
		k1.nationalCode = 1;
		
		System.out.println("---------- nationCode 변경 후 -------");
		System.out.println("k1의 nationalCode : " + k1.nationalCode);
		System.out.println("k2의 nationalCode : " + k2.nationalCode);
		
		
		// 왜 nationalCode에 경고(노란줄)가 발생하는가??
		
		// The static field Korean.nationalCode 
		// should be accessed in a static way
		// -> static 필드는 static 방법으로 접근해야한다!
		// == k1.nationalCode 처럼 객체의 필드명/메서드명으로 
		// 		부르지 말고
		//    static 영역에 할당된 이름으로 불러라
		
		// (객체의 독립된 필드로 인식될 수 잇기 때문에
		//  헷갈리지 않게 정해져 있는 이름으로만 부르자!)
		
		System.out.println("Korean.nationalCode : " + Korean.nationalCode);
		
		
		System.out.println("우리의 조상님 : "+ Korean.ANESTOR);
		
		// static final 대표적 예시 :
		// - Math.PI
		// - Interger.MAX.VALUE  / Integer.NIM_VALUE
		
		System.out.println(Math.PI);
		System.out.println(Integer.MAX_VALUE); // int 최대값
		System.out.println(Integer.MIN_VALUE); // int 최소값
		
	}
}
