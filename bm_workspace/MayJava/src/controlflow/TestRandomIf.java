package controlflow;

public class TestRandomIf {

	public static void main(String[] args) {

		 //81~100점 사이
		  int score=(int)(Math.random()*20)+81;
		  System.out.println(score);
		  String grade;	//변수선언(문자열)
		
		if (score>=90) {
			if (score >=95) {
				grade="A+";
			} else {
				grade="A";
			}
		} else {
			if(score>=85) {
				grade="B+";
			} else { //;90미만 이면서 85미만
				grade="B";
			}
		}
		System.out.println(grade);
	}

}
