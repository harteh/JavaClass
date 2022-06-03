package collection;

class Food {
	void show() {
		System.out.println("음식");
	}
}
class Pizza extends Food {
	void show() {
		super.show();
		System.out.println("피자");
	}
}

class Fo<T> {
	T t;
	void in(T t) {
		this.t=t;
	}
	T out() {
		return t;
	}
}

public class CollEx23generic {
	//p.397
	//? 바인드변수	//Fo<Pizza> f
	static void pr(Fo <? extends Food> f) {	//Food와 Food의 하위클래스이 ? 에 들어갈 수 있다
		Food fo = f.out();	//Food fo = Food.out();
							//Food fo = Pizza.out();
		fo.show();
	}
	
	public static void main(String[] args) {
		Fo<Food> f= new Fo<Food>();
		f.in(new Food());
		pr(f);
		
		Fo<Pizza> f1= new Fo<Pizza>();
		f1.in(new Pizza());
		pr(f1);
	}
}
