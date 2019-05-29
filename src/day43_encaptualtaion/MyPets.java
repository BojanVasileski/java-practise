package day43_encaptualtaion;

public class MyPets {
public static void main(String[] args) {
	Pet pet1 = new Pet("Dog","Poochi");
	Pet pet2 = new Pet("cat","Barshik");
	Pet pet3 = new Pet("cat","Mila");
	Pet pet4 = new Pet("Fish","Purple");
	Pet pet5 = new Pet("goat","kozy");
	Pet pet7 = new Pet("bird","mina");
	
	pet1.speak();
	pet2.speak();
	pet3.speak();
	pet4.speak();
	pet5.speak();
	pet7.speak();
	
	System.out.println(pet1.toString());
	System.out.println(pet2.toString());
	System.out.println(pet3.toString());
	System.out.println(pet4.toString());
	System.out.println(pet5.toString());
	System.out.println(pet7.toString());
}
}
