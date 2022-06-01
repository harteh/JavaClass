package totalRe0531;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person551 implements Serializable{
	private static final long serialVersionUID = -1503252402544036183L;
	String name;
	String job;
	
	public Person551() {}
	public Person551(String name, String job) {
		this.name=name;		this.job=job;
	}
	public String toString() {
		return name+", "+job;
	}
}

public class Page551 {
	public static void main(String[] args) throws ClassNotFoundException {
		Person551 pAhn = new Person551("�����", "��ǥ�̻�");
		Person551 pKim = new Person551("��ö��", "���̻�");
		
		try(FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(pAhn);		//���� ���Ͽ� ����(����ȭ)
			oos.writeObject(pKim);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Person551 p1 = (Person551)ois.readObject();
			Person551 p2 = (Person551)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}
}
