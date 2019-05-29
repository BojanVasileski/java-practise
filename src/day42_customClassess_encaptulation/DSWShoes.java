package day42_customClassess_encaptulation;
import java.util.*;
public class DSWShoes {
	public static void main(String[] args) {
		Shoes shoes1 = new Shoes();
		shoes1.setShoesData("ALDO", 6.5);
		
		
		Shoes shoes2 = new Shoes();
		shoes2.setShoesData("NIKE", 6.7);
		
		Shoes shoes3 = new Shoes();
		shoes3.setShoesData("POLO", 7.5);
		
		Shoes [] shoesArray = new Shoes[3];
		shoesArray[0]=shoes1;
		shoesArray[1]=shoes2;
		shoesArray[2]=shoes3;
		
		System.out.println(shoesArray[0].getShoesData());
		System.out.println(shoesArray[1].getShoesData());
		System.out.println(shoesArray[2].getShoesData());
		
		System.out.println(shoesArray[0].brand);
		System.out.println(shoesArray[1].brand);
		System.out.println(shoesArray[2].brand);
		
		//ArrayList shoes
		ArrayList<Shoes> myShoes = new ArrayList<>();
		
		myShoes.add(shoes1);
		myShoes.add(shoes2);
		myShoes.add(shoes3);
		
		System.out.println(myShoes.get(0).getShoesData());
		System.out.println(myShoes.get(1).getShoesData());
		System.out.println(myShoes.get(2).getShoesData());
		
		Shoes redShoes = myShoes.get(1);
		System.out.println(redShoes.getShoesData());
		
		
		for(Shoes shoes : myShoes) {
			System.out.println(shoes.getShoesData());
		}
		//print name of shoes in the list that siize is more than 8
		System.out.println("*************************************************");
		for(Shoes shoe : myShoes) {
			if(shoe.size>7) {
				System.out.println(shoe.brand);
			}
			
		}
		
		
		
		
		
		
		
	}
}
