package streampart;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Stream08 {

	public static void main(String[] args) throws IOException {
		
		// 파일생성 - FileWriter
//		FileWriter f=new FileWriter("system.dat");
//		BufferedWriter b=new BufferedWriter(f);
//		
//		char a[]=new char[] {'목', '요', '일'};
//		
//		b.write(a);
//		b.close();

		// 파일에 데이터 저장해서 생성하기 - FileOutputStream
//		byte[] b= {7,38,36,29,64};
//		
//		FileOutputStream f=new FileOutputStream("test.txt");	//저장용 파일을 생성한다
//		
//		for(int i=0; i<b.length; i++) {
//			f.write(b[i]);	//파일에 b배열 데이터를 저장한다. 
//		}
//		f.close();
//		System.out.println("데이터 저장함-프로그램 종료");
		
		
		System.out.println("****************************************");
		
		// 파일 불러와서 보여주기 - FileInputStream
//		byte[] b=new byte[5];	
//		//빈 배열을 설정
//		//읽어올 데이터의 크기를 모를때 BufferedReader 사용??
//		
//		try {
//			FileInputStream in=new FileInputStream("test.txt");	//읽어올 파일을 지정한다.
//			int n=0, r;
//			
//			while ((r=in.read()) != -1) {
//				b[n] = (byte)r;	//읽은 바이트를 배열에 저장
//				n++;
//			}
//			for (int i = 0; i < b.length; i++) {
//				System.out.println(b[i]+" ");
//			}
//			in.close();
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		
		// 저장되어 있는 파일 불러와서 보여주기(출력) - FileReader
//		char arr[]=new char[10];
//		int r;
//
//		try {
//		    FileReader in = new FileReader("c.txt");
//		    //파일에 저장한 문자를 읽어들여서
//		    try {
//		        r = in.read(arr, 0, arr.length);
//		        //배열의 0부터 길이만큼 읽어와서 r 에 저장한다.
//
//		        for(int i=0; i<r; i++) {
//		            System.out.println(arr[i]);
//		        }
//
//		    } catch (IOException e) {
//		        // TODO Auto-generated catch block
//		        e.printStackTrace();
//		    }
//
//		} catch (Exception e) {
//		    // 파일이 없을 때 예외처리
//		    e.printStackTrace();
//		}
		
		
		// 파일 불러와서 출력하기 - BufferedReader
		try {
		    BufferedReader in=new BufferedReader(new FileReader("c.txt"));

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
