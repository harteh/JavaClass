package arraypart;
import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {

		//1.	1~10���� ���� ���ض�. (for, while, do~while)
		int sum=0;
		for (int i = 1; i <= 10; i++) {
			sum += i;			
		}
		System.out.println("1-1.��:" + sum);
		
		int i=1;
		sum = 0;
		while(i<=10) {
			sum+=i;
			i++;		// ������!!
		}
		System.out.println("1-2.��:" + sum);
		
		i=1;
		sum=0;
		do {
			sum+=i;
			i++;
		} while (i<=10);
		
		System.out.println("1-3.��:" + sum);
		System.out.println("************");
		
		//2. while���� �̿��Ͽ� ������ ���� �� �Է¹ް� ��� ����ض�. (0�� �ԷµǸ� �Է��� ����ȴ�.)
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		sum = 0;
		
//		int num;	//�Է¹޴� ��
//		while ((num=sc.nextInt())!=0) {
//			sum+=num;
//			cnt++;
//		}
		System.out.printf("��: %d ���: %.1f\n", sum, sum/(double)cnt);

		
//		while(true) {
//			int num=sc.nextInt();	
//			//while�� �ȿ��� �Է� �޾ƾ� ��!
//			//�ݺ��� �ۿ��� �Է¹����� �ݺ����� ������� ��� �Է¹ް� �ȴ�.
//			
//			if (num == 0) {
//				break;
//			} 
//			sum+=num;
//			cnt++;
//		}
//		
//		System.out.printf("��: %d ���: %d\n", sum, (sum/(double)cnt));
		System.out.println("************");

			i=0; sum=0;
			while( i<10){
				i=i+2;
				sum +=i;
			}
			System.out.println("���� ��:"+sum);

		//3-1. while(true)�� break�� ����Ͽ� �ٲ��.
		i=0;		sum=0;
		while(true) {
			i=i+2;
			sum+=i;
			if(i>=10) {	//��ȣ����! �ݺ����� ���ߴ� ����
				break;
			};
		}
		System.out.println("3-1 ��: "+sum);
		
		//3-2. do~while��, continue�� ����Ͽ� �ٲ��.
		i=0;		sum=0;
		do {
			i+=1;			//+1 �� �����ϸ� �������� ��ġ�� �����ؾ��Ѵ�.
			if(i%2 != 0) {	//¦���� �ƴϸ� �ǳʶٱ�.
				continue;
			}
			sum+=i;
		} while(i<10);			//�ݺ����� ����Ǵ� ����
		
		System.out.println("3-2 �� :"+sum);
		System.out.println("************");
		
		//4-1) 10���� ���ڸ� ������ �迭 a�� �����ϰ� �����ض�.
		char a[] = new char[10];
		
		//4-2) 0~4���� ���������� �ʱ�ȭ�� �迭 b�� �����ϰ� �����ض�.
		int b[] = {0,1,2,3,4};
		
		//4-3) ��java��, ��c��, ��c++���� �ʱ�ȭ�� �迭 c�� �����ϰ� �����ض�.
//		String c[] = {"java", "c", "c++"};
		String c[] = new String[] {"java", "c", "c++"};
		
		//4-4) �ε����� �ִ밪�� 9�� ������ �迭 d�� �����ϰ� �����ض�.
		int d[] = new int[10];

		//1-100���� �� 5�ǹ���̰� 10�� ����� ��(while, do-while, for)
		
		i = 1;	sum = 0;
		while(i <= 100) {
			if(i%5==0 && i%10==0) {
				sum+=i;
			}
			i++;
		}
		System.out.println("5-1.��: "+sum);
		
		i=0;		sum=0;
		do {
			i++;
			if (i%5==0 && i%10==0) {
				sum+=i;
			}
		} while(i<=100);
		System.out.println("5-2.��: "+sum);
		
		sum=0;
		for(i=0;i<=100;i++) {
			if(i%5==0 && i%10==0) {
				sum+=i;
			}
		}System.out.println(sum);
		
		
		
	}

}
