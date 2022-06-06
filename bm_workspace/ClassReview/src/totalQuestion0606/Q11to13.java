package totalQuestion0606;

/*
 * 11.	Boolean 값 false를 “false”라는 문자열로 변환해라.
 * 12.  문자열 “36.5”를 double 타입 실수로 변환해라.
 * 13.  문자열 “35”를 정수 35로 변환해라.
 */
public class Q11to13 {
	public static void main(String[] args) {
		// 11
		Boolean b1 = false;
		String str = b1.toString();
		System.out.println(str + str);	//falsefalse

		// 12
		String str1 = "36.5";
		Double d1 = Double.parseDouble(str1);
		System.out.println(str1 + str1);	//36.536.5
		System.out.println(d1 + d1);		//73.0
		
		// 13
		String str2 = "36";
		Integer i1 = Integer.parseInt(str2);
		System.out.println(i1 + i1);		//72
	}
}
