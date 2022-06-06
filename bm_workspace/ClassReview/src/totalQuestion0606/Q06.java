package totalQuestion0606;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 6.	Scanner로 입력 받은 이름(문자열), id(문자열)를 한 줄마다 파일(test02.txt)에 저장해라.
	“그만” 입력하면 종료시켜라. 
	“그만” 입력하기 전까지의 문자열을 파일에 저장해라.(break, FileWriter 사용)
		실행 결과) 홍길동 hong
		이길동 lee
		그만	
 */
public class Q06 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		FileWriter fw = new FileWriter("test02.txt");
		
		while(true) {
			String name = sc.next();
			if(name.equals("그만")) {
				break;
			}
			else {
				String uid = sc.next();
				fw.write(name +" " + uid+"\r\n");
			}
		}
		fw.close();
		sc.close();
	}
}
