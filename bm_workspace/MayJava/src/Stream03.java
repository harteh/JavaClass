import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Stream03 {

	public static void main(String[] args) {
		// p.538
		
		//파일 생성
//		try {
//			FileWriter fw=new FileWriter("writer.txt"); //파일'writer.txt' 생성
//			
//			fw.write('A'); //문자 하나 출력
//			char buf[]= {'B','C','D','E','F','G'};
//			
//			fw.write(buf); //문자 배열 출력
//			fw.write("안녕하세요. 생성테스트입니다."); //문자열 출력
//			fw.write(buf, 3, 2);	//EFG //문자 배열의 일부 출력
//			//문자배열명, 시작인덱스, 출력개수
//			
//			fw.write("97"); //숫자를 그대로 출력
//			fw.close();
//			
//		} catch (IOException e) {
//			// 생성된 파일이 없는 예외 처리
//			e.printStackTrace();
//		}
		
		
		/*
		 * 파일을 읽어온다 -> 파일이 없을때의 예외처리
		 * 	문자단위로 한꺼번(배열기능)에 읽을 수 있는 BufferedReader 사용 
		 * *
		 * 문서 범위 안에서 
		 * 줄단위로 데이터를 읽어와서 저장한다. ->데이터가 없을 때의 예외 처리
		 * 저장한 데이터를 출력한다.
		 */
		
//		try {
//			BufferedReader in=new BufferedReader(new FileReader("writer.txt"));
//			
//			String str;
//			
//			while(true) {
//				try {
//					str=in.readLine();
//					if(str == null) {
//						break;
//					}
//					System.out.println(str);
//					
//				} catch (IOException e) {
//					// 읽어올 데이터가 없을때의 예외 처리
//					e.printStackTrace();
//				}
//			}
//			
//		} catch (FileNotFoundException e) {
//			// 파일이 없을 때의 예외 처리
//			e.printStackTrace();
//		}//BufferedReader 사용
		
		
		try {
			FileReader fr=new FileReader("writer.txt");
			int i;
			while((i=fr.read())!= -1) {
				System.out.print((char)i);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}//FileReader 사용
		

	}

}
