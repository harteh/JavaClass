package totalRe0531;

import java.io.IOException;

/*
 * p.322-325
 * 고객센터로 전화가 오면 대기열에 저장됨
 * 상담원이 지정되기 전까지 대기상태.
 * 각 전화를 상담원에게 배분
 * 	1. 순서대로 배분하기: 모든 상담원 동일 상담건수 처리
 * 	2. 짧은 대기열 찾아 배분: 상담하지않는 상담원이나 가장 짧은 대기열을 보유한 상담원 배분
 *  3. 우선순위 배분: 고객 등급에 따라 등급 높은 고객을 우선, 업무 능력이 좋은 상담원에게 우선배분
 */  
 /*  인터페이스
 *  	- 다음 전화를 가져오는 기능
 *  	- 상담원에게 전화 배분하는 기능
 */
interface Scheduler {
	public void getNextCall();
	public void sendCallToAgent();
}

//1. 순서대로 배분
class RoundRobin implements Scheduler {
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}
}

//2. 짧은 대기열 먼저 배분
class LeastJob implements Scheduler {
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}
	public void sendCallToAgent() {
		System.out.println("현재 상담업무가 없거나 대기가 가장 적은 상담원에게 할당합니다.");
	}
}

//3. 우선순위에 따라 배분하기
class PriorityAllocation implements Scheduler {
	public void getNextCall() {
		System.out.println("고객등급이 높은 고객의 전화를 먼저 가져옵니다.");
	}
	public void sendCallToAgent() {
		System.out.println("업무 skill 값이 높은 상담원에게 우선적으로 배분합니다.");
	}
}

public class Page322 {
	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당 ");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");
		
		int ch = System.in.read();	//할당 방식을 입력받아 ch변수에 대입
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}
		else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation(); 
		}
		else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
	}
}
