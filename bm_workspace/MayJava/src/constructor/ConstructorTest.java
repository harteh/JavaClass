package constructor;

class Pro {
	String name;	//필드
	
	Pro(String n){	//생성자 : 생성자의 이름은 클래스 이름과 같다
		name = n;	//생성자의 초기화 코드
	}
	
	void show() {	//메소드
		System.out.println(name);
	}
}

public class ConstructorTest {
	public static void main(String[] args) {
		Pro p = new Pro("인성");
		p.show();
	}
}
