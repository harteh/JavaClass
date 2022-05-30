package collection;
/*
 * 제네릭 메서드
 * public <자료형 매개변수> 반환형 메서드 이름(자료형 매개변수 ...){}
 * 
 */

class AA {
	public String toString() {	
		//line 19. 객체 출력을 문자열로 하기 위해 오버라이딩함.
		return "AA";
	}
}
class BB {
	public String toString() {	//오버라이드
		return "BB";
	}
}
class In {
	<T> void show(T t) {	//제네릭 메서드
		System.out.println(t);
	}
	void show() {	//오버로드
		System.out.println("generic");
	}
}

public class CollEx08generic {
	public static void main(String[] args) {

		AA a = new AA();
		BB b = new BB();
		In i = new In();
		
		i.show();	//generic
		i.<AA>show(a);	//AA t = a;
		i.<BB>show(b);	//BB
		
	}
}
