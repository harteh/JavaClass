package constructor;

class Pro {
	String name;	//�ʵ�
	
	Pro(String n){	//������ : �������� �̸��� Ŭ���� �̸��� ����
		name = n;	//�������� �ʱ�ȭ �ڵ�
	}
	
	void show() {	//�޼ҵ�
		System.out.println(name);
	}
}

public class ConstructorTest {
	public static void main(String[] args) {
		Pro p = new Pro("�μ�");
		p.show();
	}
}
