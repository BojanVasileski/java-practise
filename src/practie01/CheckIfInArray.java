package practie01;

public class CheckIfInArray {
public static void main(String[] args) {
	int n = 5;
	int nums[] = {22,33,44,55,22,11,90};
	boolean present = false;
	for(int num:nums) {
		if(num==n) {
			present=true;
			break;
		}
	}
	
	System.out.println("Is "+n+" present? - "+present);
	
	
	
}


}
