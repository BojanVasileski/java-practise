package day53_inheritance06;

public class Cities {

	public static void main(String[] args) {
		City baku = new City(123, "Baku");
		System.out.println(baku);
		
		City istanbul = new City(444,"Istanbul");
		City anotherCity = new City(444,"Istanbul");
		
		if(istanbul.equals(anotherCity)) {
			System.out.println("Both are Istanbul");
		}else {
			System.out.println("Not equal");
		}
		
		System.out.println(baku.hashCode());
		System.out.println(istanbul.hashCode());
		System.out.println(anotherCity.hashCode());
		
		Capital cap = new Capital(101,"Washington D.C.", 800_000l);
		
		
	}
}
