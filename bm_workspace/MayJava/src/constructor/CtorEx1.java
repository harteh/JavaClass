package constructor;

public class CtorEx1 {
	
	int r;
	String name;
	
	public double area() {
		return 3.14*r*r;
	}
	
	CtorEx1(){
		r=1;
		name="";
	}
	
	CtorEx1(int a, String b){
		r=a;	name=b;
	}

	//∏ﬁ¿Œ
	public static void main(String[] args) {
		CtorEx1 ctor1 = new CtorEx1(5, "C++");
//		ctor1.r=10;
//		ctor1.name="java";
		
		System.out.println(ctor1.area());
		double area = ctor1.area();
		System.out.println( ctor1.name +", "+ area );
		
		CtorEx1 ctor2 = new CtorEx1();
		ctor2.name = "db";
		System.out.println( ctor2.name +", "+ area );
		
		
	}
	
}


/*
 * public class Test {
	
	int r;
	String name;
	
	public double area() {
		return 3.14*r*r;
	}
	
	Test(int a, String b){
		r=a;
		name=b;
	}
	
	Test(){
		r=1;
		name="";
	}

	public static void main(String[] args) {
		
		Test t=new Test(10,"java");
		//t.r=10;
		//t.name="java";
		
		System.out.println(t.name+" "+t.area());
		
		Test t2=new Test();
		t2.name="db";
		System.out.println(t2.name+" "+t2.area());
		
	}
	*/
