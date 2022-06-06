package totalQuestion0606;

/*
 * ���� main()�� ���� �߻� Ŭ������ �߻�޼ҵ带 �ۼ��Ͻÿ�
	(total �Լ��� �迭 ��(1,2,3,4,5) ���� ���Ϲ޴� �Լ�)
 */

abstract class Ab {
	abstract int total(int[] a);
}

class Cd extends Ab {
	@Override
	int total(int[] a) {
		int sum=0;
		for(int i=0; i< a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
}

public class Q14 {
	public static void main(String[] args) {

		Ab c=new Cd();
		System.out.println( c.total(new int []{1,2,3,4,5,}) );
		
	}
}
