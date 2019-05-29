package day50_inheritance03;

public class SoundsOfJungle {
	public static void main(String[] args) {
		Animal an = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Duck duck = new Duck();
		
		duck.speak();
		an.speak();
		cat.speak();
		dog.speak();
		
		duck.move(11);
		an.move(9);
		cat.move(3);
		dog.move(5);
	}
}
