package classpart;

/**
 * 객체 : 특성 + 행동
 * 
 * 1. 캡슐화
 * 객체를 캡슐로 싸서 내부를 보호하고 볼수 없게 하는 것 : 객체의 가장 본질적인 특성
 * 
 * 클래스: (객체)를 생성하기 위한 설계도 / 틀
 * 
 * 생성자
 * : 객체가 생성될 때 초기화를 위해 실행되는 메소드
 * 
 *
 */


public class Student01 {
	
	private int studentId;
	private String studentName;
	private int grade;
	private String address;		//멤버변수, 필드(field)
	
	//자바 프로그램은 private 멤버에 직접 접근할 수 없으며, 
	//해당 객체의 public 메소드를 통해서만 접근할 수 있습니다.
	
	public String getStudentName() { return studentName; }
	public String getAddress() { return address; }

	public void showStudentInfo() {
		System.out.printf("%s, %s", studentName, address);
	}
	
	
	//main 클래스
	public static void main(String[] args) {

		Student01 studentAhn = new Student01();	//객체생성
		studentAhn.studentName = "안연수";
		studentAhn.address = "서울시 중구";
		
		studentAhn.showStudentInfo();		//객체로부터 public 메소드 접근
		
	}

}
