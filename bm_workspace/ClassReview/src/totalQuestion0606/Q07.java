package totalQuestion0606;

/*
 * TvŬ������ main()�� ���� TvŬ������ ��ӹ��� Tv1Ŭ������ �ۼ��Ͻÿ�
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
		 System.out.printf("%s %d��ġ Tv", name, super.intgetsize());
	 }
}


public class Q07 {
	public static void main(String[] args) {
		Tv1 t=new Tv1(20, "�Ｚ");
		t.show();	 //�Ｚ 20��ġ Tv ���
	}
}
