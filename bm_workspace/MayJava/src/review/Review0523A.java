package review;

import java.io.FileReader;

/*
 * 파일 읽어오기
public class Review0523A {
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
 */

/*
 * 1.	while문을 이용해 실수를 여러 개 입력받고 평균 출력
 * (-1 이 입력되면 입력을 종료시켜라)
public class Review0523A {
	public static void main(String[] args) throws Exception {
	
		Scanner sc = new Scanner(System.in);
		int num;
		int cnt=0;
		int sum=0;
		while (true) {
			num = sc.nextInt();
			if (num == -1) {
				break;
			}
			sum+=num;
			num++;
			cnt++;
		}
		System.out.println(sum/cnt);
	}
}
 */
/*
 * 1 - A
public class Review0523A {
	public static void main(String[] args) throws Exception {
	
		Scanner sc = new Scanner(System.in);
		double num=0, sum=0; 
		int cnt=0;
		while ((num = sc.nextDouble()) != -1) {
			sum+=num;
			num++;
			cnt++;
		}
		System.out.println(sum/cnt);
	}
}
*/

/*
 * 2. 3줄의 문자열을 test01.txt파일에 저장해라
 * 
public class Review0523A {
	public static void main(String[] args) throws Exception {
	
		FileWriter fr = new FileWriter("test01.txt");
		BufferedWriter out = new BufferedWriter(fr);
		out.write("Hi");
		out.newLine();
		out.write("저는 자바를 좋아하고 잘합니다.");
		out.newLine();
		out.write("앞으로 더 열심히 공부할 것입니다.");
		out.close();
		
		
	}
}

/*
 * 3. Scanner로 입력 받은 이름(문자열), id(문자열)를 
 * 	한 줄마다 파일(test02.txt)에 저장해라.
 * “그만” 입력하면 종료시켜라. 
 * “그만” 입력하기 전까지의 문자열을 파일에 저장해라.(break, FileWriter 사용)

public class Review0523A {
	public static void main(String[] args) throws Exception {
	
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(in);
		
		FileWriter fr = new FileWriter("test02.txt");
		PrintWriter pr = new PrintWriter(fr);
		
		String str = null;
		while((str=bfr.readLine()) != null) {
			if (str.equals("그만")) {
				break;
			}
			pr.println(str);
			
		}
		bfr.close();
		pr.close();
		
	}
}
*/
/*
 * 3 - A
public class Review0523A {
	public static void main(String[] args) throws Exception {
	
		FileWriter f = null;	//String 값 비우고
		
		//입력받고
		Scanner sc = new Scanner(System.in);
		String name="", id="";
		
		try {
			//파일 생성하고
			f = new FileWriter("test02.txt");
			
			while(true) {
				//이름과 id 값을 입력받고
				System.out.println("이름, id");
				name=sc.next();
				if(name.equals("그만")) {
					break;
				}
				id=sc.next();
				//파일에 저장
				f.write(name+" "+id);
			}
			f.close();
		} catch(Exception e) {}
	}
}
*/

/*
 * 3-1. 위에서 파일에 저장한 데이터들을 화면에 출력해라
 * (FileReader사용, int값으로 초기화해라)
 * 
public class Review0523A {
	public static void main(String[] args) throws Exception {
		
		FileReader in = new FileReader("test02.txt");
		
		int r = in.read();
		while(r != -1) {
			char str = (char) r;
			r = in.read();
			System.out.print(str);
		}
		
	}
}
*/
public class Review0523A {
	public static void main(String[] args) throws Exception {
		
		FileReader in = null;
		
		try {
			in = new FileReader("test01.txt");
			
			int r = in.read();
			while(r != -1) {
				char str = (char) r;
				//String은 기본타입이 아니라서 강제형변환이 안됨
				r = in.read();
				System.out.print(str);
			}
		} catch(Exception e) {}
		in.close();
		
	}
}
