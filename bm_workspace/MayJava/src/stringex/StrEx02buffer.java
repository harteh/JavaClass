package stringex;

public class StrEx02buffer {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Java");
		
		sb.append(" is very good");	//Java is very good
		//���� ���� �߰��Ѵ�. 
		sb.insert(0, "A ");			//A Java is very good
		sb.replace(2, 6, "Html");	//A Html is very good
		System.out.println(sb);
		
		System.out.println("****************");
				
	}
}
