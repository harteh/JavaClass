package review;

/*
 * 1. 실행결과) 영화를 재생합니다.영화를 재생합니다. 영화를 재생합니다.
              	음악을 재생합니다. 음악을 재생합니다. 음악을 재생합니다.
				(th2가 먼저 나올수도 있음, 세번씩 출력)
 */
public class Review0608A {
	public static void main(String[] args) {

		   Thread th1=new MovieThread();
		   th1.start();
		   Thread th2=new Thread(new MusicThread());
		   th2.start();
	}
}
