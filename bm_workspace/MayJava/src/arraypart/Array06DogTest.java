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

		Dog[] dogArray = new Dog[5];
		
		dogArray[0] = new Dog("ȣ��", "��Ƽ��");
		dogArray[1] = new Dog("����", "������");
		dogArray[2] = new Dog("�����", "��찳");
		dogArray[3] = new Dog("����", "���𿡵�");
		dogArray[4] = new Dog("ź��", "�ùٰ�");
		
		for(int i =0; i<dogArray.length; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		for(Dog d : dogArray) {
			System.out.println(d.showDogInfo());
		}
	}
}
