package edu.kh.poly.pack1.model.dto;

public class Iphone extends SmartPhone{

	// Ios 운영체제 버전
	private int iosVersion;


	// 기본 생성자
	public Iphone() {}


	public Iphone(String dispaly, String newsAgency, String ap, int iosVesion) {
		super(dispaly, newsAgency, ap);
		this.iosVersion = iosVesion;
	}


	public int getIosVersion() {
		return iosVersion;
	}


	public void setIosVesion(int iosVersion) {
		this.iosVersion = iosVersion;
	}
	
	
	@Override
	public String toString() {
		return "Iphone iosVerison :" + iosVersion + " / " + super.toString();
	}
	
	
	
	
	
}