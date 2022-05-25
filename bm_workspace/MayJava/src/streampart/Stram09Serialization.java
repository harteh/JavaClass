package streampart;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * implements Serializable
 * - 인터페이스..
 * - 일종의 선언..
 */
class Stu implements Serializable{
	private static final long serialVersionUID = -1503252402544036183L;
	//버전 관리를 외한 정보
	
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
		
	/* 파일 생성 - 저장 
		ObjectOutputStream os = null;
		
		try {
			os = new ObjectOutputStream(new FileOutputStream("ob.dat"));	//파일생성
			
			Stu s = new Stu();
			s.setName("세종");
			s.setId("123");
			s.setAge(29);
			
			os.writeObject(s);	//s의 값을 파일에 씀(직렬화)
			
			
		} catch (Exception e) { }
		
		os.close();		//저장 완료
	*/
		
	/* 파일 읽어오기 */
		ObjectInputStream in = null;	//읽어오기
		
		try {
			in = new ObjectInputStream(new FileInputStream("ob.dat"));
			
			Stu s = (Stu)in.readObject();	//값을 파일에서 읽어 들임(역직렬화)
			//반환형이 Object 클래스다. Object형을 Stu형으로 다운캐스팅(형변환) 
			
			System.out.println(s.getName());
			System.out.println(s.getId());
			System.out.println(s.getAge());
			
		} catch (Exception e) { }
		in.close();
	 
		
		
	}

}
