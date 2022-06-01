package totalRe0531;

import java.io.IOException;

/*
 * p.322-325
 * �����ͷ� ��ȭ�� ���� ��⿭�� �����
 * ������ �����Ǳ� ������ ������.
 * �� ��ȭ�� �������� ���
 * 	1. ������� ����ϱ�: ��� ���� ���� ���Ǽ� ó��
 * 	2. ª�� ��⿭ ã�� ���: ��������ʴ� �����̳� ���� ª�� ��⿭�� ������ ���� ���
 *  3. �켱���� ���: �� ��޿� ���� ��� ���� ���� �켱, ���� �ɷ��� ���� �������� �켱���
 */  
 /*  �������̽�
 *  	- ���� ��ȭ�� �������� ���
 *  	- �������� ��ȭ ����ϴ� ���
 */
interface Scheduler {
	public void getNextCall();
	public void sendCallToAgent();
}

//1. ������� ���
class RoundRobin implements Scheduler {
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}
	public void sendCallToAgent() {
		System.out.println("���� ���� �������� ����մϴ�.");
	}
}

//2. ª�� ��⿭ ���� ���
class LeastJob implements Scheduler {
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}
	public void sendCallToAgent() {
		System.out.println("���� �������� ���ų� ��Ⱑ ���� ���� �������� �Ҵ��մϴ�.");
	}
}

//3. �켱������ ���� ����ϱ�
class PriorityAllocation implements Scheduler {
	public void getNextCall() {
		System.out.println("������� ���� ���� ��ȭ�� ���� �����ɴϴ�.");
	}
	public void sendCallToAgent() {
		System.out.println("���� skill ���� ���� �������� �켱������ ����մϴ�.");
	}
}

public class Page322 {
	public static void main(String[] args) throws IOException {
		System.out.println("��ȭ ��� �Ҵ� ����� �����ϼ���.");
		System.out.println("R : �Ѹ� ���ʷ� �Ҵ� ");
		System.out.println("L : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
		System.out.println("P : �켱������ ���� �� ���� �Ҵ�");
		
		int ch = System.in.read();	//�Ҵ� ����� �Է¹޾� ch������ ����
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
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
	}
}
