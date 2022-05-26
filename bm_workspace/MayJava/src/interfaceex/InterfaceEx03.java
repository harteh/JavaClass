package interfaceex;

class Tv {
	public void on() {
		System.out.println("Ƽ�� �Ҵ�");
	}
}

interface Computer {
	public void m();
}

class Com {
	public void m() {
		System.out.println("��");
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
		Tv t = ipad;	//��ĳ����
		Computer c = ipad;	//��ĳ����
				
		ipad.ip();
		//System.out.println("��");
		//System.out.println("Ƽ�� �Ҵ�");
		
		c.m();
		//System.out.println("��");

	}
}
