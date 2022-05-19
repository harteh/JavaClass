package streampart;
import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader: 파일 읽기
 * -- read() : 파일 속 데이터 읽기
 * -- 파일의 크기가 큰 경우, 한 글자씩 읽어오면 속도가 느려지기 때문에 
 * 		배열에 담아서 하거나, buffered를 이용해도 된다.
 * -- close() : 스트림 닫아주기
 * 
 * FileWriter : 파일 출력, 파일에 텍스트 저장
 * -- .writer() : 파일에 데이터 저장하기
 * -- close() : 스트림 닫기
 * 
 * FileOutputStream
 * 
 *
 */

public class Stream07 {

	public static void main(String[] args) {
		
		//키보드로부터 읽는 문자 입력 스트림 생성
//		InputStreamReader in=new InputStreamReader(System.in);
//		
//		//입력을 파일에 저장
//		FileWriter fw = null;
//		
//		int r;
//		try {
//			fw = new FileWriter("e.txt");
//			
//			while((r=in.read()) != -1) {
//				fw.write(r);
//			}
//			in.close();
//			fw.close();
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		
		/*
		 * sample.txt를 만들어
		 * "HI 저는 자바가 재밋습니다."
		 * 라는 문자열을 한줄로 읽어 화면에 출력해라
		*/
		
		//파일 생성 1.
//		try {
//			FileWriter fw=new FileWriter("sample.txt");
//			fw.write("HI 저는 자바가 재밋습니다.");
//			fw.close();
//		} catch (IOException e) {
//			// 파일 생성이 안되었을 때 예외처리
//			e.printStackTrace();
//		}
		
		
		//파일 생성 2.
		/*
		 * 콘솔에 입력한 문자열을 sample.txt 파일에 저장
		 */
		
//		BufferedReader bur=null;	//데이터를 읽어오기 위한 스트림
//		PrintWriter pr=null;		//화면에 출력하기 위한 스트림
//		
//		try {
//			//콘솔에 데이터를 입력받음
//			bur = new BufferedReader(new InputStreamReader(System.in));
//			
//			//sample.txt 파일을 생성하고,
//			FileWriter fw = new FileWriter("sample.txt");
//			//출력할 파일을 출력스트림에 저장한다.
//			pr = new PrintWriter(fw);
//			
//			//
//			String str=null;
//			while((str=bur.readLine()) != null) {
//				pr.println(str);
//			}
//			bur.close();
//			
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		pr.close();
		
		
		
		
		
		//파일 읽어오기 1.
		try {
			BufferedReader fr = new BufferedReader(new FileReader("sample.txt"));
			String str;
			
			while(true) {
				try {
					str = fr.readLine();
					
					if(str == null) {
						break;
					}
					System.out.println(str);
					
				} catch (IOException e) {
					// 읽어올 데이터가 없을 때 예외 처리
					e.printStackTrace();
				}
			}
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// 읽어올 파일이 없을 때 예외 처리
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		

	}//main end

}
