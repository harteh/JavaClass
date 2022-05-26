package inheritance;

class Animal {
	String a;
	
	Animal(String a){
		this.a=a;
	}
	
	String ani() {
		return a;
	}

}
class Dog extends Animal {
	String b;
	
	Dog(String a, String b){
		super(a);
		this.b = b;
	}
	String ani() {
		return super.ani() +" "+ b;
	}
}

public class InherEx11 {
	public static void main(String[] args) {

		Animal a1=new Dog("강아지","푸들");
		System.out.println( a1.ani() );	//강아지 푸들
		
		
	}
}
