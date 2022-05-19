package constructor;

class Profile {
	String a;
	String b;
	
	Profile(String phone, String name){
		a = phone;		b = name;
//		this.a = a;		this.b = b;	
		//이름이 같을 경우는 this를 사용
	}
	
}

public class ProfileCtor {
	public static void main(String[] args) {
		Profile p1 = new Profile("010-1234-5678", "상우");
		Profile p2 = new Profile("010-9876-5432", "상우");
		
		System.out.println(p1.a +" "+ p1.b);
		System.out.println(p2.a +" "+ p2.b);
	}
}
