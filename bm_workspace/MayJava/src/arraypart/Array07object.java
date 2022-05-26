package arraypart;

class Num {
	int a;
	Num(int a){
		this.a=a;
	}
	int get() {
		return a;
	}
}

public class Array07object {
	public static void main(String[] args) {
//		Num n = new Num(1);
		
		Num[] arr = new Num[] {
				new Num(1),
				new Num(2),
				new Num(3)};
		
		for(Num n : arr) {
			System.out.println( n.get() );
		}
		
	}
}
