package day49_inheritance;

public class ZooFari {
	public static void main(String[] args) {
		Leopard leo = new Leopard();
		System.out.println("*********************************************");
		Leopard mace = new Leopard("Mace");
		System.out.println(mace.getType());
		
	}
}
