package classpart;

class Profile{
	
	int age;
	String name;	//필드
	
	void show() {	//메소드
		System.out.println(age+" "+name);
	}
}


public class ProfileTest {
	public static void main(String[] args) {

		Profile p1 = new Profile();	//객체 p1
		p1.age = 23;
		p1.name = "이신";	//필드 초기화
		p1.show();	//함수호출
		
	}
}
