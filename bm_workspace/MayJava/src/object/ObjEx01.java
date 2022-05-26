package object;


class In {
	private int num;
	In(int num){
		this.num = num;
	}
	
	public String toString() {	//재정의 하여
		return num +" ";		//문자열 반환
	}
}



public class ObjEx01 {
	public static void main(String[] args) {
		In i = new In(4);
		System.out.println(i);
		
	}
}
