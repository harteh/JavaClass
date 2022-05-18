import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


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
		try {
			FileWriter fw=new FileWriter("sample.txt");
			fw.write("HI 저는 자바가 재밋습니다.");
			fw.close();
		} catch (IOException e) {
			// 파일 생성이 안되었을 때 예외처리
			e.printStackTrace();
		}
		
		
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
			
		} catch (FileNotFoundException e) {
			// 읽어올 파일이 없을 때 예외 처리
			e.printStackTrace();
		}
		
		
		
		
		
		

	}//main end

}
