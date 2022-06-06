package totalQuestion0606;

/*
 * Tv클래스와 main()를 보고 Tv클래스를 상속받은 Tv1클래스를 작성하시오
 */

class Tv {
	private int size;
	
	Tv(int size){
		this.size=size; 
	}
	
	protected int intgetsize(){
		return size; 
	}
}

class Tv1 extends Tv {
	private String name;
	
	Tv1(int size, String name){
		super(size);
		this.name = name;
	}
	 void show() {
		 System.out.printf("%s %d인치 Tv", name, super.intgetsize());
	 }
}


public class Q07 {
	public static void main(String[] args) {
		Tv1 t=new Tv1(20, "삼성");
		t.show();	 //삼성 20인치 Tv 출력
	}
}
