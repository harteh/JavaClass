import java.util.Scanner;

/**
 * 문자열
 * 
 * split(String regex)
 * - split 메소드는 문자열을 특정 구분자로 분리하는 메소드이다.
 * - Splits this string around matches of the given regular expression.
 * 
 * substring(int beginIndex, int endIndex)
 * - substring은 문자열 중 특정 부분을 뽑아낼 경우에 사용한다
 * - Returns a string that is a substring of this string.
 * 
 * replace(char oldChar, char newChar)
 * - 문자열 대체
 * - Returns a string resulting from replacing all occurrences of oldChar 
 *   in this string with newChar.
 * 
 * concat(String str)
 * - 문자열 연결
 * - Concatenates the specified string to the end of this string. 
 * 
 * length()
 * - 문자열 길이
 * - Returns the length of this string.
 * 
 * compareTo(String anotherString)
 * - 두 문자열을 비교
 * - Compares two strings lexicographically.
 *
 */
public class String01 {

	public static void main(String[] args) {

		String str = "오늘은 목요일, 공부하고 티비봄!!";
		
		System.out.println("****** split ******");
		String a[] = str.split(",");	// , 를 기준으로 문자열을 잘라서 배열a에 저장한다.
		System.out.println(a[0]);	//오늘은
		
		for(String b : a) {
			System.out.println(b);
		}
		
		System.out.println("****** substring ******");
		String c=str.substring(4,7);	//인덱스 4부터 6까지 출력
		System.out.println(c);	//목요일
		
		System.out.println("****** replace ******");
		String b=str.replace("공부", "study");
		System.out.println(b);
		
		System.out.println("****** concat ******");
		String str1 = str.concat("내일은 금요일");	//문자열 연결
		System.out.println(str1);
		
		
		System.out.println("****** .length() ******");
		
		Scanner sc = new Scanner(System.in);
//		String d = sc.next();
//		String e = sc.next();
//		
//		if(d.length() < e.length()) {
//			System.out.println(e);
//		} else {
//			System.out.println(d);
//		}
		
		
		System.out.println("****** compareTo ******");
		String f = "c apple";
		String g = "banana";
		
		if (f.compareTo(g) > 0) {		// f>g : f가 g보다 (사전에)나중에 나옴
			System.out.println(f);
		} else if (f.compareTo(g) < 0) {// g가 f보다 (사전에)나중에 나옴
			System.out.println(g);
		} else { //0이면 같은 문자열
			System.out.println("같은 문자열");
		}
		
		
		
		
	}

}
