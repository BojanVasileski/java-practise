package day28_multidimensionalArrays;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
public class FastFoodRestorants {
public static void main(String[] args) throws IOException {
	//read all data and assign to array
	String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
	
	System.out.println("Data size: "+ data.length);
	//print each restorant information in separate lines
	
	for(int i = 0;i<=data.length-1;i++) {
		System.out.println("#"+i+"==>"+data[i]);
		
	}
	
	System.out.println("*******************************************************************************************");
	System.out.println(data[0]);
	System.out.println(data[data.length-1]);
	System.out.println("*******************************************************************************************");
	//Print all restaurants information in state of va
	int counter = 0;
	for(int i = 0;i<=data.length-1;i++) {
		if(data[i].contains(",VA,")) {
		System.out.println("#"+i+"==>"+data[i]);
		counter++;
		}
	}
	System.out.println("There are "+counter+ " fastfood restaurants in Virginia");
	System.out.println();
	System.out.println("*******************************************************************************************");
	//print all restaurant names along with city name
	for(int i = 0;i<=data.length-1;i++) {
		if(data[i].contains(",VA,")) {
	String [] city = data[i].split(",");
	System.out.println(city[1]+" , "+city[2]);
		}
	}
}
}
