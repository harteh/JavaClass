package streampart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Rec implements Serializable{
	int a, b;
	//객체를 파일에 저장: 직렬화
	//파일에 저장한 객체를 읽어옴: 역직렬화
	
	Rec(int a, int b){
		this.a=a; this.b=b;
	}
	void show() {
		System.out.println(a+" "+b);
	}
}

public class Stream10 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		//객체를 파일에 저장하기
		ObjectOutputStream os = null;
		os = new ObjectOutputStream(new FileOutputStream("obj.dat"));
		
		//객체저장
		os.writeObject(new Rec(4,7));
		os.writeObject(new Rec(8,5));
		os.writeObject(new String("glgl"));
		
		os.close();
		
		
		
		//저장된 파일을 읽어오기
		ObjectInputStream in = 
				new ObjectInputStream(new FileInputStream("obj.dat"));
		
		//object -> 최고조상이므로 다운캐스팅
		Rec r1 = (Rec)in.readObject();
		Rec r2 = (Rec)in.readObject();
		String r3 = (String)in.readObject();

		//객체를 이용해 출력함수에 접근
		r1.show();
		r2.show();
		System.out.println(r3);
		
		in.close();
		
		
		
	}
}
