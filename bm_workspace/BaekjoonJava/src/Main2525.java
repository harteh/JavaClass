import java.util.Scanner;

public class Main2525 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//���� �ð�(a�� b��)
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		//�丮�ϴ� �� �ʿ��� �ð�(�� ����)
		int c=sc.nextInt();
		
		//�丮�� �ð��� ����, ��=��, ������=�� �� ����
		a += c / 60;
		b += c % 60;
		
		//23�� 59�п��� 1���� �� ������ 0�� 0���� �ȴ�.
		if(b > 59) {
			a+=1;
			b-=60;
		}
		if(a > 23) {
			a-=24;
		}
		
		
		System.out.println(a +" "+ b);
		

	}

}
