package arraypart;

import java.util.ArrayList;

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

		/*
		Dog[] dogArray = new Dog[5];
		
		dogArray[0] = new Dog("È£µÎ", "¸»Æ¼Áî");
		dogArray[1] = new Dog("¼ØÀÌ", "Áøµ¾°³");
		dogArray[2] = new Dog("Àç·ÕÀÌ", "»ð»ì°³");
		dogArray[3] = new Dog("Âý½Ò", "»þ¸ð¿¡µå");
		dogArray[4] = new Dog("ÅºÀÌ", "½Ã¹Ù°ß");
		
		for(int i =0; i<dogArray.length; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		for(Dog d : dogArray) {
			System.out.println(d.showDogInfo());
		}
		*/
		
		//p.230 Q5
		ArrayList<Dog> dog = 
				new ArrayList<Dog>();
		
		dog.add(new Dog("È£µÎ", "¸»Æ¼Áî"));
		dog.add(new Dog("¼ØÀÌ", "Áøµ¾°³"));
		dog.add(new Dog("Àç·ÕÀÌ", "»ð»ì°³"));
		dog.add(new Dog("Âý½Ò", "»þ¸ð¿¡µå"));
		dog.add(new Dog("ÅºÀÌ", "½Ã¹Ù°ß"));
		
		for(int i=0; i<dog.size(); i++) {
			Dog d2 = dog.get(i);
			System.out.println( d2.showDogInfo() );
		}
		
	}
}
