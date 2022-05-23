package inheritance;

class Circle {
	private int r;	//�ʵ� (�ν��Ͻ� ����)
	
	public Circle(int r) {	//������
		this.r = r;
	}
	int get() {	//�޼���
		return r;
	}
}

class NCircle extends Circle {
	String color;
	NCircle(int r, String c){
		super(r);	//�θ� �����ڸ� ȣ���ϴ� ��(line 6)
		color = c;
	}
	void show() {
		System.out.println("������: " + get() +", "+ color +"��");
	}
}

public class InherEx5 {
	public static void main(String[] args) {
		NCircle n = new NCircle(10, "red");
		n.show();	//������ 10 red��
	}
}
