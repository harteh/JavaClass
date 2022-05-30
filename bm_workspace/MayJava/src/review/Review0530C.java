package review;

/*
 * 5 ������ Person�������̽��̴�. Worker, StudentŬ���� �ۼ��ض�

interface Person2 {
	String work();
}

class Worker2 implements Person2 {
	public String work() {
		return "���Ѵ�";
	}
}

class Student2 implements Person2 {
	public String work() {
		return "�����Ѵ�";
	}
}

public class Review0530C {
	static void pr(Person2 p) {		//�������ε�
		System.out.println(p.work());
	}
	
	public static void main(String[] args) {
		pr(new Worker2());	//���Ѵ�
		pr(new Student2());	//�����Ѵ�.
	}
}
*/

/*
 * 6 main()�� ���� �߻� Ŭ������ �߻�޼ҵ� �ۼ��ض�
 * (total �Լ��� �迭 ��(1,2,3,4,5) ���� ���Ϲ޴� �Լ�)
 */
abstract class Ab {
	abstract int total(int arr[]);
}
class Cd extends Ab {
	int total(int arr[]) {
		int sum=0;
		for(int aa:arr) {
			sum+=aa;
		}
		return sum;
	}
}

public class Review0530C {
	public static void main(String[] args) {
		Ab c = new Cd();
		System.out.println(c.total(new int[] {1,2,3,4,5}));
	}
}
