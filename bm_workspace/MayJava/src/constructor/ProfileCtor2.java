package constructor;

class Profile2{
	String a;	//전화번호
	String b;	//이름
	
	Profile2(String a, String b){
		this.a = a;		this.b = b;
	}
	
	Profile2(){}
	
	
}

public class ProfileCtor2 {
	public static void main(String[] args) {
		Profile2 p1 = new Profile2("010-1234-5678", "세종");
		Profile2 p2 = new Profile2("010-9876-5432", "정조");
		Profile2 p3 = new Profile2();
		
		System.out.println(p1.a +" "+p1.b);
		System.out.println(p2.a +" "+p2.b);
	}
}
