package totalRe0531;

class Animal {
	public void move() {
		System.out.println("움직입니다.");
	}
}
class Human extends Animal {
	public void move() {
		System.out.println("두발로 걷습니다.");
	}
}
class Tiger extends Animal {
	public void move() {
		System.out.println("네발로 뜁니다.");
	}
}
class Eagle extends Animal {
	public void move() {
		System.out.println("하늘을 납니다.");
	}
}

public class Page260 {
	public void moveAnimal(Animal animal) {
		animal.move();	//오버라이딩 -> 재정의된 메서드가 호출됨
	}
	
	public static void main(String[] args) {
		Page260 aTest = new Page260();	//객체생성
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
	}
}
