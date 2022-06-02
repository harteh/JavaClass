package review;

import java.util.HashSet;

class Student446 {
	String name;	String id;
	
	Student446(String id, String name) {
		this.id=id;		this.name=name;
	}
	
	@Override
	public String toString() {
		return id+":"+name;
	}
	
	@Override
	//객체의 해시코드값을 가져온다
	public int hashCode() {
		return Integer.parseInt(id);	//문자열을 int로 변경
	}
	
	@Override
	public boolean equals(Object obj) {
		Student446 std = (Student446)obj;
		if(std.id == id) {
			//매개변수로 받은 id와 자신의 id가 같으면 true를 반환한다.
			return true;
		}
		else {
			return false;
		}
	}
	
}

public class Review0602C {
	public static void main(String[] args) {

		HashSet<Student446> set = new HashSet<Student446>();
		set.add(new Student446("100", "홍길동"));
		set.add(new Student446("200", "강감찬"));
		set.add(new Student446("300", "이순신"));
		set.add(new Student446("400", "정약용"));
		set.add(new Student446("100", "송중기"));
		
		System.out.println(set);	//집합 형태로 출력됨
	}
}
