package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		List<IPInfo> ipInfoList = null;
		
		
		ipInfoList.add(new IPInfo("123.123.123.123", "홍길동"));
		ipInfoList.add(new IPInfo("212.133.7.8", "이름" ));
		ipInfoList.add(new IPInfo("177.233.111.222", "고길순"));
		
		System.out.print("ip 입력 : ");
	  String ip = sc.next();
	  
	  // get(i).getIp() .equals(ip)
	  for(int i=0; i<ipInfoList.size(); i++) {
	  	if(ipInfoList.get(i).equals(ip)) {
	  		
	  		System.out.println(ipInfoList.get(i));
	  		break; //(return);
	  	}
	  }
		System.out.println("일치하는 ip 사용자가 없습니다.");
		
	}
}
