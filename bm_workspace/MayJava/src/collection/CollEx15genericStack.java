package collection;

class St<T> {
	int n;
	Object[] st;	//배열, 반환형은 Object
	
	St(){
		st = new Object[3];		//생성자에서 객체(배열)생성
		n=0;
	}
	
	public void push(T item) {
		if(n==3)	//스택이 가득 차있다. 더이상 요소를 삽입 불가
			return;	//push 함수 종료
		
		st[n] = item;	//item을 배열에 추가
		n++;			//인덱스 증가
	}
	
	//스택에서 꺼내기
	public T pop() {
		if(n==0)	//스택이 비어있어 꺼낼 수 없다.
			return null;	//반환형이 T 이기 때문에 null
							//null : 레퍼런스 타입의 값으로 사용가능하다.
		n--;	//인덱스가 하나씩 줄어들면서
		return (T)st[n];	//배열 전체를 반환받는다.
				//st[] 은 Object이므로 T 형으로 다운캐스팅 해야한다.
	}
}

public class CollEx15genericStack {
	public static void main(String[] args) {
		
		St<String> s = new St<String>();
		s.push("java");
		s.push("db");
		s.push("C++");
		
		for(int i=0; i<3; i++) {
			System.out.println( s.pop() );
		}
		
		System.out.println("***** Integer *****");
		//Integer로 구체화시켜 저장해서 출력
		St<Integer> s1 = new St<Integer>();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		
		for(int i=0; i<3; i++) {
			System.out.println( s1.pop() );
		}
		
		
	}
}
