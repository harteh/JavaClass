package collection;

import java.util.ArrayList;

/*
 * �÷����� ����ũ���� �����̳��̴�. ������ ����, ���� �� ���ϴ�.
 * �迭�� ����ũ��� ���Ի����� �����ϴ�.
 * 
 ** �÷��� : ���׸� ������� ����
 *	�� �÷����� �ٷ� �� �ִ� ������ Ÿ���� ���� ������ ������ �� �ֵ��� 
 *	�Ϲ�ȭ ��Ű�� ���� �÷����� �����ϰ� ����� ���� ���� �� Ÿ�� ���� ���� ����
 * �÷����� ��Ҵ� ��ü�鸸 �����ϴ�
 * int, double, char �� �⺻Ÿ���� �����͸� �÷����� ��ҷ� �Ұ����ϴ�.
 * 
 ** ArrayList : ��ü �迭�� ���� ����ϱ� ���� �����Ǵ� ��ü�迭Ŭ����
 *
 */
/*
 * 1. ArrayList

public class CollEx09ArrayList {
	public static void main(String[] args) {

		//List Interface => < >
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("����");
		a.add("����");
		a.add("����");
		
		for(int i=0; i<a.size(); i++) {
			String b = a.get(i);			
			System.out.print(b+ " ");
		}
	}
}
*/
/*
* 2. ArrayList
*/
class Profile {
	String id;
	int age;
	
	Profile(String i, int a){
		id=i;	age=a;
	}
}
public class CollEx09ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Profile> a = new ArrayList<Profile>();
		
		a.add(new Profile("aa", 15));
		a.add(new Profile("bb", 25));
		a.add(new Profile("cc", 35));
		
		//�迭�� �߰��� ��Ҹ�ŭ ���
		for(int i=0; i<a.size(); i++) {
			Profile p = a.get(i);
			System.out.println( p.age+" "+p.id);
		}
		
		System.out.println("== ���� for�� ��� ==");
		for(Profile f:a) {
			System.out.println( f.age+" "+f.id);
		}
	}
}
