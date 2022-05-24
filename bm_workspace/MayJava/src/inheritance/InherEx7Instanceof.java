package inheritance;

/*
 * �ٿ�ĳ������ �ϱ� ���� ���� Ŭ������ ����ȯ�� �ν��Ͻ���
 * ���� �ڷ����� Ȯ���ؾ� ��ȯ�� �� ������ ���� �� �ִ�.
 */

/*
 * 1
 */
class Person {}
class Student3 extends Person{}
class Entertainer extends Person{}
class Singer extends Entertainer{}

public class InherEx7Instanceof {
	
	static void pr(Person p) {
		if(p instanceof Person) {
			System.out.println("���");
		}
		if(p instanceof Student3) {
			System.out.println("�л�");
		}
		if(p instanceof Entertainer) {
			System.out.println("������");
		}
		if(p instanceof Singer) {
			System.out.println("����");
		}
	}
	
	public static void main(String[] args) {
		pr(new Student3());		//pr(Person p = new Student3());
		//��� �л�
		pr(new Entertainer());	//Person p = new Entertainer()
		//��� ������
		pr(new Singer());		//Person p = new Singer()
		//��� ������ ����
	}
}
