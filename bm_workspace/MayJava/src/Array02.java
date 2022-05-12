/**
 * 배열 api
 * https://docs.oracle.com/javase/8/docs/api/index.html
 * 
 * for-each문
 * - 배열의 각 요소를 순차적으로 접근한다.
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
		
		String fruit[] = {"바나나", "딸기", "사과"};
		for(String i : fruit) {
			System.out.print(i);
		}
		System.out.println();
		
		System.out.println("******  ******");
		

	}

}
