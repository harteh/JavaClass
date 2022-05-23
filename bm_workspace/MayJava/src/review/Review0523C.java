package review;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1. 입력받은 텍스트를 java.txt파일에 저장하는 프로그램을 작성해라. 
 * (InputStreamReader, FileWriter 사용)
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
 * 2. 클래스 작성
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
		Student s1 = new Student("김길동", "kim");
		Student s2 = new Student("이길동", "lee");
		s1.pr();
		s2.pr();
	}
}

