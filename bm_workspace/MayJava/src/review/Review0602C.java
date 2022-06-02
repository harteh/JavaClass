package review;

import java.util.HashSet;

class Student446 {
	String name;	String id;
	
	Student446(String id, String name) {
		this.id=id;		this.name=name;
	}
	
	@Override
	public String toString() {
		return id+":"+name;
	}
	
	@Override
	//��ü�� �ؽ��ڵ尪�� �����´�
	public int hashCode() {
		return Integer.parseInt(id);	//���ڿ��� int�� ����
	}
	
	@Override
	public boolean equals(Object obj) {
		Student446 std = (Student446)obj;
		if(std.id == id) {
			//�Ű������� ���� id�� �ڽ��� id�� ������ true�� ��ȯ�Ѵ�.
			return true;
		}
		else {
			return false;
		}
	}
	
}

public class Review0602C {
	public static void main(String[] args) {

		HashSet<Student446> set = new HashSet<Student446>();
		set.add(new Student446("100", "ȫ�浿"));
		set.add(new Student446("200", "������"));
		set.add(new Student446("300", "�̼���"));
		set.add(new Student446("400", "�����"));
		set.add(new Student446("100", "���߱�"));
		
		System.out.println(set);	//���� ���·� ��µ�
	}
}
