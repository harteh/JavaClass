package interfaceex;

class Tv {
	public void on() {
		System.out.println("티비를 켠다");
	}
}

interface Computer {
	public void m();
}

class Com {
	public void m() {
		System.out.println("컴");
	}
}

class Ipad extends Tv implements Computer {	
	
	Com c = new Com();
	
	public void m() {
		c.m();		
	}
	public void ip() {
		m();
		on();
	}
}


public class InterfaceEx03 {
	public static void main(String[] args) {
		
		Ipad ipad = new Ipad();
		Tv t = ipad;	//업캐스팅
		Computer c = ipad;	//업캐스팅
				
		ipad.ip();
		//System.out.println("컴");
		//System.out.println("티비를 켠다");
		
		c.m();
		//System.out.println("컴");

	}
}
