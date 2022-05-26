package stringex;

public class StrEx02buffer {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Java");
		
		sb.append(" is very good");	//Java is very good
		//가장 끝에 추가한다. 
		sb.insert(0, "A ");			//A Java is very good
		sb.replace(2, 6, "Html");	//A Html is very good
		System.out.println(sb);
		
		System.out.println("****************");
				
	}
}
