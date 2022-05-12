/**
 * �迭 api
 * https://docs.oracle.com/javase/8/docs/api/index.html
 * 
 * for-each��
 * - �迭�� �� ��Ҹ� ���������� �����Ѵ�.
 * 
 * for(int i : num){}
 *
 */
public class Array02 {

	public static void main(String[] args) {
		
		int []num= {1,2,3,4,5};
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}
		System.out.println();
		
		for(int i : num) {
			System.out.print(i);
		}
		System.out.println();
		
		String fruit[] = {"�ٳ���", "����", "���"};
		for(String i : fruit) {
			System.out.print(i);
		}
		System.out.println();
		
		System.out.println("******  ******");
		

	}

}
