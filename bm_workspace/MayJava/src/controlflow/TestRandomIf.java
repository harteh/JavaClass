package controlflow;

public class TestRandomIf {

	public static void main(String[] args) {

		 //81~100�� ����
		  int score=(int)(Math.random()*20)+81;
		  System.out.println(score);
		  String grade;	//��������(���ڿ�)
		
		if (score>=90) {
			if (score >=95) {
				grade="A+";
			} else {
				grade="A";
			}
		} else {
			if(score>=85) {
				grade="B+";
			} else { //;90�̸� �̸鼭 85�̸�
				grade="B";
			}
		}
		System.out.println(grade);
	}

}
