package classpart;

/**
 * ��ü : Ư�� + �ൿ
 * 
 * 1. ĸ��ȭ
 * ��ü�� ĸ���� �μ� ���θ� ��ȣ�ϰ� ���� ���� �ϴ� �� : ��ü�� ���� �������� Ư��
 * 
 * Ŭ����: (��ü)�� �����ϱ� ���� ���赵 / Ʋ
 * 
 * ������
 * : ��ü�� ������ �� �ʱ�ȭ�� ���� ����Ǵ� �޼ҵ�
 * 
 *
 */


public class Student01 {
	
	private int studentId;
	private String studentName;
	private int grade;
	private String address;		//�������, �ʵ�(field)
	
	//�ڹ� ���α׷��� private ����� ���� ������ �� ������, 
	//�ش� ��ü�� public �޼ҵ带 ���ؼ��� ������ �� �ֽ��ϴ�.
	
	public String getStudentName() { return studentName; }
	public String getAddress() { return address; }

	public void showStudentInfo() {
		System.out.printf("%s, %s", studentName, address);
	}
	
	
	//main Ŭ����
	public static void main(String[] args) {

		Student01 studentAhn = new Student01();	//��ü����
		studentAhn.studentName = "�ȿ���";
		studentAhn.address = "����� �߱�";
		
		studentAhn.showStudentInfo();		//��ü�κ��� public �޼ҵ� ����
		
	}

}
