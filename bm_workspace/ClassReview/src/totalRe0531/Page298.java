package totalRe0531;
//p.298 ~ 304

//PlayerLevel 추상 클래스
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

//Player 클래스
class Player {
	private PlayerLevel level;	//Player가 가지는 level 변수 선언
	
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

//초보자레벨 클래스: 천천히 달릴수만 있고 점프, 턴 불가
class BeginnerLevel extends PlayerLevel {
	public void run() { System.out.println("천천히 달린다 "); }
	public void jump() { System.out.println("Jump 불가 "); }
	public void turn() { System.out.println("turn 불가 "); }
	public void showLevelMessage() {
		System.out.println("***** 초보자 레벨입니다. ***** "); 
	}
}

//중급자레벨 클래스: 빠르게 달리고 높이 점프 가능, 턴 불가
class AdvancedLevel extends PlayerLevel {
	public void run() { System.out.println("빠르게 달린다 "); }
	public void jump() { System.out.println("높이 Jump 합니다. "); }
	public void turn() { System.out.println("turn 불가 "); }
	public void showLevelMessage() {
		System.out.println("***** 중급자 레벨입니다. ***** "); 
	}
}

//고급자레벨 클래스: 아주 빠르게 달리고,아주 높이 점프 가능, 턴 1회
class SuperLevel extends PlayerLevel {
	public void run() { System.out.println("아주 빠르게 달린다 "); }
	public void jump() { System.out.println("아주 높이 Jump 한다 "); }
	public void turn() { System.out.println("turn 1회 한다 "); }
	public void showLevelMessage() {
		System.out.println("***** 고급자 레벨입니다. ***** "); 
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
