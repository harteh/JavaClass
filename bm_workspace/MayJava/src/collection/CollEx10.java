package collection;

abstract class Profile10 {
	//인터페이스는 abstract 생략 가능
	//추상메서드는 abstract 생략 할 수 없다.
	abstract void add(String name, String id);
	abstract String check(String id);
}

class Person {
	String name;
	String id;
	
	public Person(String name, String id) {
		this.name=name;		this.id=id;
	}

	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
}

class Per extends Profile10 {
	//객체배열을 main 클래스말고 Per 클래스에서 선언 후 저장하기
	Person arr[];	//객체 배열 선언
	int n;
	
	Per(int n) {	//객체 배열에 저장
		arr = new Person[n];
	}
	
	void add(String name, String id) {
		arr[n] = new Person(name, id);
		n++;
	}
	
	//입력한 id에 맞는 이름 출력
	String check(String id) {	
		for(int i=0; i<n; i++ ) {
			if(id.compareTo(arr[i].getId()) ==0 ) {
				return arr[i].getName();
			}
		}
		return null;
	}	
}


public class CollEx10 {
	public static void main(String[] args) {

		Profile10 p = new Per(5);
		p.add("세종", "123");
		p.add("세조", "456");
		p.add("정조", "789");
		
		System.out.println(p.check("789"));
		System.out.println(p.check("456"));
		System.out.println(p.check("123"));
		
	}
}
