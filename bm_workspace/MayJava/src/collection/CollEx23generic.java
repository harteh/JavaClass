package collection;

class Food {
	void show() {
		System.out.println("����");
	}
}
class Pizza extends Food {
	void show() {
		super.show();
		System.out.println("����");
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
	//? ���ε庯��	//Fo<Pizza> f
	static void pr(Fo <? extends Food> f) {	//Food�� Food�� ����Ŭ������ ? �� �� �� �ִ�
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
