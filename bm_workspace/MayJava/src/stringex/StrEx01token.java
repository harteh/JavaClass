package stringex;

import java.util.StringTokenizer;

public class StrEx01token {
	public static void main(String[] args) {

		String str="id=123#name=gildong#addr=seoul";
		//#을 기준으로 문자열 나누기
		
		StringTokenizer s = new StringTokenizer(str, "#");
		int n = s.countTokens();	//구분자로 나눈 갯수
		System.out.println(n);
		
		while(s.hasMoreTokens()) {
			String a = s.nextToken();
			System.out.println(a);
		}
		
//		String arr[] = str.split("#");
//		for (String s1 : arr) {
//			System.out.println(s1 +"");
//		}
		
	}
}
