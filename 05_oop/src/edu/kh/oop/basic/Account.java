package edu.kh.oop.basic;

/**
 * 계좌 클래스
 */
public class Account {
	
	// [캡슐화]
	// - 객체의 속성(필드) 직접 접근을 제한하는 것이 원칙
	
	// - 직접 접근을 제한하기 위해서 모든 필드에 private 키워드 작성
	//   (private : 현재 객체만 접근 가능한, 사적인, 개인적인)
	
	// - 속성에 직접 접근을 할 수 없으므로 
	//   대신 간접 접근을 할 수 있는 기능을 작성해야 함
	
	
	// 속성(값)
	
	private String name;						// 이름(예금주)
	private String accountNumber;		// 계좌 번호
	private long 	 balance;					// 잔액
	private String password;        // 비밀번호
	
	// * 매개 변수 : 전달 받아온 값을 저장하는 변수
	
	// name 변수에 값을 세팅하는 간접 접근 기능
	public void setName(String inputName) {
		
		// 매개 변수 String inputName
		// -> String 타입의 데이터를 전달 받아 저장할 변수
		name = inputName;  
	}
	
	// name 변수의 값을 돌려 보내주는 간접 접근 기능
	
	// void : 반환할 값이 없다
	// <-> 반환할 값이 있을 경우 그 값의 자료형을 작성(반환형)
	public String getName() {
		return name; // Void methods cannot return a value
	}
	
	/* this : 현재 객체 */
	
	// accountNumber 값 세팅하는 간접 접근 기능
	public void setaccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	// accountNumber 값을 반환하는 간접 접근 기능
	public String getAccountNumber() {
		return accountNumber;
	}
	
	
	// password 값 세팅하는 간접 접근 기능
	public void setPassword(String password) {
		this.password = password;
	}
	
	// balnace 값을 반환하는 간접 접근 기능
	public long getbalnace() {
		return balance;
	}
	
	
	/**
	 * 전달 받은 금액을 balance에 누적한 후
	 * 현재 잔액을 콘솔에 출력
	 */
	public void deposit(long amount) {
			balance += amount;
			System.out.println(name + "현재 잔액 : " + balance);
  }
	
	
	/**
	 *  비밀번호와 출금할 금액을 전달 받아와 
	 *  조건에 맞으면 잔액에서 차감 후 현재 잔액을 출력
	 *  
	 *  조건 1) 비밀번호가 일치하지 않으면 "비밀번호 불일치" 출력
	 *  조건 2) 출금할 금액이 잔액보다 크면 "잔액 부족" 출력
	 *  
	 *  @param pw : 전달된 비밀번호
	 *  @param amount : 출근할 금액
	 */
	public void withdraw(String pw, long amount) {
		
		// 자바에서 
		// - 기본 자료형  비교는 == 
		// - 객체(참조형) 비교는 A.equals(B)
		
		// 현재 계좌 비밀번호(password)와
		// 전달 받은 비밀번호(pw)가 같을 경우 true / 다르면 false
		if(!password.equals(pw)) { //다를 경우
			System.out.println("비밀 번호 불일치");
			return; // 메서드 종료 -> 호출한 곳으로 돌아감
		}
		
		
		// 출금할 금액이 잔액보다 큰 경우
		if(amount > balance) {
			System.out.println("잔액 부족");
			return;
		}
		
		// 잔액을 출금할 금액 만큼 차감
		balance -= amount;
		
		System.out.printf("%s 계좌에서 %d원 출금\n", accountNumber, amount);
		System.out.println(name + "현재 잔액 : " + balance);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}