package review;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Review0519D {

	public static void main(String[] args) throws IOException {
		/*
		 * Sample1.txt 파일에
		 * "저는 자바를 좋아합니다"를 저장하고
		 * 파일을 읽어 화면에 출력해라
		 * (String[] 배열로 초기화해서 for문으로 읽기) 
		 */
		
		String[] arrS = {"저는 자바를 좋아합니다. 수정 끝"};
		
		//파일 생성
		BufferedWriter bfw = new BufferedWriter(new FileWriter("Sample1.txt"));
		
		for (int i = 0; i < arrS.length; i++) {
			bfw.write(arrS[i]);
		}
		bfw.close();
		
		//파일 불러오기
		BufferedReader br = new BufferedReader(new FileReader("Sample1.txt"));
		
		String str;
		
		for(;;) {
			str=br.readLine();
			if(str==null) { break; }
			System.out.println(str);
		}
		br.close();
		
		
		

	}

}
