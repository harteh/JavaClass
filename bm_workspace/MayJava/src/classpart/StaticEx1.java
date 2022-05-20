package classpart;
/*
 * static 변수는 변수가 선언된 클래스의 모든 인스턴스가 공유하는 변수이다.
 * 인스턴스 생성전에 static 변수가 먼저 생성
 */

/*
 * 1
class A{
	static int n=100;
	//메모리 공간에 공유된다.
	//static 이 없으면 초기화된다.
	
	
	A(){
		n++;
		System.out.println(n);
	}
}

public class StaticEx1 {
	public static void main(String[] args) {
		A a1=new A();
		A a2=new A();
		A a3=new A();
	}
}
 */

class A{
	static int num=0;
	A(){
		in();
	}
	public void in() {
		num++;
	}
}

public class StaticEx1 {
	public static void main(String[] args) {
		
		A a=new A();
		a.num++;	//인스턴스로 static 호출
		A.num++;	//클래스로 static 호출
		System.out.println(A.num);
	}
}
