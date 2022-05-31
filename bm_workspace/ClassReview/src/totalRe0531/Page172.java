package totalRe0531;

//p.172, 173
class Person172 {
	String name;
	int age;
	
	Person172(){
		this("이름없음", 1);
	}
	Person172(String name, int age){
		this.name=name;		this.age=age;
	}
	
	Person172 returnItSelf() {	//반환형: 클래스형
		return this;	//this 반환
	}
}
public class Page172 {
	public static void main(String[] args) {
		Person172 noName = new Person172();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person172 p = noName.returnItSelf();	//this값을 클래스 변수에 대입
		System.out.println(p);		//noName.returnItSelf()의 반환값 출력
		System.out.println(noName);	//참조변수 출력
	}
}
