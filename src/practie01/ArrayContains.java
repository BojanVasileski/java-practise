package practie01;

public class ArrayContains {
public static void main(String[] args) {
	int [] arr1 = {5,22};
	int [] arr2 = {20,5,22,4,7};
	
	//check if all items in arr1 are present in arr2
	boolean containsAll = false;
	int count = 0;
	for(int n1:arr1) {
		
		
		for(int n2:arr2) {
			if(n1==n2) {
				count++;
			}
		}
	}
	if (count >= 2) {
		containsAll = true;
	}
	System.out.println(containsAll);
}
}
