package review;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1. �Է¹��� �ؽ�Ʈ�� java.txt���Ͽ� �����ϴ� ���α׷��� �ۼ��ض�. 
 * (InputStreamReader, FileWriter ���)
 * 
public class Review0523C {
	public static void main(String[] args) throws IOException {

		InputStreamReader in = new InputStreamReader(System.in);
		FileWriter fw = new FileWriter("java.txt");
		
		int str;
		while((str=in.read()) != -1) {
			fw.write(str);
		}
		fw.close();
	}
}
*/

/*
 * 2. Ŭ���� �ۼ�
 */
class Student {
	String name;
	String firstName;
	
	Student(String name, String firstName){
		this.name = name;
		this.firstName = firstName;
	}
	
	void pr(){
		System.out.println(name +", "+ firstName);
	}
}

public class Review0523C {
	public static void main(String[] args) throws IOException {
		Student s1 = new Student("��浿", "kim");
		Student s2 = new Student("�̱浿", "lee");
		s1.pr();
		s2.pr();
	}
}

