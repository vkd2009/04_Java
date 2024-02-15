package edu.kh.io.pack2.model.service;




import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteService {
	
	/* 스트림(Stream) : 데이터가 이동하는 통로
	 * 									기본적으로 한 방향으로 흐름
	 * 
	 * 
	 * 
	 * Byte 기반 스트림
	 * 
	 * - 1byte 단위로 데이터를 입/출력하는 스트림
	 * 
	 * - 최상위 인터페이스 : InputStream, OutputStream
	 * 
	 * - 문자열, 이미지, 영상, 오디오, pdf 등
	 * 	모든 것을 입/출력 할 수 있음
	 * 	(단, 통로가 좁아 속도가 조금 느림)
	 */
	
		
	/* ********************************************** */
	
	// IO 관련 코드는 IOExecption이 발생될 가능성이 높다!
	// -> 거의 모든 메서드가 throws IOExecption
	// -> IOException 예외 처리 구문을 작성하는 것이 필수!
	
	/* ********************************************** */
	
	
	/**
	 * 바이트 기반 파일 출력 
	 */
	public void fileByteOutput() {
		
		// FileOutputStream 참조 변수 선언
		FileOutputStream fos = null; // try, finally 구문에서 사용 예정
		
		
		try {
			
			// new FileOutputStream("경로") :
			//  -> 경로에 작성된 파일과 연결된 파일 출력 스트림 객체 생성
			//  -> 출력 스트림에 연결된 파일이 존재하지 않으면 자동 생성
			//   (단, 폴더는 생성되지 않음)
			
			//  -> 기존 파일이 존재하면 내용을 덮어쓰기함
			
			
			// new FileOutputStream("경로", true)
			// -> 기존 파일이 존재하면 내용을 이어쓰기함
			
			fos = new FileOutputStream("/io_test/20240215/바이트기반_테스트.txt");
			
			// String 불변성 문제를 해결한 객체(가변성)
			StringBuilder sb = new StringBuilder();
			sb.append("Hello World!!!\n");
			sb.append("1234567890\n");
			sb.append("!@#$%^&*\n");
			sb.append("와 자바 너무 재밌다\n");
			sb.append("선생님 저 공부 열심히 할게요!\n");
			sb.append("진짜로!!!\n");
			sb.append("정말로!!!");
			
			// StringBuilder -> String 변환
			String content = sb.toString();
			
			
			
			
			// 출력 방법 1 : 한 글자씩 파일로 출력
			// -> 2byte 범주의 문자(영어,숫자, 기본 특수문자 제외)
			//   1byte 기반 스트림 통과 시 데이터 손실이 발생해서
			//   글자가 깨지는 문제가 발생!
			
			
			/*
			  for(int i=0, len=content.length() ; i<len ; i++) { char ch =
			  content.charAt(i); // i번째 글자 반환 fos.write(ch); // 1byte 출력 스트림이 연결된 파일에 ch 쓰기
			  }
			 */
			
			// System.nanoTime() : 1970.01.01 09:00 부터
			// 현재 시간까지의 차이를 ns(nano second 단위)로 반환
			// 1ms(밀리)     == 1/1000초
			// 1us(마이크로) == 1/1000ms
			// 1ns(나노)     == 1/1000us
			long startTime = System.nanoTime();
			
			// 출력 방법 2 : String을 byte[] 변환 후 출력
			fos.write(content.getBytes());		
			
			long endTime = System.nanoTime();
			
			System.out.println("[수행 시간] " + ( endTime - startTime ) + " ns ");
			
			
			fos.flush(); // 스트림 안에 남아있는 데이터를 모두 밀어냄		
			
			
			System.out.println("출력 완료");
			
			
		}catch(IOException e) {
			e.printStackTrace(); // 예외가 발생한 메서드까지 추적해 출력
			
		} finally { // try 예외 발생 여부 관계 없이 무조건 수행
			
				// 사용 완료한 스트림을 제거(닫기, 메모리 반환) 하는 코드 작성
				try {
					if(fos != null) { // 스트림이 정상 생성된 경우
						fos.close();
					}
				}catch(IOException e) {  
					  e.printStackTrace();
				}
			
		}
	}
	
	
	
	/**
	 * 버퍼를 이용한 파일 출력
	 *  
	 * - BufferedOutputStream 보조 스트림 이용
	 */
	public void bufferedFileByteOutput() {
		
		/* 버퍼(Buffer)란?
		 * - 데이터를 모아두는 박스, 장바구니 같은 메모리 공간
		 * 
		 * * 버퍼링
		 *  - 인터넷 속도 낮음 +  스트리밍 코드가 효율이 안좋음
		 *   -> 동영상 재생 중에 미리 
		 *   		앞에 재생될 부분을 다운 받아놔서
		 *   		영상을 끊김없이 볼 수 있게 함
		 *   		-> 다운 받아서 저장 해놓은 공간 == 버퍼
		 */
		
		
		/* BufferedOutputStream / BufferedInputStream
		 * 
		 * - FileOutputStream은 1바이트씩 데이터를 입출력
		 * 
		 * - BufferedOutputStream / BufferedInputStream
		 *  -> 버퍼에 입출력할 내용을 모아서 한 번에 입출력!
		 *  
		 *  --> 스트림을 이용하는 횟수가 적어짐
		 *     -> 성능, 시간 효율 up!
		 * 
		 */
		
		
		 FileOutputStream fos = null; // try, finally에서 사용 예정
		
		 BufferedOutputStream bos = null; // 보조 스트림 선언
		 
		 
		try {
			
			fos = new FileOutputStream("/io_test/20240215/바이트기반_테스트_Buffered.txt");
			
			// 기반 스트림 fos를 이용해
			// 보조 스트림 bos를 생성
			bos = new BufferedOutputStream(fos);
			
			
			StringBuilder sb = new StringBuilder();
			sb.append("Hello World!!!\n");
			sb.append("1234567890\n");
			sb.append("!@#$%^&*\n");
			sb.append("와 자바 너무 재밌다\n");
			sb.append("선생님 저 공부 열심히 할게요!\n");
			sb.append("진짜로!!!\n");
			sb.append("정말로!!!");
			
			// StringBuilder -> String 변환
			String content = sb.toString();
			
			long startTime = System.nanoTime();
			
			bos.write(content.getBytes());
			
			long endTime = System.nanoTime();
			System.out.println("[수행 시간] " + ( endTime - startTime ) + " ns" );  
			
					
			bos.flush();  // 스트림에 남아있는 데이터 밀어내기(쏟아내기)
			
			System.out.println("출력 완료");
						
		}catch(IOException e) {
				e.printStackTrace();
				
		} finally {
			
			// 사용 완료된 스트림 메모리 반환(닫기, 제거)
			try {
				if(bos != null) bos.close();
				// 보조 스트림 close() 시
				// 보조 스트림 생성에 사영된 기반 스트림도 같이 close()됨
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
}