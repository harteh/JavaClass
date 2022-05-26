package interfaceex;

interface A1 {
	public void funcA();	//추상 메서드
}
interface B1 {
	public void funcB();	//추상 메서드
}
interface C1 extends A1,B1 {	//다중 상속
	public void funcC();	//추상 메서드
}

class D1 implements C1 {
	public void funcA() {
		System.out.println("funcA");
	}
	public void funcB() {
		System.out.println("funcB");
	}
	public void funcC() {
		System.out.println("funcC");
	}
}


public class InterfaceEx02 {
	public static void main(String[] args) {

		D1 d1 = new D1();
		A1 a1 = d1;		//업캐스팅
		a1.funcA();
		
		B1 b1 = d1;		//업캐스팅
		b1.funcB();
		
		C1 c1 = d1;
		c1.funcA();
		c1.funcB();
		c1.funcC();
		//인터페이스에서 객체 생성 불가능하기 때문에
		//상속받은 클래스 D에서 객체 생성해줌
	}
}
