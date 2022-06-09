package pageReview0610;

import java.util.HashSet;

//p.446~447
class Student {
	String id;
	String name;
	
	Student(String id, String name){
		this.id=id;		this.name=name;
	}
	
	public String toString() {
		return id+":"+name;
	}
	
	public int hashCode() {
		return Integer.parseInt(id);
	}
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		if(this.id == s.id) {
			return true;
		}
		return false;
	}
}

public class Page446 {
	public static void main(String[] args) {
		// Q5
		HashSet<Student> set = new HashSet<Student>();
		set.add(new Student("100", "홍길동"));
		set.add(new Student("200", "강감찬"));
		set.add(new Student("300", "이순신"));
		set.add(new Student("400", "정약용"));
		set.add(new Student("100", "송중기"));
		
		System.out.println(set);

	}
}
