package review;

import java.io.BufferedReader;
import java.io.FileReader;

/*
 * ���� �о����
 */
public class Review0523 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader bfr = new BufferedReader(new FileReader("f.txt"));
		String str;
		while(true) {
			if((str = bfr.readLine())==null) {
				break;
			}
			System.out.println(str);
		}
		bfr.close();

	}
}
