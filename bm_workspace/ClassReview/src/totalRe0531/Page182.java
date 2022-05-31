package totalRe0531;

//p.182, 183
class Student182 {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName=name;
	}
	
}
public class Page182 {
	public static void main(String[] args) {

		Student182 studentLee = new Student182();
		studentLee.setStudentName("이지원");
		
		System.out.println(studentLee.serialNum);	//1000
		studentLee.serialNum++;	//1001
		
		Student182 studentSon = new Student182();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);	//1001
		System.out.println(studentLee.serialNum);	//1001
	}
}
