package streampart;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * BufferedWriter(보조스트림)
 * 	: 문자로 쓸 때 배열을 제공하여 한꺼번에 쓸 수 있는 기능을 제공
 *  
 *  .readLine();
 *   : 줄 대로 읽어온다.
 *
 */

public class Stream02 {

	public static void main(String[] args) {

		// 문서에 데이터 저장
//		try {
//			FileWriter fw=new FileWriter("b.txt");	//b.txt파일 생성됨
//
//			//p.536
//			BufferedWriter out=new BufferedWriter(fw);	//보조스트림
//			out.write("안녕~");
//			out.newLine();	//줄바꿈
//			out.write("오늘은 화요일~");
//			out.newLine();
//			out.write("stream@naver.com");
//			out.close();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		//콘솔에 출력
		try {
			BufferedReader in=new BufferedReader(new FileReader("b.txt"));
			
			String str;
			
			while(true) {
				try {
					str=in.readLine();
					
					if(str==null) {
						break;	//무한루프 끝내기
					}
					System.out.println(str); //파일 데이터를 읽어와서 출력
					
				} catch (IOException e) { //파일에 데이터가 없을 때 예외
					e.printStackTrace();
				}
			}
			
			try {	
				in.close();
				
			} catch (IOException e) { //문서가 닫히지 않았을 때 예외
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {	//읽어올 파일이 없을 때 예외
			e.printStackTrace();
		}
		
		
		
	}

}
