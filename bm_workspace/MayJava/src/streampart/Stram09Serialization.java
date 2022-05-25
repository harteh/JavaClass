package streampart;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * implements Serializable
 * - �������̽�..
 * - ������ ����..
 */
class Stu implements Serializable{
	private static final long serialVersionUID = -1503252402544036183L;
	//���� ������ ���� ����
	
	private String name;
	private String id;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Stram09Serialization {
	public static void main(String[] args) throws IOException {
		
	/* ���� ���� - ���� 
		ObjectOutputStream os = null;
		
		try {
			os = new ObjectOutputStream(new FileOutputStream("ob.dat"));	//���ϻ���
			
			Stu s = new Stu();
			s.setName("����");
			s.setId("123");
			s.setAge(29);
			
			os.writeObject(s);	//s�� ���� ���Ͽ� ��(����ȭ)
			
			
		} catch (Exception e) { }
		
		os.close();		//���� �Ϸ�
	*/
		
	/* ���� �о���� */
		ObjectInputStream in = null;	//�о����
		
		try {
			in = new ObjectInputStream(new FileInputStream("ob.dat"));
			
			Stu s = (Stu)in.readObject();	//���� ���Ͽ��� �о� ����(������ȭ)
			//��ȯ���� Object Ŭ������. Object���� Stu������ �ٿ�ĳ����(����ȯ) 
			
			System.out.println(s.getName());
			System.out.println(s.getId());
			System.out.println(s.getAge());
			
		} catch (Exception e) { }
		in.close();
	 
		
		
	}

}
