package day25_Array;

public class Population {
public static void main(String[] args) {
	
	int[]population = {5000,10000,7000,4455,8907};
	//if value is not assigned to a array the value is automatically 0
	
	System.out.println(population[0]);
	
	
	int idx = 0;
	System.out.println("City population: " +population[idx] );
	idx++;
	System.out.println("City population: " +population[idx] );
	
	String str = "abc";
	System.out.println("City STR.LENGTH() population: " +population[str.length()] );
	
	
	String[]cities = {"Miami","London", "Tokyo","Rome","New York"};
	
	System.out.println("******************************************************");
	
	for(int i = 0; i<=population.length-1;i++) {
	System.out.println("Population of "+cities[i]+" is "+population[i]);
	}
	
	
}
}
