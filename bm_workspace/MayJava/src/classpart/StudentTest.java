package classpart;


class Student{
	
	int studentId;
	String studentName;
	int grade;
	String address;	 //�������, �ʵ�(field)
	
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
		 * ���۷��� ���� s�� �����԰� ���ÿ� ��ü ������
		 */	
		Student s;	
		//���۷��� ������ ����
		//��ü�� �����ϱ� ���� ��ü�� ����ų ���۷��� ���� ������ �ʿ���

		s = new Student();	
		//Student ��ü ����
		//new�����ڴ� Student Ÿ���� ũ�� ���� �޸𸮸� �Ҵ�޾�
		//�޸𸮿� ���� �ּҸ� �����Ѵ�.
		
		
		s.studentName = "�̼���";
		System.out.println(s.studentName);
		System.out.println(s.getStudentName());
		s.address = "����� �߱�";
		s.showStudentInfo();
		
	}

}
