package object;


class In {
	private int num;
	In(int num){
		this.num = num;
	}
	
	public String toString() {	//������ �Ͽ�
		return num +" ";		//���ڿ� ��ȯ
	}
}



public class ObjEx01 {
	public static void main(String[] args) {
		In i = new In(4);
		System.out.println(i);
		
	}
}
