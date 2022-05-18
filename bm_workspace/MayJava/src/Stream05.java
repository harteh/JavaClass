import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;

public class Stream05 {

	public static void main(String[] args) throws Exception {
		// p.531 FileOutputStream
		
		//output2.txt 파일을 생성한다.
//		FileOutputStream fos = new FileOutputStream("output2.txt", true);
//		// 있는 파일에 이어서 작성할때 true를 넣는다.
//		
//		try(fos){
//			//26개 크기 바이트 배열을 만든다.
//			byte[] bs=new byte[26];
//			byte date = 65;
//			
//			//A~Z의 아스키 코드값을 넣어 출력할 바이트 배열을 만든다.
//			for(int i=0; i<bs.length; i++) {
//				bs[i]=date;
//				date++;
//			}
//			//전체 파이트 배열을 한꺼번에 출력(파일에 저장)함
//			fos.write(bs);
//			//fos.write(bs, 2, 10);		//bs배열의 인덱스 2에서 10개
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println("출력이 완료되었습니다.");
		
		
		//p.521	- 파일 생성
//		ByteArrayInputStream in=null;	//파일 읽어올때
//		FileOutputStream out=null;		
//		
//		try {
//			byte[] b=new byte[] {1,2,3};
//			in=new ByteArrayInputStream(b);		//byte 배열을 읽어와서
//			out=new FileOutputStream("g.dat");	//g.dat 파일을 생성
//			
//			int r=-1;
//			while((r=in.read()) != -1) {
//				out.write(r);
//			}
//			
//		} catch (Exception e) {}
//		out.close();
//		in.close();
		
		
		// 파일 읽어오기
		/*
		 * 파일을 열고
		 * 파일 속 데이터를 바이트 배열스트림에 담기 위해 배열을 생성.
		 * 데이터가 없을때까지,
		 * 데이터를 읽어와서 바이트 배열에 저장한다.
		 * 바이트 배열 만큼 for문으로 반복하며 화면에 출력한다.
		 *  
		 */
		FileInputStream in = null;
		ByteArrayOutputStream out = null;
		
		try {
			//g.dat 파일을 읽어와서
			in = new FileInputStream("g.dat");
			
			//바이트 배열에 저장하겠다. (배열 생성)
			out = new ByteArrayOutputStream();
			
			int r=-1;
			while((r=in.read()) != -1) {
				out.write(r);	//배열에 저장함 1,2,3
			}
			byte[] b=out.toByteArray();
			//.toByteArray() = Creates a newly allocated byte array.
			
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		out.close();
		in.close();
		
		
	}//main End.

}
