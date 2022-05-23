package arraypart;

//p.230 Q4
class Dog {
	private String name;
	private String type;
	
	Dog(String name, String type){
		this.name = name;
		this.type = type;
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getType() {
		return type;
	}
	void setType(String type) {
		this.type = type;
	}
	
	String showDogInfo() {
		return name +", "+ type;
	}
	
}
public class Array06DogTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
