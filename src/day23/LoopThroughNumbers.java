
package day23;

public class LoopThroughNumbers {
public static void main(String[] args) {
	//loop trhough numbers from 1 to 50
	//print each number in same line
//if number is divisible by 5 (n%5==0), skip it
	//if number is divisible by 20, then exit the loop
	int num=0;
	for(int i = 0; i<=50;i++) {
		num++;
		if(num%5==0) {
			continue;
		}else if(num%21==0) {
			break;
		}
		System.out.print(num+", ");
	}
	
}
}
