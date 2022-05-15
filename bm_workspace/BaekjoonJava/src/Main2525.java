import java.util.Scanner;

public class Main2525 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//현재 시각(a시 b분)
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		//요리하는 데 필요한 시간(분 단위)
		int c=sc.nextInt();
		
		//요리한 시간을 나눠, 몫=시, 나머지=분 에 저장
		a += c / 60;
		b += c % 60;
		
		//23시 59분에서 1분이 더 지나면 0시 0분이 된다.
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
