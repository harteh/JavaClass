package collection;

abstract class Profile10 {
	//�������̽��� abstract ���� ����
	//�߻�޼���� abstract ���� �� �� ����.
	abstract void add(String name, String id);
	abstract String check(String id);
}

class Person {
	String name;
	String id;
	
	public Person(String name, String id) {
		this.name=name;		this.id=id;
	}

	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
}

class Per extends Profile10 {
	//��ü�迭�� main Ŭ�������� Per Ŭ�������� ���� �� �����ϱ�
	Person arr[];	//��ü �迭 ����
	int n;
	
	Per(int n) {	//��ü �迭�� ����
		arr = new Person[n];
	}
	
	void add(String name, String id) {
		arr[n] = new Person(name, id);
		n++;
	}
	
	//�Է��� id�� �´� �̸� ���
	String check(String id) {	
		for(int i=0; i<n; i++ ) {
			if(id.compareTo(arr[i].getId()) ==0 ) {
				return arr[i].getName();
			}
		}
		return null;
	}	
}


public class CollEx10 {
	public static void main(String[] args) {

		Profile10 p = new Per(5);
		p.add("����", "123");
		p.add("����", "456");
		p.add("����", "789");
		
		System.out.println(p.check("789"));
		System.out.println(p.check("456"));
		System.out.println(p.check("123"));
		
	}
}
