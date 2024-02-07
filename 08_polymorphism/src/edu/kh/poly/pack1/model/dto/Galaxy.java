package edu.kh.poly.pack1.model.dto;

public class Galaxy extends SmartPhone {

		// 안드로이드 운영체제 버전 
		private int androidVersion;
		
		
		// 기본 생성자
		public Galaxy() {}

		// 매개 변수 생성자 자동 완성 + super() 매개 변수 생성자
		
		
		// alt [+shift] + s -> o -> 드롭다운에서 부모 생성자 선택 -> Generate	
		public Galaxy(String dispaly, String newsAgency, String ap, int androidVersion) {
			super(dispaly, newsAgency, ap);
			this.androidVersion = androidVersion;
		}

		// alt [+shift] + s -> r
		public int getAndroidVersion() {
			return androidVersion;
		}

		public void setAndroidVersion(int androidVersion) {
			this.androidVersion = androidVersion;
		}
		
		
		// toString() 오버라이딩
		@Override
		public String toString() {
				return "Galaxy AndrodiVersion : " + androidVersion + " / " + super.toString() ;
				
				
		}
		
		
		
		
		
		
}
