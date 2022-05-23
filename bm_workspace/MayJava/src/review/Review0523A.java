package review;

import java.io.FileReader;

/*
 * ���� �о����
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
 * 1.	while���� �̿��� �Ǽ��� ���� �� �Է¹ް� ��� ���
 * (-1 �� �ԷµǸ� �Է��� ������Ѷ�)
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
 * 2. 3���� ���ڿ��� test01.txt���Ͽ� �����ض�
 * 
public class Review0523A {
	public static void main(String[] args) throws Exception {
	
		FileWriter fr = new FileWriter("test01.txt");
		BufferedWriter out = new BufferedWriter(fr);
		out.write("Hi");
		out.newLine();
		out.write("���� �ڹٸ� �����ϰ� ���մϴ�.");
		out.newLine();
		out.write("������ �� ������ ������ ���Դϴ�.");
		out.close();
		
		
	}
}

/*
 * 3. Scanner�� �Է� ���� �̸�(���ڿ�), id(���ڿ�)�� 
 * 	�� �ٸ��� ����(test02.txt)�� �����ض�.
 * ���׸��� �Է��ϸ� ������Ѷ�. 
 * ���׸��� �Է��ϱ� �������� ���ڿ��� ���Ͽ� �����ض�.(break, FileWriter ���)

public class Review0523A {
	public static void main(String[] args) throws Exception {
	
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(in);
		
		FileWriter fr = new FileWriter("test02.txt");
		PrintWriter pr = new PrintWriter(fr);
		
		String str = null;
		while((str=bfr.readLine()) != null) {
			if (str.equals("�׸�")) {
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
	
		FileWriter f = null;	//String �� ����
		
		//�Է¹ް�
		Scanner sc = new Scanner(System.in);
		String name="", id="";
		
		try {
			//���� �����ϰ�
			f = new FileWriter("test02.txt");
			
			while(true) {
				//�̸��� id ���� �Է¹ް�
				System.out.println("�̸�, id");
				name=sc.next();
				if(name.equals("�׸�")) {
					break;
				}
				id=sc.next();
				//���Ͽ� ����
				f.write(name+" "+id);
			}
			f.close();
		} catch(Exception e) {}
	}
}
*/

/*
 * 3-1. ������ ���Ͽ� ������ �����͵��� ȭ�鿡 ����ض�
 * (FileReader���, int������ �ʱ�ȭ�ض�)
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
				//String�� �⺻Ÿ���� �ƴ϶� ��������ȯ�� �ȵ�
				r = in.read();
				System.out.print(str);
			}
		} catch(Exception e) {}
		in.close();
		
	}
}
