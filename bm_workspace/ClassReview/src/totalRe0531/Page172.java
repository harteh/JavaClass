package totalRe0531;

//p.172, 173
class Person172 {
	String name;
	int age;
	
	Person172(){
		this("�̸�����", 1);
	}
	Person172(String name, int age){
		this.name=name;		this.age=age;
	}
	
	Person172 returnItSelf() {	//��ȯ��: Ŭ������
		return this;	//this ��ȯ
	}
}
public class Page172 {
	public static void main(String[] args) {
		Person172 noName = new Person172();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person172 p = noName.returnItSelf();	//this���� Ŭ���� ������ ����
		System.out.println(p);		//noName.returnItSelf()�� ��ȯ�� ���
		System.out.println(noName);	//�������� ���
	}
}
