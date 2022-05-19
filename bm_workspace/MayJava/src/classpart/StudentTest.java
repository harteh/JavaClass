package classpart;


class Student{
	
	int studentId;
	String studentName;
	int grade;
	String address;	 //멤버변수, 필드(field)
	
	public String getStudentName() { return studentName; }
	public String getAddress() { return address; }
	
	public void showStudentInfo() {
		System.out.println(studentName+", "+address);
		 
	}
}


public class StudentTest {

	public static void main(String[] args) {

		/*
		 * Student s=new Student(); 
		 * 레퍼런스 변수 s를 선언함과 동시에 객체 생성함
		 */	
		Student s;	
		//레퍼런스 변수를 선언
		//객체를 생성하기 전에 객체를 가리킬 레퍼런스 변수 선언이 필요함

		s = new Student();	
		//Student 객체 생성
		//new연산자는 Student 타입의 크기 만한 메모리를 할당받아
		//메모리에 대한 주소를 리턴한다.
		
		
		s.studentName = "이순신";
		System.out.println(s.studentName);
		System.out.println(s.getStudentName());
		s.address = "서울시 중구";
		s.showStudentInfo();
		
	}

}
