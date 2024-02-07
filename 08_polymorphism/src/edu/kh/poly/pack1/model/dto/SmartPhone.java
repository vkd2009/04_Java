package edu.kh.poly.pack1.model.dto;

// 부모 클래스 역활
public class SmartPhone {
	private String dispaly; // 화면
	private String newsAgency; // 통신사
	private String ap; // 스마트폰 cpu
	
	// 기본 생성자 자동 완성 : ctrl + space -> enter
	public SmartPhone() {}

	// 매개 변수 생성자 자동 완성 : alt [+shift] + s -> o
	public SmartPhone(String dispaly, String newsAgency, String ap) {
		super();
		this.dispaly = dispaly;
		this.newsAgency = newsAgency;
		this.ap = ap;
	}

	public String getDispaly() {
		return dispaly;
	}

	public void setDispaly(String dispaly) {
		this.dispaly = dispaly;
	}

	public String getNewsAgency() {
		return newsAgency;
	}

	public void setNewsAgency(String newsAgency) {
		this.newsAgency = newsAgency;
	}

	public String getAp() {
		return ap;
	}

	public void setAp(String ap) {
		this.ap = ap;
	}

	
	// toString() 오버라이딩 자동 완성 : alt [+shift] + s -> s
	@Override
	public String toString() {
		return "SmartPhone [dispaly=" + dispaly + ", newsAgency=" + newsAgency + ", ap=" + ap + "]";
	}
	
	
		
	
	
	
	
}
