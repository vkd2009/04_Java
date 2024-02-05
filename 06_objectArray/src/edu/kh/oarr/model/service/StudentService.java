package edu.kh.oarr.model.service;

import java.util.Random;

import edu.kh.oarr.model.dto.Student;

// Service 클래스 : 기능 제공 클래스
// -> 입력, 출력 빼고 나머지
// ex) 로직(if, for)을 이용한 데이터 가공 , 저장

public class StudentService {

	// 필드
	private Student[] students = new Student[10];
	// 학생 객체 참조 변수 10개 부묶음인 Student[] 생성(할당)하고
	// 그 주소를 students 참조 변수에 대입
	
	// 기본 생성자
	public StudentService() {
		
		// 학생 객체 배열 (students)에 샘플 학생 3명 추가
		
		// students    의 자료형 : Student[]
		// students[0] 의 자료형 : Student
		
		students[0] = new Student("24001", "최미영", 'F');
		students[1] = new Student("24002", "홍길동", 'M');
		students[2] = new Student("24003", "신짱구", 'M');
		
		// students[3~9] == null
		
		// 자바에서 제공하는 난수 생성 객체
		Random random = new Random();
		
		// 샘플 학생 점수 초기화
		for(int i=0; i<students.length; i++) { // 10바퀴
			
			// i번째 인덱스에 참조하는 학생이 없으면 반복 종료
			if(students[i] == null) break;
			
			 // random.nextInt(101) : 0 이상 101 미만 정수형 난수 생성
			
			students[i].setHtml( random.nextInt(101));
			students[i].setCss( random.nextInt(101));
			students[i].setJs( random.nextInt(101));
			students[i].setJava( random.nextInt(101));
			
		}
		
	}
	
	/** 전달 받은 학생 객체(주소)를
	 * 	students 객체 배영에서
	 * 	빈칸(null인 칸)에 대입
	 * 
	 * @param newStd : 전달 받은 학생
	 * 
	 * @return 대입 성공 시 true, 실패 시(== 꽉 찼을 때) false
	 */
	public boolean addStudent( Student newStd) {
		
		// students 배열의 인덱스 요소 중
		// 맨 처음 null인 부분으 찾아 newStd 대입
		
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = newStd;
				return true;
			}
		}
		
		
		return false;
	}
	
	
	/** 학생 객체 배열(students) 참조 주서 반환
	 * @return students (주소)
	 */
	public Student[] getStudents() {
		return students;
	}
	
	
	/** 학생 1명 정보 조회(index 검색)
	 * @param index
	 * @return 조회된 학생 또는 null
	 */
	public Student selectIndex(int index) {
		
		// java.lang.ArrayIndexOutOfBoundsException: 
		// -> 배열 인덱스 범위 초과 (0 부터 배열길이-1 까지)
		
		if(index < 0 || index >= students.length) {
			return null;
		}
		
		return students[index];
		
	}
	
	
	
	
	/** 이름이 일치하는 학생 조회
	 * @param name : 입력 받은 이름
	 * @return : 일치하는 학생 저보 또는 null
	 */
	public Student selectName(String name) {
		
		// students 객체 배열을 순차 접근 하여
		// null이 아니면서 이름이 name과 일치하는 학생 찾기 return
		
		/* 향상된 for문 */
		
		// for(변수 : 배열 
		
		// - 배열 || 컬렉션의 요소를 처음 부터 끝까지
		//   하나씩 꺼내와 변수에 저장	
		
		for(Student s : students) {
			
			if(s == null) { // 저장된 학생이 없는 경우
				break;
			}
			
			// 현재 접근한 학생의 이름이 name과 같은지
			if(s.getName().equals(name) ) {
				return s;
			}
		}
		
		return null;
	}
	
	/** 학생 점수 조회
	 * @param index
	 * @return 학생 점수가 기록된 문자열 
	 */
	public String selectScore(int index) {
		
		int html = students[index].getHtml();
		int css = students[index].getCss();
		int js = students[index].getJs();
		int java = students[index].getJava();
		
		int sum = html + css + js + java; // 합계
		
		double avg = sum / 4.0; // 평균
		
		String result 
				= String.format("HTML(%d) CSS(%d) JS(%d) Java(%d)" ,html ,css ,js ,java );
		
		result += "\n합계 : " + sum;
		
		result += "\n평균 : " + avg;
		
		return result;
	}
	
	
	
	/**	평균 최고점/최저점 구하기
	 * @return 최고점 : 홍길동(98.3)
	 * 							최저점 : 신짱구(45.7)
	 */
	public String selectMaxMin() {
		
		Student maxStudent = null; // 최고점 학생
		Student minStudent = null; // 최저점 학생
		
		double maxAvg = 0.0; // 평균 최고점
		double minAvg = 0.0; // 평균 최저점
		
		// 향상된 for문
		for(Student s : students) {
			
				if(s == null) break; // 학생이 없으면 반복 종료
				
				
				int sum = s.getHtml() + s.getCss() + s.getJs() + s.getJava();
				double avg = sum / 4.0;
				
				if(maxAvg == 0) { // 첫 번째 바퀴인 경우
						maxStudent = s;
						minStudent = s;
						maxAvg = avg;
						minAvg = avg;
						continue;
				}
				
				if(maxAvg < avg) { // 기존 최대값보다 현재 평균이 더 큰 경우
						maxAvg = avg;
						maxStudent = s;
				}
				
				if(minAvg > avg) { // 기존 최소값보다 현재 평균이 더 작은 경우
						minAvg = avg;
						minStudent = s;
				}
				
		}
		
		return String.format("최고점 : %s(%.1f)\n"
																				+ "최저점 : %s(%.1f)\n", 
					maxStudent.getName(), maxAvg, minStudent.getName(), minAvg);
	}
	
	
}
