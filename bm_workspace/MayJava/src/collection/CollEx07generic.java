package collection;

/*
 * 제네릭(모형자) -> 템플릿(모형자)
 * generic <> angle blanket
 * 
 * 컬렉션 프레임워크(Vector, ArrayList, Map, Set)
 * 
 * 어떤 종류의 타입이든 사용할 수 있도록, 
 * 메서드나 클래스를 찍어내듯이 생산할 수 있는. 일반화 작업
 * 
 * 하나의 값으로 여러개의 값을 가질 수 있도록 하는 방법.
 * 
 */

class Java {
	String title;
	Java(String t) { title = t; }
	void show() { System.out.println(title); }
}
class DB {
	int n;
	DB(int n) { this.n = n;	}
	void pr() { System.out.println(n); }
}

class Program<T> {	//모형자 <> : 제네릭 기호
	
	T t;	//T:클래스 명 t:참조변수  (Java, DB 가 올 수 있다..)
	void in(T t) {
		this.t = t;	//초기화
	}
	
	T get() {
		return t;
	}
}

public class CollEx07generic {
	public static void main(String[] args) {
		
		//T 구체화
		Program <Java> p =
				new Program<Java>();
		p.in(new Java("자바입니다."));	//Java p = new Java("java");
		
		Java j = p.get();
		j.show();
		
		//
		Program <DB> d = 
				new Program<>();
		d.in(new DB(30));
		DB db = d.get();
		db.pr();
		
	}
}
