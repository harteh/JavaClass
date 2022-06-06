package totalQuestion0606;

/*
 * 다음 main()를 보고 추상 클래스와 추상메소드를 작성하시오
	(total 함수는 배열 값(1,2,3,4,5) 총합 리턴받는 함수)
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
