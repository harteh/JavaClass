package totalRe0531;

class Animal {
	public void move() {
		System.out.println("�����Դϴ�.");
	}
}
class Human extends Animal {
	public void move() {
		System.out.println("�ι߷� �Ƚ��ϴ�.");
	}
}
class Tiger extends Animal {
	public void move() {
		System.out.println("�׹߷� �ݴϴ�.");
	}
}
class Eagle extends Animal {
	public void move() {
		System.out.println("�ϴ��� ���ϴ�.");
	}
}

public class Page260 {
	public void moveAnimal(Animal animal) {
		animal.move();	//�������̵� -> �����ǵ� �޼��尡 ȣ���
	}
	
	public static void main(String[] args) {
		Page260 aTest = new Page260();	//��ü����
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
	}
}
