package classpart;

class Profile{
	
	int age;
	String name;	//�ʵ�
	
	void show() {	//�޼ҵ�
		System.out.println(age+" "+name);
	}
}


public class ProfileTest {
	public static void main(String[] args) {

		Profile p1 = new Profile();	//��ü p1
		p1.age = 23;
		p1.name = "�̽�";	//�ʵ� �ʱ�ȭ
		p1.show();	//�Լ�ȣ��
		
	}
}
