package edu.kh.oop.field.pack3;

public class Korean {
	
	/* 필드 */
	
	// static이 붙은 필드는 프로그램 실행시
	// static 메모리 영역에 할당된다
	
	/* static 필드 앞에 public을 작성하는 이유
	 * -> 어디서든지 누구든지 공유할 수 있도록하는게 목적이기 때문에
	 * */
	public static int nationalCode = 82; // 국가 코드
	
	// static + final
	public static final String ANESTOR = "단군 할아버지";
	
	private String name;	// 이름
	private String id;  	// 주민등록번호
	
	// 초기화 불럭
	// - 객체 생성 시 필드를 {} 내부의 값으로 초기화 
	{
		name = "김길동";
		id = "981122-1234567";
	}
	
	// static 초기화 불럭 
	// -> static 붙어있는 구문은 프로그램 실행 시 1회만 수행
	// -> Korean 객체가 100만번 생성 되어도 처음 1회만 읽음
	static {
		nationalCode = 10;
	}
	
	
	/* 메서드 */
  public void setName(String name) {
  	this.name = name;
  	
  	// 매개 변수로 전달 받은 name을
  	// 현재 객체의 name 필드에 대입
  }
  
  public void setId(String id) {
  	this.id = id;
  }
  
  // 반환형 void : 반환하는게 없다
  // 반환형 String : 메서드 종료시 String 객체를 반환
  public String getName() {
  	return name;
  }
	
  public String getid() {
  	return id;
  }
}
