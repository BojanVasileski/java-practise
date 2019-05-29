package day42_customClassess_encaptulation;
import java.util.*;
public class StringShoesToObject {
	public static void main(String[] args) {
		String data  = "Bruno Magli,9.5";
		Scanner scan = new Scanner(System.in);
		
		Shoes shoe = new Shoes();
		
		shoe.brand = data.substring(0, data.indexOf(","));
		
		String size1 = data.substring( data.indexOf(",")+1);
		double size2= Double.parseDouble(size1);
		shoe.size = size2;
		System.out.println(shoe.getShoesData());
		System.out.println("*************************************************************");
		System.out.println("What shoes brand?");
		String brand = scan.next();
		System.out.println("Whats your size?");
		double size333 = scan.nextDouble();
		
		Shoes newShoes = new Shoes();
		newShoes.setShoesData(brand, size333);
		System.out.println(newShoes.getShoesData());
	}
}
