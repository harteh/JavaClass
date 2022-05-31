package totalRe0531;

//p.157,158
class Person {
	String name;
	float weight, height;
	
	Person(){}
	Person(String n, float w, float h){
		name=n;
		weight=w;
		height=h;
	}
}
public class Page157 {
	public static void main(String[] args) {
		Person personKim = new Person();	//기본생성자호출
		personKim.name="김유신";
		personKim.weight=85.5F;
		personKim.height = 180.8F;
		
		Person personLee = new Person("이순신", 175, 75);
		System.out.println(personLee.weight);	//175.0
	}
}
