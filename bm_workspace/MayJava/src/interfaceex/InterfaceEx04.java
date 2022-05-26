package interfaceex;

interface IT {
	public void java();
}
class Student {
	public void study(IT it) {
		it.java();
	}
}
class ITStudent implements IT {
	public void java() {
		System.out.println("�ڹ� ����");
	}
}

class DBStudent implements IT {
	public void java() {
		System.out.println("�����ͺ��̽� ����");
	}
}

/*
 * ITStudent �� DBStudent �� IT �������̽��� �޾Ƽ� �߻�޼��� java()�� �����Ѵ�. 
 * s.study(i) : �� Student Ŭ������ ����, ��ĳ����
 * 		s.study(i);	 //IT it = new ITStudent();
 * 		�������ε�
 */

public class InterfaceEx04 {
	public static void main(String[] args) {

		Student s = new Student();
		ITStudent i = new ITStudent();
		DBStudent d = new DBStudent();
		
		s.study(i);
		s.study(d);
		
	}
}
