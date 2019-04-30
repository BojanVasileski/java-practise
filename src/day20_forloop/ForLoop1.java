package day20_forloop;

public class ForLoop1 {
public static void main(String[] args) throws InterruptedException {
	//using for loop pring "Love Java!" 10 times
	
	
	for(int i=1;i<=10;i++) {
		System.out.println(i+". Love Java!");
		Thread.sleep(3);
	}
	
	
	for(int i=5; i<=15; i++) {
		System.out.println(i);
	}
	
	for(int n = 20; n>=10; n--) {
		System.out.print(n+" ");
	}
}
}
