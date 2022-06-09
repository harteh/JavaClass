package pageReview0610;

import java.util.HashMap;

class Car {
	String name;
	Car(){}
	Car(String name){
		this.name = name;
	}
}

class CarFactory {

	static CarFactory instance = new CarFactory();
	HashMap<String, Car> h =
			new HashMap<>();
	
	CarFactory() {}
	static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	Car createCar(String name) {
		if(h.containsKey(name)) {
			return h.get(name);
		}
		Car car = new Car();
		h.put(name, car);
		return car;
	}
}

public class Page447 {
	public static void main(String[] args) {
		// Q6
		CarFactory factory = CarFactory.getInstance();
		Car sonata1 = factory.createCar("연수 차");
		Car sonata2 = factory.createCar("연수 차");
		System.out.println(sonata1 == sonata2);	//true
		
		Car avante1 = factory.createCar("승연 차");
		Car avante2 = factory.createCar("승연 차");
		System.out.println(avante1 == avante2); //true
		
		System.out.println(sonata1 == avante1); //false
	}
}
