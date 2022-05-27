package inheritance;

class Fruit {
	void fruit() {
		System.out.println("과일");
	}
}
class Apple extends Fruit {
	void apple() {
		System.out.println("애플");
	}
}
class PineApple extends Apple {
	void pineApple() {
		System.out.println("파인애플");
	}
}


public class InherEx12 {
	
	static void pr(Fruit f) {
		if (f instanceof PineApple) {
			((PineApple) f).pineApple();
		}	//다운캐스팅할때 클래스 명칭 적어야한다.
		else if (f instanceof Apple) {
			((Apple) f).apple();
		}
		else {
			f.fruit();
		}
	}
	
	public static void main(String[] args) {
		Fruit f=new Fruit();
		Apple a=new Apple();
		PineApple p=new PineApple();
		
		pr(f);
		pr(a);
		pr(p);
	}
}
