package totalRe0531;
//p.298 ~ 304

//PlayerLevel �߻� Ŭ����
abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
	}
}

//Player Ŭ����
class Player {
	private PlayerLevel level;	//Player�� ������ level ���� ����
	
	public Player(){
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	public void upgradeLevel(PlayerLevel level) {
		this.level=level;
		level.showLevelMessage();
	}
	public void play(int count) {
		level.go(count);
	}
}

//�ʺ��ڷ��� Ŭ����: õõ�� �޸����� �ְ� ����, �� �Ұ�
class BeginnerLevel extends PlayerLevel {
	public void run() { System.out.println("õõ�� �޸��� "); }
	public void jump() { System.out.println("Jump �Ұ� "); }
	public void turn() { System.out.println("turn �Ұ� "); }
	public void showLevelMessage() {
		System.out.println("***** �ʺ��� �����Դϴ�. ***** "); 
	}
}

//�߱��ڷ��� Ŭ����: ������ �޸��� ���� ���� ����, �� �Ұ�
class AdvancedLevel extends PlayerLevel {
	public void run() { System.out.println("������ �޸��� "); }
	public void jump() { System.out.println("���� Jump �մϴ�. "); }
	public void turn() { System.out.println("turn �Ұ� "); }
	public void showLevelMessage() {
		System.out.println("***** �߱��� �����Դϴ�. ***** "); 
	}
}

//����ڷ��� Ŭ����: ���� ������ �޸���,���� ���� ���� ����, �� 1ȸ
class SuperLevel extends PlayerLevel {
	public void run() { System.out.println("���� ������ �޸��� "); }
	public void jump() { System.out.println("���� ���� Jump �Ѵ� "); }
	public void turn() { System.out.println("turn 1ȸ �Ѵ� "); }
	public void showLevelMessage() {
		System.out.println("***** ����� �����Դϴ�. ***** "); 
	}
}

public class Page298 {
	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}
}
