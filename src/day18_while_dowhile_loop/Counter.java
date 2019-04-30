package day18_while_dowhile_loop;

public class Counter {
	public static void main(String[] args) throws InterruptedException {
		int num = 1;
		while (num<=10) {
			System.out.print(num+", ");
			num++;
			Thread.sleep(500); //pauses the execution for a second //receives milliseconds 1000= 1 minute
		}
		
		System.out.println("\n");
		int num2= 11;
		
		while(num2 >=1) {
			System.out.print(num2+", ");
			num2--;
			Thread.sleep(333);
		}
		System.out.println(num2);
	}

}
