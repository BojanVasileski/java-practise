package day46_static_keyword;

public class Email {
	public static void main(String[] args) {
		Costumer cm1 = new Costumer("Bojan","bojan@gmail.com");
		Costumer cm2 = new Costumer("Baze","baze@yahoo.com");
		Costumer cm3 = new Costumer("Pasha","pavel@hotmail.com");
		
		
		System.out.println(cm2.costumerCount);
		System.out.println(Costumer.costumerCount);
		
		Costumer cm4  = new Costumer("Burak", "burak@yahoo.comCostumer cm1 = new Costumer();");
		System.out.println("Total costumers: "+Costumer.costumerCount);
		
		cm2.costumerCount = 10;
		System.out.println(cm2.costumerCount);
		System.out.println(cm3.costumerCount);
		String love = "Hey IntelliJ, pleased to mee you :)";
		System.out.println(love);
	}
}
