package day24_arrays;

public class Cities {
public static void main(String[] args) {
	String[] cities = {"Washington D.C.","Kyiv","Annandale","Moscow","Istanbul","Baku","Miami","Silver Spring","McLean" };
	System.out.println(cities.length);
	
	
	
	//print all cities that start with M
	
	for(int i = 0;i<cities.length;i++ ) {
		if(cities[i].startsWith("M")) {
			System.out.println(cities[i]);
		}
	}
	
	System.out.println("***************************************************");
	
	for(String city: cities) {
		System.out.println(city);
}
}
}
