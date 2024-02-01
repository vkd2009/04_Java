package edu.kh.oop.basic;

public class AccountRun {
	
	public static void main(String[] args) {
		
		// Account 객체 생성
		Account a1 = new Account(); 
		
		// private이 설정된 값과 안된 값 접근 가능 여부 확인
		
		// private을 적용한 변수(필드)는 외부에서 보이지 않음(정보 은닉)
		// The field Account.balance is not visible
		
//		a1.accountNumber = "1";
//		a1.name = "홍길동";	
//		a1.balance;
//		a1.password;
		
		
		// 간접 접근 기능을 이용해서 값을 세팅
		a1.setName("신형만");
		
		
		// 간접 접근 기능을 이용해서 객체의 속성을 얻어와 출력
		String name1 = a1.getName();
		System.out.println(name1);
		
		
		a1.setaccountNumber("1234-56-7890");
		a1.setPassword("7890");
		
		
		Account a2 = new Account();
		a2.setName("신짱아");
		a2.setaccountNumber("111-222-333");
		a2.setPassword("7777");
		
		// 각 계좌에 입금
		a1.deposit(1000000L); // int
		a1.deposit(2345L);
			
		a2.deposit(50000L);
		a2.deposit(30000L);
		
		System.out.println("--------------------------------------------");
		// 각 계좌에서 출금
		a1.withdraw("1234" , 2000000); // 비밀번호 불일치
		a1.withdraw("7890" , 2000000); // 잔액부족
		a1.withdraw("7890" , 50000);   // 출금 성공
		
		
		a2.withdraw("1234" , 2000000); // 비밀번호 불일치
		a2.withdraw("7777" , 2000000); // 잔액부족
		a2.withdraw("7777" , 50000);   // 출금 성공
		
		
		
		
	}

}
