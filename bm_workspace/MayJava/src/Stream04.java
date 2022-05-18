import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * 입출력스트림 : 응용프로그램과 입출력장치를 연결하는 소프트웨어 모듈
 * 입력 -> 입력스트림 -> 자바응용프로그램 -> 출력스트림 -> 출력
 * 
 * 문자스트림/바이트스트림
 * 
 * 입력받는 상황
 * 1. Scanner
 * 2. InputStreamReader(많이 쓰임)
 * 
 * InputStreamReader
 * : 바이트 스트림에서 문자 스트림으로의 다리.
 * : For top efficiency, consider wrapping an InputStreamReader within a BufferedReader.
 * BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 * 
 *
 */
public class Stream04 {

	public static void main(String[] args) {

		//파일 생성
//		try {
//			FileWriter fw = new FileWriter("hi.txt");
//			fw.write("안녕하세요");
//			fw.close();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("프로그램종료");
		
		
		//파일 읽어오기
//		try {
//			FileReader fr=new FileReader("hi.txt");
//			int i;
//			while((i=fr.read()) != -1) {
//				System.out.print((char)i);
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		//파일 읽어오기
//		try {
//			BufferedReader br=new BufferedReader(new FileReader("hi.txt"));
//			try {
//				String str;
//				while(true) {
//					str = br.readLine();
//					if( str==null) {
//						break;
//					}
//					System.out.println(str);
//				}
//				
//			} catch (IOException e) { // 읽어올 데이터가 없을 때 예외처리
//				e.printStackTrace();
//			}
//			
//		} catch(FileNotFoundException e) {	//열어올 파일이 없을 때 예외처리
//			e.printStackTrace();
//		}
		
		
		//콘솔에 입력한 값을 문서로 생성하기
		BufferedReader bu=null;		//입력하기 위한 문자형 입력 스트림
		PrintWriter pr=null;		//출력하기 위한 문자형 출력 스트림
		
		try {
			
			//콘솔에 입력하기 위해 Scanner 대신 사용
			InputStreamReader in=new InputStreamReader(System.in);
			
			//입력받은 값을 문자형 입력 스트림에 저장한다.
			bu=new BufferedReader(in);
			
			//BufferedReader bu=new BufferedReader(new InputStreamReader(System.in)); 
			//위와 동일
			
			FileWriter fw=new FileWriter("d.txt");
			
			//d.txt에 저장
			pr = new PrintWriter(fw);
			
			String str=null;
			while((str=bu.readLine()) != null) {
				//파일에 저장
				pr.println(str);
			}
			bu.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			pr.close();
		}
		
		
		
		
		

	}

}
