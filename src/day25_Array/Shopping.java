package day25_Array;

public class Shopping {
public static void main(String[] args) {
	String[]products= {"Timberland Shoes","H&M Shirt","Swatch Watch Watch","Gucci Bag","Addidas Socks"};
	
	double[] prices = {120.0,5.99,150.5,3000.5,6.99};
	
	int [] itemsId= {12345,42341,41321,41551,12341};
	
	System.out.println(products.length);
	System.out.println("*********************************************************************");
	
	for(String p:products) {
		System.out.println(p);
	}
	
	System.out.println("*********************************************************************");
	
	for(int i = itemsId.length-1; i>=0; i--) {
		System.out.println(itemsId[i]);
	}
	System.out.println("*********************************************************************");
	//check if product prices and items have same count

		if(products.length == prices.length && itemsId.length == prices.length) {
		for(int i = 0; i<=itemsId.length-1;i++) {
			System.out.println("Item "+ (i+1) +": " + products[i] + ", Item "+ (i+1) +" Price: $" + prices[i] + ", Item "+ (i+1) +" ID: " + itemsId[i]);
		}
		}else {
			System.out.println("Something is wrong with this list");
		}
		
		
		
		double totalPrice = 0;
		System.out.println();
		for(int i = 0; i<=prices.length-1;i++) {
			totalPrice+= prices[i];
		}
		System.out.println("Total Price: $" + totalPrice);
		System.out.println("*********************************************************************");
		
		//find the most expensive item in your list and print it as report          чек дис аут!!!!!!!!!!!!!!!!!!!
		double maxPrice = 0;
		int maxIndex = 0;
		for(int i = 0;i<= prices.length-1;i++) {
			if(prices[i]>maxPrice) {
				maxPrice = prices[i];
				maxIndex = i;
			}else {
				maxPrice= maxPrice;
			}
		}
		
		System.out.println(itemsId[maxIndex]+" - "+products[maxIndex]+" - $"+maxPrice);
		
		
		
		
		
		
	
}
}
